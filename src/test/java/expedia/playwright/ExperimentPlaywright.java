package expedia.playwright;

import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ExperimentPlaywright extends Fixtures {

    @Test
    void test1() {
        page.navigate("http://playwright.dev");
        assertThat(page).hasTitle("Fast and reliable end-to-end testing for modern web apps | Playwright");
    }
}
