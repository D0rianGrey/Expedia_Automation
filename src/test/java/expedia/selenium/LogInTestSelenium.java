package expedia.selenium;

import org.junit.jupiter.api.Assertions;
import utils.BaseTestSelenium;

public class LogInTestSelenium extends BaseTestSelenium {

    public void logInTest() {
        var url = driver.getCurrentUrl();
        Assertions.assertEquals(url, "https://www.expedia.com/");
    }
}
