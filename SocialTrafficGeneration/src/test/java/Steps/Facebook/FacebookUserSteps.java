package Steps.Facebook;


import PageObjects.Facebook.CameraPage;
import PageObjects.Facebook.FileDetailsPage;
import PageObjects.Facebook.LoginPage;
import PageObjects.Facebook.MainPage;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Begüm on 28/01/2017.
 */
public class FacebookUserSteps {

    LoginPage loginPage;
    MainPage mainPage;
    CameraPage cameraPage;
    FileDetailsPage fileDetailsPage;
    public FacebookUserSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        cameraPage = new CameraPage(driver);
        fileDetailsPage = new FileDetailsPage(driver);
    }

    @Step
    public void login(String username, String password) throws InterruptedException {
        loginPage.login(username, password);
    }
    @Step
    public void touchPicturesTab() {
        mainPage.touchPicTab();
    }
    @Step
    public void openTheCameraTab() {
        cameraPage.openCam();
    }
    @Step
    public void takePicture() throws  InterruptedException{
        cameraPage.takePic();
    }
    @Step
    public void acceptThePhoto() {
        cameraPage.acceptPic();
    }
    @Step
    public void setTitle(String title) {
        fileDetailsPage.setTitle(title);
    }
    @Step
    public void postFile() {
        fileDetailsPage.postFile();
    }
    @Step
    public void checkFileUploaded() {
    }
}
