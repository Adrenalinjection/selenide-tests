package tests;

import com.codeborne.selenide.Configuration;
import drivers.CustomWebDriver;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;


@Epic("QA.GURU automation course")
@Story("tests with video")

class TestBase {

    @BeforeEach
    void beforeEach() {
        Configuration.browser = CustomWebDriver.class.getName();
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }

}