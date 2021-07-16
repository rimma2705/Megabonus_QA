package projects.frontend.cashback.suites;

import io.qameta.allure.Story;
import org.testng.annotations.Test;
import projects.frontend.cashback.pages.RegisterPage;
import projects.frontend.cashback.pages.SearchPage;
import projects.frontend.cashback.pages.ShopPage;
import java.util.Random;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Shop {
    ShopPage shopPage = new ShopPage();
    public String textPassword = "123123123";



    @Test(groups = {"web3"},priority = 4, description="Положительный сценарий.")
    @Story("Страница магазина")
    public void shop1() throws Exception {
        open(shopPage.registerURL);
        sleep(5000);
        $(shopPage.registerForm).should(disappear);
    }

    @Test(groups = {"web3"},priority = 5, description="")
    @Story("Страница магазина")
    public void shop2() throws Exception {
        open(shopPage.registerURL);
        shopPage.register( "@", textPassword);
        $(shopPage.textErrorEmail).shouldHave(text("Неверный формат email"));
    }

    @Test(groups = {"web2"},priority = 1, description="Отрицательный сценарий")
    @Story("Страница магазина")
    public void shop3() throws Exception {
        open(shopPage.registerURL);
        System.out.println("1");
        $(shopPage.textErrorPassword).shouldHave(text(" за надежные пароли — минимум 8 символов"));
    }

}
