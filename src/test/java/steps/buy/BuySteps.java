package steps.buy;

import io.cucumber.java.en.Then;
import pages.buy.CheckoutPage;

public class BuySteps {
    CheckoutPage checkout = new CheckoutPage();

    @Then("Ввести имя {string}")
    public void enterName(String name) {
        checkout.firstName().val(name);
    }

    @Then("Ввести фамилию {string}")
    public void enterLastName(String lastName) {
        checkout.lastName().val(lastName);
    }

    @Then("Ввести индекс {string}")
    public void enterPostal(String postal) {
        checkout.postalCode().val(postal);
    }

    @Then("Подтвердить покупку")
    public void enterContinue() {
        checkout.finish().click();
    }
}
