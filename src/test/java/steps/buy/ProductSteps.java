package steps.buy;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Product;
import org.testng.Assert;
import pages.product.CartPage;
import pages.product.ProductPage;

import java.util.ArrayList;
import java.util.List;

public class ProductSteps {
    ProductPage product = new ProductPage();
    CartPage cart  = new CartPage();
    List<Product> excepted = new ArrayList<>();
    List<Product> actual = new ArrayList<>();

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

    @When("Запомнить параметры {string} на главной странице")
    public void initMainItem(String item) {
        actual.add(Product.builder()
                .name(item)
                .price(product.getPrice(item).text())
                .description(product.getDescription(item).text())
                .build());
    }

    @When("Запомнить параметры {string} в корзине")
    public void initCartItem(String item) {
        excepted.add(Product.builder()
                .name(item)
                .price(product.getPrice(item).text())
                .description(product.getDescription(item).text())
                .build());
    }

    @Then("Проверить парамерты")
    public void checkParams() {
        Assert.assertEquals(actual, excepted);
    }
}
