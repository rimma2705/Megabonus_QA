package projects.frontend.cashback.suites;

import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import projects.frontend.cashback.helpers.TestBaseCashback;
import projects.frontend.cashback.pages.LandingPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Landing extends TestBaseCashback {
    LandingPage landingPage = new LandingPage();

    @Test(groups = {"web"},dependsOnMethods = "authTrue",priority = 6, description="Проверка заголовков текстов")
    @Story("Лендинг")
    public void landing1() throws Exception {
        open(landingPage.authURL);
        sleep(1000);
        $(By.xpath("/html/body/div[1]/section/div/div[2]/div[5]/div[2]/div[2]/div[2]/p")).shouldHave(text("Нверный email или пароль"));
    }

    @Test(groups = {"web"},priority = 5, description="Отрицательный сценарий")
    @Story("Лендинг")
    public void landing2() throws Exception {
        open(landingPage.authURL);
        landingPage.login("", "");
        $(By.xpath("//*[@id=\"component-error-text\"]")).shouldHave(text("Неверный формат email"));
    }

    @Test(groups = {"web"},priority = 1, description="")
    @Story("Лендинг")
    public void landing3() throws Exception {
        open(landingPage.authURL);
        sleep(1000);
        $(By.xpath("//*[@id=\"component-error-text\"]")).shouldHave(text("Неверный формат email"));
    }

}
