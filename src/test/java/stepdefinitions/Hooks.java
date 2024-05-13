package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

import io.cucumber.java.*;
import utils.TestContextSetup;

public class Hooks {
		TestContextSetup testContextSetup;
		
		public Hooks(TestContextSetup testContextSetup) {
			this.testContextSetup=testContextSetup;
		}
		@After
		public void tearDown() {
			testContextSetup.driver.quit();
		}
		
		@AfterStep
		public void screenShot(Scenario scenario) throws IOException {
			if(scenario.isFailed()) {
				File src=((TakesScreenshot)testContextSetup.driver).getScreenshotAs(OutputType.FILE);
				byte[] file=FileUtils.readFileToByteArray(src);
				scenario.attach(file, "image/png", "image");
			}
		}
}
