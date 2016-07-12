package ru.atconsulting.bigdata.services.glassfish.impl;


import ru.atconsulting.bigdata.services.ClientProperties;
import ru.atconsulting.bigdata.services.ServiceClient;
import ru.atconsulting.bigdata.services.ServicesNames;
import ru.atconsulting.bigdata.services.glassfish.sis.*;

import javax.xml.bind.JAXBException;
import javax.xml.ws.BindingProvider;
import java.util.List;

/**
 * Created by NSkovpin on 08.06.2016.
 */
public class GlassfishSisSoapClient implements ServiceClient {

    private ClientProperties clientProperties;

    public ClientProperties getClientProperties() {
        return clientProperties;
    }

    public void setClientProperties(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    public Corebalance getCoreBalance(String ctn, String glassfishName,
                                      String glassfishPassword, String url) throws ServiceException {
        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);
        Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
        requiredInfo.setValue(RequiredInfo.COREBALANCE);
        request.getRequiredInfo().add(requiredInfo);

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, url);
        Response response = subscribeInfo.subscribeInfo(request);
        return response.getCorebalance();
    }

    public String getType(String ctn, String glassfishName, String glassfishPassword, String url) throws ServiceException {
        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);
        Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
        requiredInfo.setValue(RequiredInfo.TYPE);
        request.getRequiredInfo().add(requiredInfo);

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, url);
        Response response = subscribeInfo.subscribeInfo(request);
        return response.getType();
    }

    public SOCs getSocs(String ctn, String glassfishName,
                        String glassfishPassword, String url) throws ServiceException {
        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);
        Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
        requiredInfo.setValue(RequiredInfo.SOC);
        requiredInfo.setExt("fast");
        request.getRequiredInfo().add(requiredInfo);

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, url);
        Response response = subscribeInfo.subscribeInfo(request);
        return response.getSOCs();
    }

    public Response getSubscriberInfoResponse(String glassfishName, String glassfishPassword, String glassfishUrl,
                                              String ctn, List<String> requiredInfoValues) throws ServiceException {
        if (ctn.isEmpty()) {
            throw new RuntimeException("Ctn is empty");
        }

        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);


        for (String requiredInfoValue : requiredInfoValues) {
            Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
            RequiredInfo requiredInfoEnumValue = RequiredInfo.fromValue(requiredInfoValue);
            requiredInfo.setValue(requiredInfoEnumValue);
            request.getRequiredInfo().add(requiredInfo);
        }

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, glassfishUrl);
        Response response = subscribeInfo.subscribeInfo(request);
        return response;
    }

    public ResponseDebt getSubscriberDebtResponse(String glassfishName, String glassfishPassword, String glassfishUrl,
                                                  String ctn, List<String> requiredInfoValues) throws ServiceException {
        if (ctn.isEmpty()) {
            throw new RuntimeException("Ctn is empty");
        }

        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        RequestDebt request = objectFactory.createRequestDebt();
        request.setCtn(ctn);

        SubscriberDebt subscriberDebt = subscriberInfoService.getSubscriberDebtBindingPort();
        setProperCredentialsAndUrl((BindingProvider) subscriberDebt,
                glassfishName, glassfishPassword, glassfishUrl);
        ResponseDebt response = subscriberDebt.subscriberDebt(request);
        return response;
    }

    public Object getServiceResult(ServicesNames service, ClientProperties properties) throws JAXBException, ServiceException {
        GlassfishServices glassfishServices = GlassfishServices.valueOf(service.getServiceName());
        Object result = null;

        String name = properties.getProperty(GlassfishParams.name.name());
        String password = properties.getProperty(GlassfishParams.password.name());
        String url = properties.getProperty(GlassfishParams.url.name());
        String ctn = properties.getProperty(GlassfishParams.ctn.name());
        List<String> paramLists = properties.getAdditionalParams();


        switch (glassfishServices) {
            case SubscribeInfoBindingPort:
                result = getSubscriberInfoResponse(name, password, url, ctn, paramLists);
                break;
            case SubscriberDebtBindingPort:
                result = getSubscriberDebtResponse(name, password, url, ctn, paramLists);
                break;
            case SubscriberCoreBalance:
                result = getCoreBalance(ctn, name, password, url);
                break;
            case SubscriberSOCs:
                result = getSocs(ctn, name, password, url);
                break;
            case SubscriberType:
                result = getType(ctn, name, password, url);
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
