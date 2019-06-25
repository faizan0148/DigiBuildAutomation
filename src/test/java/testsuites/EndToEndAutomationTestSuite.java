package testsuites;
//
//import org.junit.runner.RunWith;
////import org.testng.annotations.Test;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "src/main/java",
//		glue = {"steps", "cucumber.hooks"},
//		tags = {"@endtoendautomation", "~@exclude"},
//		plugin = {
//		        "pretty",
//		        "html:target/surefire-reports/cucumber-html-report",
//		        "json:target/surefire-reports/cucumber-report.json"
//		    })
//public class EndToEndAutomationTestSuite{
//
//}

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java",
		glue = {"steps", "cucumber.hooks"},
		tags = {"@endtoendautomation", "~@exclude"},
		plugin = {
		        "pretty",
		        "html:target/surefire-reports/cucumber-html-report",
		        "json:target/surefire-reports/cucumber-report.json"
		    })
public class EndToEndAutomationTestSuite {

}