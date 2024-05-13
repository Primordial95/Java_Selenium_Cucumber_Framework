package cucumber.Options;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNGFailedTestRunner {
	@CucumberOptions(features = "@target/failed_scenario.txt", glue = "stepdefinitions", monochrome = true, 
			  plugin = { "json:target/jsonReports/json-cucumber.json","html:target/htmlReports/html-cucumber.html",
					  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
			public class TestNGRunner extends AbstractTestNGCucumberTests {
				@DataProvider(parallel = true)//parallel test running
				public Object[][] scenarios() {
					return super.scenarios();
				}
			}
}
