package expedia.selenide;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static utils.BaseTest.getConstantsProperties;

public class LogInSelenideTests {

    @Description("Log in test")
    @Epic("EPIC 1")
    @Feature("Logging")
    @Issue("CLR-1234")
    @Link("https://google.com.ua/")
    @Owner("Eugene Vakerin")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Story Value")
    @Test
    public void logInTest() {

        WebStep webStep = new WebStep();

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
                .includeSelenideSteps(true));

        step("Open Expedia", () -> {
            open(getConstantsProperties().getProperty("URL_EXPEDIA"));
        });

        step("Print url", () -> {
            String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
            System.out.println(currentUrl);
        });

        step("Check url", () -> {
            Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), "https://www.expedia.com/?=one-key-onboarding-dialog");
        });

        webStep.printGarbage();
    }
}
