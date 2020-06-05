package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


class GoogleTests {

    @Test
    void successfulSearch() {
        open("http://google.com");

        $(byName("q")).val("lepra").pressEnter();

        $("html").shouldHave(text("Лепрозорий: вход"));
    }


}