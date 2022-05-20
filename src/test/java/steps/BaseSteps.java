package steps;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    @Before
    public void openUrl() {
        open("https://www.saucedemo.com/");
    }

    @After
    public void onTestFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File screenshot = Screenshots.takeScreenShotAsFile();
                InputStream targetStream = new FileInputStream(screenshot);
                Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

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
        $(By.xpath(".//*[contains(text(),'" + text + "')]")).shouldBe(visible);
    }
}
