package steps.cart;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.product.CartPage;
import pages.product.ProductPage;

import static com.codeborne.selenide.CollectionCondition.empty;
import static com.codeborne.selenide.CollectionCondition.itemWithText;

public class CartSteps {
    ProductPage product = new ProductPage();
    CartPage cart = new CartPage();
    @Then("Открыть корзину")
    public void openBucket() {
        product.cart().click();
    }

    @When("В корзине товар с именем {string}")
    public void cartHave(String item) {
        cart.getNames().shouldBe(itemWithText(item));
    }

    @Then("Убрать элемент из корзины с именем {string}")
    public void removeItem(String item) {
        cart.getButtonByProduct(item).click();
    }

    @When("Корзина пуста")
    public void isEmpty() {
        cart.getNames().shouldBe(empty);
    }

    @Then("Очистить корзину")
    public void clear() {
        cart.removeButtons().forEach(SelenideElement::click);
    }


    @When("В корзине {string} товаров")
    public void haveOnlyItems(String countItems) {
        cart.getNames().shouldBe(CollectionCondition.size(Integer.parseInt(countItems)));
    }

    @Then("Перейти к оформлению заказа")
    public void checkoutOrder() {
        cart.checkout().click();
    }
}
