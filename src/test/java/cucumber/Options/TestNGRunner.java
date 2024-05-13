package cucumber.Options;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * 
 * @Author : Vivek Kumar Yadav 
 * To add Tags use this in @CucumberOptions(tags ="@EndToEnd or @Regression")
 *         
 */
@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, 
  plugin = { "json:target/jsonReports/json-cucumber.json","html:target/htmlReports/html-cucumber.html",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenario.txt"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = true)//parallel test running
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
