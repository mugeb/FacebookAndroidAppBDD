package Runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = { "src/test/features/"}, tags = {"@Facebook_UploadPic"},
        glue = { "Steps" })
public class FacebookAndroidTest {}
