package PageObjects.Facebook;

import PageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Begüm on 29/01/2017.
 */
public class MainPage extends Page
{
    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "com.facebook.katana:id/feed_composer_photo_button")
    private WebElement photo;

    public void touchPicTab() {
        photo.click();
    }
}
