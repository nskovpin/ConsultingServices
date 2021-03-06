
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ModernCRMInterface", targetNamespace = "urn:gf-crmoperations:interface")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ModernCRMInterface {


    /**
     * 
     * @param request
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.crm.CreateCaseResponse
     * @throws IllegalUsageException_Exception
     * @throws InternalSystemErrorException_Exception
     */
    @WebMethod(operationName = "CreateCase")
    @WebResult(name = "createCaseResponse", targetNamespace = "urn:gf-crmoperations:types", partName = "result")
    public CreateCaseResponse createCase(
        @WebParam(name = "createCase", targetNamespace = "urn:gf-crmoperations:types", partName = "request")
        CreateCase request)
        throws IllegalUsageException_Exception, InternalSystemErrorException_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.crm.UpdateCaseResponse
     * @throws DataNotFoundException_Exception
     * @throws InternalSystemErrorException_Exception
     * @throws IllegalUsageException_Exception
     */
    @WebMethod(operationName = "UpdateCase")
    @WebResult(name = "updateCaseResponse", targetNamespace = "urn:gf-crmoperations:types", partName = "result")
    public UpdateCaseResponse updateCase(
        @WebParam(name = "updateCase", targetNamespace = "urn:gf-crmoperations:types", partName = "request")
        UpdateCase request)
        throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.crm.CloseCaseResponse
     * @throws DataNotFoundException_Exception
     * @throws InternalSystemErrorException_Exception
     * @throws IllegalUsageException_Exception
     */
    @WebMethod(operationName = "CloseCase")
    @WebResult(name = "closeCaseResponse", targetNamespace = "urn:gf-crmoperations:types", partName = "result")
    public CloseCaseResponse closeCase(
        @WebParam(name = "closeCase", targetNamespace = "urn:gf-crmoperations:types", partName = "request")
        CloseCase request)
        throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.crm.CreateInteractionResponse
     * @throws IllegalUsageException_Exception
     * @throws InternalSystemErrorException_Exception
     */
    @WebMethod(operationName = "CreateInteraction")
    @WebResult(name = "createInteractionResponse", targetNamespace = "urn:gf-crmoperations:types", partName = "result")
    public CreateInteractionResponse createInteraction(
        @WebParam(name = "createInteraction", targetNamespace = "urn:gf-crmoperations:types", partName = "request")
        CreateInteraction request)
        throws IllegalUsageException_Exception, InternalSystemErrorException_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.crm.SearchClientResponse
     * @throws DataNotFoundException_Exception
     * @throws IllegalUsageException_Exception
     * @throws InternalSystemErrorException_Exception
     */
    @WebMethod(operationName = "SearchClient")
    @WebResult(name = "searchClientResponse", targetNamespace = "urn:gf-crmoperations:types", partName = "result")
    public SearchClientResponse searchClient(
        @WebParam(name = "searchClient", targetNamespace = "urn:gf-crmoperations:types", partName = "request")
        SearchClient request)
        throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.crm.CreateClientResponse
     * @throws InternalSystemErrorException_Exception
     * @throws IllegalUsageException_Exception
     */
    @WebMethod(operationName = "CreateClient")
    @WebResult(name = "createClientResponse", targetNamespace = "urn:gf-crmoperations:types", partName = "result")
    public CreateClientResponse createClient(
        @WebParam(name = "createClient", targetNamespace = "urn:gf-crmoperations:types", partName = "request")
        CreateClient request)
        throws IllegalUsageException_Exception, InternalSystemErrorException_Exception
    ;

}
