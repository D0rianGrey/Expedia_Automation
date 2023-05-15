package google;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.events.DomMutationEvent;
import org.openqa.selenium.devtools.v112.log.Log;
import org.openqa.selenium.logging.HasLogEvents;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import static org.openqa.selenium.devtools.events.CdpEventTypes.domMutation;

public class GoogleTestSelenium {
    @Test
    public void testGoogle() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--Access-Control-Allow-Origin");
        ChromeDriver driver = new ChromeDriver(chromeOptions);

        AtomicReference<DomMutationEvent> seen = new AtomicReference<>();
        CountDownLatch latch = new CountDownLatch(1);
        ((HasLogEvents) driver).onLogEvent(domMutation(mutation -> {
            seen.set(mutation);
            latch.countDown();
        }));

        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Log.enable());
        devTools.addListener(Log.entryAdded(),
                logEntry -> {
                    System.out.println("log: " + logEntry.getText());
                    System.out.println("level: " + logEntry.getLevel());
                });

        driver.get("https://www.google.com");
        driver.findElement(org.openqa.selenium.By.cssSelector("button#L2AGLb")).click();
        driver.findElement(org.openqa.selenium.By.cssSelector("textarea#APjFqb")).sendKeys("selenium test");
        driver.findElement(org.openqa.selenium.By.cssSelector("input#gbqfbb")).click();

        Assert.assertEquals(driver.getTitle(), "Selenium");

        driver.quit();
    }
}
