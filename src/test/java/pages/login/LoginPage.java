package pages.login;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement login() {
        return $(By.cssSelector("#user-name"));
    }

    public SelenideElement password() {
        return $(By.cssSelector("#password"));
    }
}