package selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BaseTestSelenium;

public class LogInTestSelenium extends BaseTestSelenium {

    @Test
    public void logInTest() {
        var url = driver.getCurrentUrl();
        Assertions.assertEquals(url, "https://www.expedia.com/");
    }
}
