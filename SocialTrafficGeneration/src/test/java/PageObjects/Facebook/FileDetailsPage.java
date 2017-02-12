package PageObjects.Facebook;

import PageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Begüm on 02/02/2017.
 */
public class FileDetailsPage extends Page {
    public FileDetailsPage(WebDriver driver) { super(driver);
    }
    @FindBy(id = "com.facebook.katana:id/composer_status_text")
    private WebElement setTitle ;
    @FindBy(id = "com.facebook.katana:id/primary_named_button")
    private WebElement postFile ;

    public void setTitle(String title) {
        setTitle.sendKeys(title);
    }
    public void postFile() {
        postFile.click();
    }
}
