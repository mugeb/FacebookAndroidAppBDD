package PageObjects.Facebook;

import PageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Begüm on 02/02/2017.
 */
public class CameraPage extends Page
{
    public CameraPage(WebDriver driver) { super (driver); }

    @FindBy(id = "com.facebook.katana:id/primary_action_button")
    private WebElement camera ;
    @FindBy(id = "com.android.camera2:id/shutter_button")
    private WebElement takePic;
    @FindBy(id = "com.android.camera2:id/done_button")
    private WebElement acceptPic;

    public void openCam() {
        camera.click();
    }

    public void takePic() throws  InterruptedException{
        takePic.click();
        Thread.sleep(3000);
    }

    public void acceptPic() {
        acceptPic.click();
    }
}
