package expedia.selenide.heroku.modules;

import static com.codeborne.selenide.Selenide.open;

public interface IFork {
    String url = "https://github.com/tourdedave/the-internet";

    default void openForkMePage() {
        open(url);
    }
}
