package expedia.selenide.heroku.enums;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public enum HerokuaapTopic {
    AB_TESTING($("a[href='/abtest']")),
    ADD_REMOVE_ELEMENTS($("a[href='/add_remove_elements']")),
    BASIC_AUTH($("a[href='/basic_auth']")),
    BROKEN_IMAGES($("a[href='/broken_images']")),
    CHALLENGING_DOM($("a[href='/challenging_dom']")),
    CHECKBOXES($("a[href='/checkboxes']")),
    CONTEXT_MENU($("a[href='/context_menu']")),
    DIGEST_AUTH($("a[href='/digest_auth']")),
    DISAPPEARING_ELEMENTS($("a[href='/disappearing_elements']")),
    DRAG_AND_DROP($("a[href='/drag_and_drop']")),
    DROPDOWN($("a[href='/dropdown']")),
    DYNAMIC_CONTENT($("a[href='/dynamic_content']")),
    DYNAMIC_CONTROLS($("a[href='/dynamic_controls']")),
    DYNAMIC_LOADING($("a[href='/dynamic_loading']")),
    ENTRY_AD($("a[href='/entry_ad']")),
    EXIT_INTENT($("a[href='/exit_intent']")),
    DOWNLOAD($("a[href='/download']")),
    UPLOAD($("a[href='/upload']")),
    FLOATING_MENU($("a[href='/floating_menu']")),
    FORGOT_PASSWORD($("a[href='/forgot_password']")),
    LOGIN($("a[href='/login']")),
    FRAMES($("a[href='/frames']")),
    GEOLOCATION($("a[href='/geolocation']")),
    HORIZONTAL_SLIDER($("a[href='/horizontal_slider']")),
    HOVERS($("a[href='/hovers']")),
    INFINITE_SCROLL($("a[href='/infinite_scroll']")),
    INPUTS($("a[href='/inputs']")),
    JQUERYUI_MENU($("a[href='/jqueryui/menu']")),
    JAVASCRIPT_ALERT($("a[href='/javascript_alert']")),
    JAVASCRIPT_ERROR($("a[href='/javascript_error']")),
    KEY_PRESSES($("a[href='/key_presses']")),
    LARGE($("a[href='/large']")),
    WINDOWS($("a[href='/windows']")),
    NESTED_FRAMES($("a[href='/nested_frames']")),
    NOTIFICATION_MESSAGE($("a[href='/notification_message']")),
    REDIRECTOR($("a[href='/redirector']")),
    DOWNLOAD_SECURE($("a[href='/download_secure']")),
    SHADOWDOM($("a[href='/shadowdom']")),
    SHIFTING_CONTENT($("a[href='/shifting_content']")),
    SLOW($("a[href='/slow']")),
    TABLES($("a[href='/tables']")),
    STATUS_CODES($("a[href='/status_codes']")),
    TYPOS($("a[href='/typos']")),
    TINYMCE($("a[href='/tinymce']"));


    final SelenideElement selenideElement;

    HerokuaapTopic(SelenideElement selenideElement) {
        this.selenideElement = selenideElement;
    }

    public SelenideElement getSelenideElement() {
        return selenideElement;
    }
}
