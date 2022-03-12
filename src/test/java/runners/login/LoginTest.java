package runners.login;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:src/test/resources/login/login.feature")
public class LoginTest {
}
