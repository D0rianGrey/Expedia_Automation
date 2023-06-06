package expedia.selenide.heroku.modules;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public interface IPoweredBy {
    SelenideElement footer = $("#page-footer");

    default String getFooterText() {
        return footer.find("a").getText();
    }
}
