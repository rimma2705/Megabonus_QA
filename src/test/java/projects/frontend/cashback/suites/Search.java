package projects.frontend.cashback.suites;

import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import projects.frontend.cashback.pages.SearchPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Search {
    SearchPage searchPage = new SearchPage();


    @Test(groups = {"web"},dependsOnMethods = "authTrue",priority = 6, description="Проверка заголовков текстов")
    @Story("Поиск")
    public void search1() throws Exception {
        open(searchPage.authURL);
        sleep(1000);
        $(By.xpath("/html/body/div[1]/section/div/div[2]/div[5]/div[2]/div[2]/div[2]/p")).shouldHave(text("Нверный email или пароль"));
    }

    @Test(groups = {"web"},priority = 5, description="Отрицательный сценарий")
    @Story("Поиск")
    public void search2() throws Exception {
        open(searchPage.authURL);
        searchPage.login("", "");
        sleep(1000);
        $(By.xpath("//*[@id=\"component-error-text\"]")).shouldHave(text("Неверный формат email"));
    }
    @Test(groups = {"web"},dependsOnMethods = "authTrue",priority = 6, description="Проверка")
    @Story("Поиск")
    public void search3() throws Exception {
        open(searchPage.authURL);
        sleep(1000);
        $(By.xpath("/html/body/div[1]/section/div")).shouldHave(text(""));
    }

    @Test(groups = {"web"},priority = 5, description="Отрицательный сценарий")
    @Story("Поиск")
    public void search4() throws Exception {
        open(searchPage.authURL);
        searchPage.login("", "");
        $(By.xpath("//*[@id=\"component-error-text\"]")).shouldHave(text(""));
    }
}
