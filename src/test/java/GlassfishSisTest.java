import org.junit.Test;
import ru.atconsulting.bigdata.services.ServiceClient;
import ru.atconsulting.bigdata.services.glassfish.crm.IllegalUsageException_Exception;
import ru.atconsulting.bigdata.services.glassfish.crm.InternalSystemErrorException_Exception;
import ru.atconsulting.bigdata.services.glassfish.sis.Corebalance;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;
import ru.atconsulting.bigdata.services.glassfish.impl.GlassfishClientProperties;
import ru.atconsulting.bigdata.services.glassfish.impl.GlassfishParams;
import ru.atconsulting.bigdata.services.glassfish.impl.GlassfishServices;
import ru.atconsulting.bigdata.services.glassfish.impl.GlassfishSisSoapClient;

import javax.xml.bind.JAXBException;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by NSkovpin on 08.07.2016.
 */
public class GlassfishSisTest {


    @Test
    public void getCorebalanceTest() throws JAXBException, ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception {

        GlassfishClientProperties glassfishClientProperties = new GlassfishClientProperties();
        Properties properties = new Properties();
        properties.setProperty(GlassfishParams.name.name(), "CP");
        properties.setProperty(GlassfishParams.password.name(), "CP");
        properties.setProperty(GlassfishParams.url.name(), "http://dr-glass016:3460/SubServiceSoap/");
        properties.setProperty(GlassfishParams.ctn.name(), "9610138780");
        glassfishClientProperties.setProperties(properties);
        glassfishClientProperties.setAdditionalParams(Arrays.asList("corebalance"));

        ServiceClient glassfishSoapClient = new GlassfishSisSoapClient();

        Object response = glassfishSoapClient.getServiceResult(GlassfishServices.SubscriberCoreBalance, glassfishClientProperties);

        assert response instanceof Corebalance;
        assert ((Corebalance)response).getBalanceAmount()!=null;

    }




}
