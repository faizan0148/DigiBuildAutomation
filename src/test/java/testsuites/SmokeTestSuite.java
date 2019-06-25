package testsuites;

/*import org.junit.runner.RunWith;*/

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java",
		glue = {"steps", "cucumber.hooks"},
		tags = {"@smoke", "~@exclude"},
		plugin = {
		        "pretty",
		        "html:target/surefire-reports/cucumber-html-report",
		        "json:target/surefire-reports/cucumber-report.json"
		    })
public class SmokeTestSuite {

}
