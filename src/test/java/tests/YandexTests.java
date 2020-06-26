package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("search")
class YandexTests extends TestBase {

    @Test
    void successfulSearch() {
        open("http://ya.ru");

        $(byName("text")).val("lepra").pressEnter();

        $("html").shouldHave(text("leprosorium.ru"));
    }


}