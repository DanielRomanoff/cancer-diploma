package steps.buy;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.product.ProductPage;

public class ProductSteps {
    ProductPage product = new ProductPage();

    @Then("Добавить в корзину {string}")
    public void addToBucket(String arg0) {
        product.getButtonByProduct(arg0).click();
    }

    @When("Счётчик товаров равен {string}")
    public void cartCounterEqualsTo(String count) {
        product.cartCounter().shouldBe(Condition.exactText(count));
    }

    @Then("Добавить в корзину все продукты")
    public void addAllItems() {
        product.addButtons().forEach(SelenideElement::click);
    }
}
