package steps.login;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageDef {
    LoginPage loginPage = new LoginPage();

    @Before
    public void openUrl() {
        open("https://www.saucedemo.com/");
    }

    @Then("Ввести логин {string}")
    public void inputLogin(String arg0) {
        loginPage.inputLogin(arg0);
    }

    @Then("Ввести пароль {string}")
    public void inputPassword(String arg0) {
        loginPage.inputPassword(arg0);
    }

    @Then("Залогиниться под дефолтным юзером")
    public void login() {
        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
    }
}
