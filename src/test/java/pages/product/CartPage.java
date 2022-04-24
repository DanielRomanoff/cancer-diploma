package pages.product;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class CartPage extends BasePage {

    public SelenideElement checkout() {
        return $("#checkout");
    }

    public SelenideElement continueShopping() {
        return $("#continue-shopping");
    }
}
