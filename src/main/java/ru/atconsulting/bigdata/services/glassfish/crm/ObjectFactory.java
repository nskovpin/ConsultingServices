
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.atconsulting.bigdata.client.glassfish.crm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchClientResponse_QNAME = new QName("urn:gf-crmoperations:types", "searchClientResponse");
    private final static QName _CreateClient_QNAME = new QName("urn:gf-crmoperations:types", "createClient");
    private final static QName _CreateClientResponse_QNAME = new QName("urn:gf-crmoperations:types", "createClientResponse");
    private final static QName _SearchClient_QNAME = new QName("urn:gf-crmoperations:types", "searchClient");
    private final static QName _CreateCaseResponse_QNAME = new QName("urn:gf-crmoperations:types", "createCaseResponse");
    private final static QName _UpdateCase_QNAME = new QName("urn:gf-crmoperations:types", "updateCase");
    private final static QName _CreateInteraction_QNAME = new QName("urn:gf-crmoperations:types", "createInteraction");
    private final static QName _UpdateCaseResponse_QNAME = new QName("urn:gf-crmoperations:types", "updateCaseResponse");
    private final static QName _IllegalUsageException_QNAME = new QName("urn:gf-crmoperations:types", "illegalUsageException");
    private final static QName _CreateInteractionResponse_QNAME = new QName("urn:gf-crmoperations:types", "createInteractionResponse");
    private final static QName _DataNotFoundException_QNAME = new QName("urn:gf-crmoperations:types", "dataNotFoundException");
    private final static QName _InternalSystemErrorException_QNAME = new QName("urn:gf-crmoperations:types", "internalSystemErrorException");
    private final static QName _CreateCase_QNAME = new QName("urn:gf-crmoperations:types", "createCase");
    private final static QName _CloseCase_QNAME = new QName("urn:gf-crmoperations:types", "closeCase");
    private final static QName _CloseCaseResponse_QNAME = new QName("urn:gf-crmoperations:types", "closeCaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.atconsulting.bigdata.client.glassfish.crm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InternalSystemErrorException }
     * 
     */
    public InternalSystemErrorException createInternalSystemErrorException() {
        return new InternalSystemErrorException();
    }

    /**
     * Create an instance of {@link CreateCase }
     * 
     */
    public CreateCase createCreateCase() {
        return new CreateCase();
    }

    /**
     * Create an instance of {@link CloseCase }
     * 
     */
    public CloseCase createCloseCase() {
        return new CloseCase();
    }

    /**
     * Create an instance of {@link CloseCaseResponse }
     * 
     */
    public CloseCaseResponse createCloseCaseResponse() {
        return new CloseCaseResponse();
    }

    /**
     * Create an instance of {@link IllegalUsageException }
     * 
     */
    public IllegalUsageException createIllegalUsageException() {
        return new IllegalUsageException();
    }

    /**
     * Create an instance of {@link CreateInteractionResponse }
     * 
     */
    public CreateInteractionResponse createCreateInteractionResponse() {
        return new CreateInteractionResponse();
    }

    /**
     * Create an instance of {@link UpdateCaseResponse }
     * 
     */
    public UpdateCaseResponse createUpdateCaseResponse() {
        return new UpdateCaseResponse();
    }

    /**
     * Create an instance of {@link DataNotFoundException }
     * 
     */
    public DataNotFoundException createDataNotFoundException() {
        return new DataNotFoundException();
    }

    /**
     * Create an instance of {@link CreateClientResponse }
     * 
     */
    public CreateClientResponse createCreateClientResponse() {
        return new CreateClientResponse();
    }

    /**
     * Create an instance of {@link CreateCaseResponse }
     * 
     */
    public CreateCaseResponse createCreateCaseResponse() {
        return new CreateCaseResponse();
    }

    /**
     * Create an instance of {@link UpdateCase }
     * 
     */
    public UpdateCase createUpdateCase() {
        return new UpdateCase();
    }

    /**
     * Create an instance of {@link CreateInteraction }
     * 
     */
    public CreateInteraction createCreateInteraction() {
        return new CreateInteraction();
    }

    /**
     * Create an instance of {@link SearchClient }
     * 
     */
    public SearchClient createSearchClient() {
        return new SearchClient();
    }

    /**
     * Create an instance of {@link CreateClient }
     * 
     */
    public CreateClient createCreateClient() {
        return new CreateClient();
    }

    /**
     * Create an instance of {@link SearchClientResponse }
     * 
     */
    public SearchClientResponse createSearchClientResponse() {
        return new SearchClientResponse();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link MnpInfo }
     * 
     */
    public MnpInfo createMnpInfo() {
        return new MnpInfo();
    }

    /**
     * Create an instance of {@link LogCaseNotesRequest }
     * 
     */
    public LogCaseNotesRequest createLogCaseNotesRequest() {
        return new LogCaseNotesRequest();
    }

    /**
     * Create an instance of {@link CreateCaseRequest }
     * 
     */
    public CreateCaseRequest createCreateCaseRequest() {
        return new CreateCaseRequest();
    }

    /**
     * Create an instance of {@link UpdateCaseRequest }
     * 
     */
    public UpdateCaseRequest createUpdateCaseRequest() {
        return new UpdateCaseRequest();
    }

    /**
     * Create an instance of {@link HeadquartersInfo }
     * 
     */
    public HeadquartersInfo createHeadquartersInfo() {
        return new HeadquartersInfo();
    }

    /**
     * Create an instance of {@link FlexibleAttribute }
     * 
     */
    public FlexibleAttribute createFlexibleAttribute() {
        return new FlexibleAttribute();
    }

    /**
     * Create an instance of {@link SiteIdent }
     * 
     */
    public SiteIdent createSiteIdent() {
        return new SiteIdent();
    }

    /**
     * Create an instance of {@link FinAccountIdent }
     * 
     */
    public FinAccountIdent createFinAccountIdent() {
        return new FinAccountIdent();
    }

    /**
     * Create an instance of {@link ContactIdent }
     * 
     */
    public ContactIdent createContactIdent() {
        return new ContactIdent();
    }

    /**
     * Create an instance of {@link AccountIdent }
     * 
     */
    public AccountIdent createAccountIdent() {
        return new AccountIdent();
    }

    /**
     * Create an instance of {@link WorkflowInfo }
     * 
     */
    public WorkflowInfo createWorkflowInfo() {
        return new WorkflowInfo();
    }

    /**
     * Create an instance of {@link CreateClientRequest }
     * 
     */
    public CreateClientRequest createCreateClientRequest() {
        return new CreateClientRequest();
    }

    /**
     * Create an instance of {@link CreateInteractionRequest }
     * 
     */
    public CreateInteractionRequest createCreateInteractionRequest() {
        return new CreateInteractionRequest();
    }

    /**
     * Create an instance of {@link SearchClientRequest }
     * 
     */
    public SearchClientRequest createSearchClientRequest() {
        return new SearchClientRequest();
    }

    /**
     * Create an instance of {@link CloseCaseRequest }
     * 
     */
    public CloseCaseRequest createCloseCaseRequest() {
        return new CloseCaseRequest();
    }

    /**
     * Create an instance of {@link AddAttachmentRequestContext }
     * 
     */
    public AddAttachmentRequestContext createAddAttachmentRequestContext() {
        return new AddAttachmentRequestContext();
    }

    /**
     * Create an instance of {@link PrimaryContactInfo }
     * 
     */
    public PrimaryContactInfo createPrimaryContactInfo() {
        return new PrimaryContactInfo();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link ExternalTTInfo }
     * 
     */
    public ExternalTTInfo createExternalTTInfo() {
        return new ExternalTTInfo();
    }

    /**
     * Create an instance of {@link ServiceIdent }
     * 
     */
    public ServiceIdent createServiceIdent() {
        return new ServiceIdent();
    }

    /**
     * Create an instance of {@link TopicRequest }
     * 
     */
    public TopicRequest createTopicRequest() {
        return new TopicRequest();
    }

    /**
     * Create an instance of {@link CompanyInfo }
     * 
     */
    public CompanyInfo createCompanyInfo() {
        return new CompanyInfo();
    }

    /**
     * Create an instance of {@link ActivityInfo }
     * 
     */
    public ActivityInfo createActivityInfo() {
        return new ActivityInfo();
    }

    /**
     * Create an instance of {@link NotificationInfo }
     * 
     */
    public NotificationInfo createNotificationInfo() {
        return new NotificationInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "searchClientResponse")
    public JAXBElement<SearchClientResponse> createSearchClientResponse(SearchClientResponse value) {
        return new JAXBElement<SearchClientResponse>(_SearchClientResponse_QNAME, SearchClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "createClient")
    public JAXBElement<CreateClient> createCreateClient(CreateClient value) {
        return new JAXBElement<CreateClient>(_CreateClient_QNAME, CreateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "createClientResponse")
    public JAXBElement<CreateClientResponse> createCreateClientResponse(CreateClientResponse value) {
        return new JAXBElement<CreateClientResponse>(_CreateClientResponse_QNAME, CreateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "searchClient")
    public JAXBElement<SearchClient> createSearchClient(SearchClient value) {
        return new JAXBElement<SearchClient>(_SearchClient_QNAME, SearchClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "createCaseResponse")
    public JAXBElement<CreateCaseResponse> createCreateCaseResponse(CreateCaseResponse value) {
        return new JAXBElement<CreateCaseResponse>(_CreateCaseResponse_QNAME, CreateCaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "updateCase")
    public JAXBElement<UpdateCase> createUpdateCase(UpdateCase value) {
        return new JAXBElement<UpdateCase>(_UpdateCase_QNAME, UpdateCase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInteraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "createInteraction")
    public JAXBElement<CreateInteraction> createCreateInteraction(CreateInteraction value) {
        return new JAXBElement<CreateInteraction>(_CreateInteraction_QNAME, CreateInteraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "updateCaseResponse")
    public JAXBElement<UpdateCaseResponse> createUpdateCaseResponse(UpdateCaseResponse value) {
        return new JAXBElement<UpdateCaseResponse>(_UpdateCaseResponse_QNAME, UpdateCaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalUsageException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "illegalUsageException")
    public JAXBElement<IllegalUsageException> createIllegalUsageException(IllegalUsageException value) {
        return new JAXBElement<IllegalUsageException>(_IllegalUsageException_QNAME, IllegalUsageException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInteractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "createInteractionResponse")
    public JAXBElement<CreateInteractionResponse> createCreateInteractionResponse(CreateInteractionResponse value) {
        return new JAXBElement<CreateInteractionResponse>(_CreateInteractionResponse_QNAME, CreateInteractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "dataNotFoundException")
    public JAXBElement<DataNotFoundException> createDataNotFoundException(DataNotFoundException value) {
        return new JAXBElement<DataNotFoundException>(_DataNotFoundException_QNAME, DataNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalSystemErrorException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "internalSystemErrorException")
    public JAXBElement<InternalSystemErrorException> createInternalSystemErrorException(InternalSystemErrorException value) {
        return new JAXBElement<InternalSystemErrorException>(_InternalSystemErrorException_QNAME, InternalSystemErrorException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "createCase")
    public JAXBElement<CreateCase> createCreateCase(CreateCase value) {
        return new JAXBElement<CreateCase>(_CreateCase_QNAME, CreateCase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseCase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "closeCase")
    public JAXBElement<CloseCase> createCloseCase(CloseCase value) {
        return new JAXBElement<CloseCase>(_CloseCase_QNAME, CloseCase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseCaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gf-crmoperations:types", name = "closeCaseResponse")
    public JAXBElement<CloseCaseResponse> createCloseCaseResponse(CloseCaseResponse value) {
        return new JAXBElement<CloseCaseResponse>(_CloseCaseResponse_QNAME, CloseCaseResponse.class, null, value);
    }

}
