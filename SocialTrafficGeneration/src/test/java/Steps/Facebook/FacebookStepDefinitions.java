package Steps.Facebook;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Begüm on 27/01/2017.
 */
public class FacebookStepDefinitions {
    FacebookUserSteps user;
    protected static AppiumDriver driver;
    @Before
    public void setupTest(Scenario scenario) throws Throwable {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "appium");
        capabilities.setCapability("deviceName", "42beb8ee");
        capabilities.setCapability("udid", "42beb8ee");
        capabilities.setCapability("platformName", "ANDROID");

        capabilities.setCapability("appPackage", "com.facebook.katana");
        capabilities.setCapability("appActivity", "com.facebook.katana.LoginActivity");


        capabilities.setCapability("newCommandTimeout", 10000);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        user = new FacebookUserSteps(driver);
        Thread.sleep(10000);
    }

    @And("^The client opens the Facebook application$")
    public void theClientOpensTheFacebookApplication() throws Throwable {

    }

    @And("^The client logs in with ([^\"]*) and ([^\"]*)$")
    public void theClientLogsIn(String username, String password) throws Throwable {
       user.login(username, password);
    }

    @And("^The client opens the tab to upload the picture$")
    public void touchPicturesTab() throws Throwable {
        user.touchPicturesTab();
    }

    @And("^The client opens the camera tab$")
    public void openTheCameraTab() throws Throwable {
        user.openTheCameraTab();
    }

    @And("^The client takes a picture$")
    public void takePicture() throws Throwable {
        user.takePicture();
    }

    @And("^The client accepts the photo$")
    public void acceptThePhoto() throws Throwable {
        user.acceptThePhoto();
    }

    @And("^The client sets a title:([^\"]*) for the file$")
    public void setTitle(String title) throws Throwable {
        user.setTitle(title);
    }

    @And("^The client posts the file$")
    public void postFile() throws Throwable {
        user.postFile();
    }

    @Then("^The client waits till the file is successfully uploaded$")
    public void checkFileUploaded() throws Throwable {
        user.checkFileUploaded();
    }
    @After
    public void endTest(){
        //driver.quit();
    }

}
