package expedia.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BaseTestSelenium;

public class LogInTestSelenium extends BaseTestSelenium {

    private static final Logger logger = LogManager.getLogger(LogInTestSelenium.class);

    @Test
    public void logInTest() {
        var url = driver.getCurrentUrl();
        logger.info(url);
        Assertions.assertEquals(url, "https://www.expedia.com/");
    }
}
