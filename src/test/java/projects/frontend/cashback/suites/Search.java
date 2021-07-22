package projects.frontend.cashback.suites;

import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import projects.frontend.cashback.helpers.TestBaseCashback;
import projects.frontend.cashback.pages.SearchPage;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Search extends TestBaseCashback {
    SearchPage searchPage = new SearchPage();

// Пример теста на поиск
    @Test(groups = {"web"},priority = 1, description="Проверка поиска")
    @Story("Поиск магазина")
    public void search1() throws Exception {
        open(searchPage.landingURL);
        sleep(1000);
        $(By.xpath("//*[@id=\"main_section\"]/div/section/form/div/input")).val("читай город");
        $(By.xpath("//*[@id=\"searchButtonHome\"]")).click();
        sleep(2000);
        $(By.xpath("//*[@id=\"feedApp\"]")).should(visible);
    }

}
