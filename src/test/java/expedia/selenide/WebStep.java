package expedia.selenide;

import io.qameta.allure.Step;

public class WebStep {
    @Step("Печать мусора")
    public WebStep printGarbage() {
        System.out.println("Print garbage");

        return this;
    }
}
