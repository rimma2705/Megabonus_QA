package projects.frontend.cashback.suites;

import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import projects.frontend.cashback.helpers.TestBaseCashback;
import projects.frontend.cashback.pages.LandingPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Landing extends TestBaseCashback {
    LandingPage landingPage = new LandingPage();

    @Test(groups = {"web"},priority = 1, description="Проверка страницы лендинга")
    @Story("Проверка наличия блока с Популярными магазинами")
    public void landing1() throws Exception {
        open(landingPage.landingURL);
        sleep(1000);
        $(By.xpath("//*[@class=\"increased-cashback-section\"]")).should(visible);
    }

    @Test(groups = {"web"},priority = 1, description="Проверка страницы лендинга")
    @Story("Проверка наличия блока c Категориями")
    public void landing2() throws Exception {
        open(landingPage.landingURL);
        sleep(1000);
        $(By.xpath("//*[@id=\"categories_section\"]")).should(visible);
    }
}
