package steps.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.login.LoginPage;
import steps.BaseSteps;

public class LoginSteps {
    BaseSteps base = new BaseSteps();

    LoginPage loginPage = new LoginPage();

    @Then("Ввести логин {string}")
    public void inputLogin(String login) {
        loginPage.login().val(login);
    }

    @Then("Ввести пароль {string}")
    public void inputPassword(String password) {
        loginPage.password().val(password);
    }

    @Given("Пользователь залогинился")
    public void userLogin() {
        inputLogin("standard_user");
        inputPassword("secret_sauce");
        base.clickOnSubmitButton();
    }
}
