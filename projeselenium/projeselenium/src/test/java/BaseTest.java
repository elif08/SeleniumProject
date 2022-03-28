import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    public WebDriver driver;
    LoginPage page;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "scr/test/resources");
        driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-extensions");

        driver.get("https://www.kitapyurdu.com/index.php?route=account/login");
        page = new LoginPage(driver);

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions.merge(desiredCapabilities);

        driver = new ChromeDriver(ChromeOptions);
        driver.manage().window().maximize();

        driver.get("https://www.kitapyurdu.com/");

    }

    @AfterAll
    public void tearDown(){
        driver.quit();

    }
}
