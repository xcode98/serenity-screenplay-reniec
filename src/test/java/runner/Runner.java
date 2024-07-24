package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@Test",
        plugin = {"summary", "pretty", "html:target/cucumber-reports", "json:target/cucumber-reports"},
        monochrome = true
)
public class Runner {
}
