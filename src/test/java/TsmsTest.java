import org.junit.Test;
import ru.atconsulting.bigdata.services.ServiceClient;
import ru.atconsulting.bigdata.services.glassfish.crm.IllegalUsageException_Exception;
import ru.atconsulting.bigdata.services.glassfish.crm.InternalSystemErrorException_Exception;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;
import ru.atconsulting.bigdata.services.tsms.domain.ResponseTsms;
import ru.atconsulting.bigdata.services.tsms.impl.TsmsClient;
import ru.atconsulting.bigdata.services.tsms.impl.TsmsClientProperties;
import ru.atconsulting.bigdata.services.tsms.impl.TsmsParams;
import ru.atconsulting.bigdata.services.tsms.impl.TsmsServices;

import javax.xml.bind.JAXBException;
import java.util.Properties;

/**
 * Created by NSkovpin on 08.07.2016.
 */
public class TsmsTest {


    @Test
    public void getTokenAndLocationTest() throws JAXBException, ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception {

        ServiceClient tsmsClient = new TsmsClient();

        TsmsClientProperties properties = new TsmsClientProperties();
        Properties prop = new Properties();
        prop.setProperty(TsmsParams.username.name(), "BOT");
        prop.setProperty(TsmsParams.password.name(), "123456aA");
        prop.setProperty(TsmsParams.service_url.name(), "http://192.168.151.139//smsw/apiv3.php");
        prop.setProperty(TsmsParams.ctn.name(), "7955332");
        properties.setProperties(prop);

        Object object =  tsmsClient.getServiceResult(TsmsServices.LocationService, properties);
        assert object != null;
        assert object instanceof ResponseTsms;

    }


}
