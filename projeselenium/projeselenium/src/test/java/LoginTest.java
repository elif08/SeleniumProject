import org.junit.Test;

public class LoginTest {
    public class LoginTest extends BaseTest {

        @Test
        public void loginTest(){
            LoginPage loginPage = new LoginPage();

            loginPage.login();
        }
    }

}
