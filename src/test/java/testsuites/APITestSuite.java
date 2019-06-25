package testsuites;

/*import org.junit.runner.RunWith;*/

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"aws", "cucumber.hooks"},
		tags = {"@apiautomation", "~@exclude"},
		plugin = {
		        "pretty",
		        "html:target/surefire-reports/cucumber-html-report",
		        "json:target/surefire-reports/cucumber-report.json"
		    })
public class APITestSuite {

}
