package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature"},
        glue = {"com/stepdefinitions", "appHooks"},
        plugin = {"pretty",
                //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"


        }

)
public class MyTestRunner {
}
