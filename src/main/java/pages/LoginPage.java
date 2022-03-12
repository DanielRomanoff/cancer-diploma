package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement login = $(By.cssSelector("#user-name"));
    private final SelenideElement password = $(By.cssSelector("#password"));

    public void inputLogin(String text) {
        this.login.val(text);
    }

    public void inputPassword(String text) {
        this.password.val(text);
    }
}
