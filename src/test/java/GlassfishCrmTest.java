import org.junit.Test;
import ru.atconsulting.bigdata.services.glassfish.crm.*;

import javax.xml.ws.BindingProvider;

/**
 * Created by NSkovpin on 11.07.2016.
 */
public class GlassfishCrmTest {

    @Test
    public void createInteractionTest() throws IllegalUsageException_Exception, InternalSystemErrorException_Exception {
//        CRMOperationsSOAPService crmOperationsSOAPService = new CRMOperationsSOAPService();
//        ModernCRMInterface modernCRMInterface = crmOperationsSOAPService.getModernCRMInterfaceBindingPort();
//
//        CreateInteraction createInteraction = new CreateInteraction();
//        CreateInteractionRequest createInteractionRequest = new CreateInteractionRequest();
//        createInteractionRequest.setDirection(new BigInteger("1"));
//        createInteraction.setCreateInteractionRequest(createInteractionRequest);
//
//        setProperCredentialsAndUrl((BindingProvider) modernCRMInterface,
//                "CP", "CP", "http://ms-glass006:4466/CRMOperationsUrl");
//
//        CreateInteractionResponse createInteractionResponse = modernCRMInterface.createInteraction(createInteraction);
//        System.out.println();
    }

    private void setProperCredentialsAndUrl(BindingProvider bindingProvider, String glassfishName,
                                            String glassfishPassword, String url) {
        bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, glassfishName);
        bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, glassfishPassword);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);

    }



}
