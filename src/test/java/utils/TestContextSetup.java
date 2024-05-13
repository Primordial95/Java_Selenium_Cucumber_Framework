package utils;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginPage;
import pageobjects.PageObjectManager;

public class TestContextSetup {
		public WebDriver driver;
		public PageObjectManager pageObjectManager;
		
		public TestContextSetup() {
			driver=new Base().webDriverManger();
			pageObjectManager=new PageObjectManager(driver);
		}
}
