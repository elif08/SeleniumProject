import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import com.testinium.driver.BaseTest;

public class TestPage extends BaseTest {


    @Test
    public void set_email(){
        page.set_email("nalbantogluelif08@gmail.com");
        Assertions.assertEquals("nalbantogluelif08@gmail.com",page.getemail(), "email value is not correct");

    }

    @Test
    public void set_password(){
        page.set_password("w5ZUd!jcpSqw4L_");
        Assertions.assertEquals("w5ZUd!jcpSqw4L_",page.getemail(), "password is not correct");


    }
}
