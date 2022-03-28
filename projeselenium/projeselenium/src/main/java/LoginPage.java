import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;
    public final By email = By.id("login-email");
    public final By password = By.id("login-password");

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    public void set_email(String emailAsString){
        WebElement emailSpace = driver.findElement(email);
        emailSpace.click();
        emailSpace.sendKeys(emailAsString);

    }

    public void set_password(String passwordAsString){
        WebElement passwordSpace = driver.findElement(password);
        passwordSpace.click();
        passwordSpace.sendKeys(passwordAsString);


    }

    public String getEmail(){
        WebElement emailSpace = driver.findElement(email);
        return emailSpace.getAttribute("login-email");


    }
    public String getPassword(){
        WebElement passwordSpace = driver.findElement(password);
        return passwordSpace.getAttribute("login-password");

    }


    public void login() {
        login();
    }
}
