package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasePageDef {

    @Then("Нажать на кнопку подтверждения {string}")
    public void clickOnSubmitButton(String text) {
        $(By.xpath("//*[@type='submit' and @value='" + text + "']")).click();
    }

    @Then("Нажать на кнопку подтверждения")
    public void clickOnSubmitButton() {
        $(By.xpath("//*[@type='submit']")).click();
    }

    @Then("Видно элемент с текстом {string}")
    public void checkElementIsVisible(String text) {
        $(By.xpath(".//*[text()='" + text + "']")).shouldBe(visible);
    }
}