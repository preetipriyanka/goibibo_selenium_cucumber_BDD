package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\learningSelenium\\goibibo.com\\src\\main\\java\\Feature\\TravelDetails.feature",
        glue = {"StepDefinition"},
        format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
)

public class TestRunner {
}
