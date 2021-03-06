package ru.atconsulting.bigdata.services.tsms.impl;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import ru.atconsulting.bigdata.services.ClientProperties;
import ru.atconsulting.bigdata.services.ServiceClient;
import ru.atconsulting.bigdata.services.ServicesNames;
import ru.atconsulting.bigdata.services.tsms.domain.ResponseTsms;
import ru.atconsulting.bigdata.services.tsms.domain.Token;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.net.URI;

/**
 * Created by NSkovpin on 08.06.2016.
 */
public class TsmsClient implements ServiceClient {

    private ClientProperties clientProperties;

    public ClientProperties getClientProperties() {
        return clientProperties;
    }

    public Token getToken(String name, String password, String url) throws JAXBException {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);

        URI uri = UriBuilder.fromUri(url)
                .queryParam(TsmsParams.output.name(), "xml")
                .queryParam(TsmsParams.action.name(), "getToken")
                .queryParam(TsmsParams.username.name(), name)
                .queryParam(TsmsParams.password.name(), password).build();


        WebResource service = client.resource(uri);

        String token = service.accept(MediaType.APPLICATION_XML).get(String.class);

        JAXBContext jaxbContext = JAXBContext.newInstance(Token.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(token);
        Token tokenObject = (Token) unmarshaller.unmarshal(reader);

        return tokenObject;
    }

    public ResponseTsms getLocation(String token, String ctn, String url) throws JAXBException {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);

        URI uri = UriBuilder.fromUri(url)
                .queryParam(TsmsParams.output.name(), "xml")
                .queryParam(TsmsParams.action.name(), "get_roamer_info")
                .queryParam(TsmsParams.msisdn.name(), ctn)
                .queryParam(TsmsParams.token.name(), token).build();

        WebResource service = client.resource(uri);

        String response = service.accept(MediaType.APPLICATION_XML).get(String.class);

        JAXBContext jaxbContext = JAXBContext.newInstance(ResponseTsms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(response);
        ResponseTsms responseTsms = (ResponseTsms) unmarshaller.unmarshal(reader);

        return responseTsms;
    }


    public Object getServiceResult(ServicesNames service, ClientProperties properties) throws JAXBException {
        if (service.getServiceName().equals(TsmsServices.TokenService.name())) {
            return getToken(properties.getProperty(TsmsParams.username.name()),
                    properties.getProperty(TsmsParams.password.name()),
                    properties.getProperty(TsmsParams.service_url.name())
            );
        } else if (service.getServiceName().equals(TsmsServices.LocationService.name())) {
            Token token = getToken(properties.getProperty(TsmsParams.username.name()),
                    properties.getProperty(TsmsParams.password.name()),
                    properties.getProperty(TsmsParams.service_url.name())
            );

            return getLocation(token.getValue(),
                    properties.getProperty(TsmsParams.ctn.name()),
                    properties.getProperty(TsmsParams.service_url.name())
            );
        }
        throw new RuntimeException();
    }



}
