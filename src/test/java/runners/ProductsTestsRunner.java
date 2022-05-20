package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        plugin = {"pretty"},
        tags = "",
        features = "src/test/resources/products",
        glue = "steps")
public class ProductsTestsRunner extends AbstractTestNGCucumberTests {
}