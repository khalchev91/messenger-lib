import messages.TextMessage;
import org.junit.Before;
import org.junit.Test;
import phones.Android;
import phones.IPhone;
import phones.Phone;
import storageproviders.Google;
import storageproviders.ICloud;

public class NewMessageTest {

    private Phone iPhone;
    private Phone pixel;

    @Before
    public void setUp(){
        iPhone= new IPhone(new ICloud());
        pixel = new Android(new Google());
    }

    @Test
    public void iPhoneMessageShouldSendTest(){
        String message = "Some test message for iPhone";
        ((IPhone) iPhone).send(new TextMessage(message));
        assert(iPhone.getStorage().retrieveAll().size()>0);
    }

    @Test
    public void AndroidMessageShouldSendTest(){
        String message = "Some test message for Pixel";
        ((Android) pixel).send(new TextMessage(message));
        assert(pixel.getStorage().retrieveAll().size()>0);
    }
}
