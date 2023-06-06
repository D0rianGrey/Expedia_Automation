package expedia.selenide.heroku.modules;

import expedia.selenide.heroku.enums.HerokuaapTopic;

public interface IHerokuapp {

    default void clickTopic(HerokuaapTopic herokuaapTopic) {
        herokuaapTopic.getSelenideElement().click();
    }
}
