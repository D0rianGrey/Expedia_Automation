package expedia.selenide.heroku;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import owner.Provider;

import static com.codeborne.selenide.Selenide.open;

public class HerokuappTest {

    @Test
    void testEugene() {
        open("https://the-internet.herokuapp.com/");
        HerokuappIml herokuappIml = new HerokuappIml();
        herokuappIml.openForkMePage();
        Provider provider = new Provider();
        System.out.println(provider.getName());
        System.out.println(provider.getAge());
        Selenide.sleep(5000);
//        System.out.println(herokuappIml.getFooterText());
//        searchFieldIml.clickTopic(HerokuaapTopic.EXIT_INTENT);
    }
}
