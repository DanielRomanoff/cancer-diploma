package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    public ElementsCollection getNames() {
        return $$(".inventory_item_name");
    }

    public ElementsCollection getPrices() {
        return $$(".inventory_item_price");
    }

    public ElementsCollection getDescriptions() {
        return $$(".inventory_item_desc");
    }

    public SelenideElement getDescription(String product) {
        return $x(".//div[contains(text(),'" + product + "')]/following::div[@class='inventory_item_desc'][1]");
    }

    public SelenideElement getPrice(String product) {
        return $x(".//div[contains(text(),'" + product + "')]/following::div[@class='inventory_item_price'][1]");
    }

    public ElementsCollection addButtons() {
        return $$x(".//button[contains(text(),'Add to cart')]");
    }

    public ElementsCollection removeButtons() {
        return $$x(".//button[contains(text(),'Remove')]");
    }

    public SelenideElement getButtonByProduct(String arg0) {
        return $x(".//div[contains(text(),'" + arg0 + "')]/following::button[1]");
    }
}
