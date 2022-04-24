package pages.product;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage extends BasePage {
    public SelenideElement cart() {
        return $(".shopping_cart_link");
    }

    public SelenideElement cartCounter() {
        return $(".shopping_cart_badge");
    }

    // TODO: sorting methods

}
