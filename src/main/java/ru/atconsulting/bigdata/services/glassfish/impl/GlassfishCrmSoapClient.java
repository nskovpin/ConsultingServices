package ru.atconsulting.bigdata.services.glassfish.impl;

import ru.atconsulting.bigdata.services.ClientProperties;
import ru.atconsulting.bigdata.services.ServiceClient;
import ru.atconsulting.bigdata.services.ServicesNames;
import ru.atconsulting.bigdata.services.glassfish.crm.*;
import ru.atconsulting.bigdata.services.glassfish.sis.*;

import javax.xml.bind.JAXBException;
import javax.xml.ws.BindingProvider;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by NSkovpin on 11.07.2016.
 */
public class GlassfishCrmSoapClient implements ServiceClient{

    private ClientProperties clientProperties;

    public ClientProperties getClientProperties() {
        return clientProperties;
    }

    public void setClientProperties(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    public CreateInteractionResponse getInteractionResponse(String ctn, String glassfishName,
                                      String glassfishPassword, String url) throws ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception {

        CRMOperationsSOAPService crmOperationsSOAPService = new CRMOperationsSOAPService();
        ModernCRMInterface modernCRMInterface = crmOperationsSOAPService.getModernCRMInterfaceBindingPort();

        CreateInteraction createInteraction = new CreateInteraction();
        CreateInteractionRequest createInteractionRequest = new CreateInteractionRequest();
        createInteractionRequest.setDirection(new BigInteger("1"));
        createInteraction.setCreateInteractionRequest(createInteractionRequest);

        setProperCredentialsAndUrl((BindingProvider) modernCRMInterface,
                glassfishName, glassfishPassword, url);

        CreateInteractionResponse createInteractionResponse = modernCRMInterface.createInteraction(createInteraction);
        return createInteractionResponse;
    }


    public CreateInteractionResponse getLastInteractions(String ctn, String glassfishName,
                                                            String glassfishPassword, String url) throws ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception {

        return null;
    }

    public Object getServiceResult(ServicesNames service, ClientProperties properties) throws JAXBException, ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception {
        GlassfishServices glassfishServices = GlassfishServices.valueOf(service.getServiceName());
        Object result = null;

        String name = properties.getProperty(GlassfishParams.name.name());
        String password = properties.getProperty(GlassfishParams.password.name());
        String url = properties.getProperty(GlassfishParams.url.name());
        String ctn = properties.getProperty(GlassfishParams.ctn.name());
        List<String> paramLists = properties.getAdditionalParams();

        switch (glassfishServices) {
            case CreateInteraction:
                result = getInteractionResponse(name, password, url, ctn);
                break;
        }
        return result;
    }

    private void setProperCredentialsAndUrl(BindingProvider bindingProvider, String glassfishName,
                                            String glassfishPassword, String url) {
        bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, glassfishName);
        bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, glassfishPassword);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
    }


}
