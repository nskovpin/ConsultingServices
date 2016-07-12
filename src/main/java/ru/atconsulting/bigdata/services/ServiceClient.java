package ru.atconsulting.bigdata.services;

import ru.atconsulting.bigdata.services.glassfish.crm.IllegalUsageException_Exception;
import ru.atconsulting.bigdata.services.glassfish.crm.InternalSystemErrorException_Exception;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;

import javax.xml.bind.JAXBException;

/**
 * Created by NSkovpin on 15.06.2016.
 */
public interface ServiceClient {


    ClientProperties getClientProperties();

    Object getServiceResult(ServicesNames service, ClientProperties properties) throws JAXBException, ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception;

}
