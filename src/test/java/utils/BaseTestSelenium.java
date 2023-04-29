package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import static utils.BaseTest.getConstantsProperties;

public class BaseTestSelenium {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.out.println("Before each test");
        BrowserDriverFactory browserDriverFactory = new BrowserDriverFactory(getConstantsProperties().getProperty("BROWSER"));
        driver = browserDriverFactory.createDriver();
        driver.get(getConstantsProperties().getProperty("URL"));
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each test");
        driver.quit();
    }
}
