import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.jupiter

@TestInstance(TestInstance.Lifecycle.Per_Class)
@TestMethodOder(MethodOrder.OrderAnnotation.class)

public class BaseTest {
    WebDriver driver;
    @BeforeAll
    public void setUp(){
        WebDriverMenager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.kitapyurdu.com/");
        driver.manage().window().maximize();


    }
    /*@AfterAll

    public void tearDown(){
        driver.quit();

    } */



}
