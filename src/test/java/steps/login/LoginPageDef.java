package steps.login;

import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageDef {
    LoginPage loginPage = new LoginPage();

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
