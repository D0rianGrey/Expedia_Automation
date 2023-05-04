package expedia.selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static utils.BaseTest.getConstantsProperties;

public class LogInTestSelenide {
    @Test
    public void logInTest() {
        open(getConstantsProperties().getProperty("URL_EXPEDIA"));
        Selenide.executeAsyncJavaScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
