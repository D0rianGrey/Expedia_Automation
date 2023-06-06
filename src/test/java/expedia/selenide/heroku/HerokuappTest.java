package expedia.selenide.heroku;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class HerokuappTest {
    @Test
    void test() {
        open("https://the-internet.herokuapp.com/");
        HerokuappIml herokuappIml = new HerokuappIml();
        herokuappIml.openForkMePage();
        Selenide.sleep(5000);
//        System.out.println(herokuappIml.getFooterText());
//        searchFieldIml.clickTopic(HerokuaapTopic.EXIT_INTENT);
    }
}
