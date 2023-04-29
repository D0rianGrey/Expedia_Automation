package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverFactory {
    ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    String browser;

    public BrowserDriverFactory(String browser) {
        this.browser = browser;
    }

    public WebDriver createDriver() {
        if (browser.equalsIgnoreCase("chrome")) {
            threadLocalDriver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("firefox")) {
            threadLocalDriver.set(new FirefoxDriver());
        }
        return threadLocalDriver.get();
    }
}
