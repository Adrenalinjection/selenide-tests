package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@Epic("QA.GURU automation course")
@Story("Google test")
@Tag("search")
class GoogleTests extends TestBase {

    @Test
    @Description("Google test, we look for lepra")
    @DisplayName("Google test")
        void successfulSearch() {
        open("http://google.com");

        $(byName("q")).val("lepra").pressEnter();

        $("html").shouldHave(text("Лепрозорий: вход"));
    }

        @Test
        @Description("Google test, we look for 2ch but cannot find")
        @DisplayName("Google test")
        void unsuccessfulSearch() {
            open("http://google.com");

            $(byName("q")).val("2ch").pressEnter();

            $("html").shouldHave(text("Лепрозорий: вход"));
        }

}