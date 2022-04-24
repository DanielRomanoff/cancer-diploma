package pages.buy;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    public SelenideElement firstName() {
        return $("#first-name");
    }

    public SelenideElement lastName() {
        return $("#last-name");
    }

    public SelenideElement postalCode() {
        return $("#postal-code");
    }

    public SelenideElement finish() {
        return $("#finish");
    }
}
