package PageObjects.Facebook;

import PageObjects.Page;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Begüm on 28/01/2017.
 */
public class LoginPage extends Page
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(id = "com.facebook.katana:id/login_username")
    private WebElement username;
    @FindBy(id = "com.facebook.katana:id/login_password")
    private WebElement password;
    @FindBy(id = "com.facebook.katana:id/login_login")
    private WebElement loginButton;
    public void setUsername(String user) {
        username.sendKeys(user);
    }
    public void setPassword(String pass) {
        password.sendKeys(pass);
    }
    public void login(String email, String pass) throws InterruptedException{

        //username.clear();
        setUsername(email);
        ((AndroidDriver) this.driver).pressKeyCode(BACK_BUTTON);
        setPassword(pass);
        loginButton.click();
        Thread.sleep(10000);
    }
}
