package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageobjects.LoginPage;
import utils.TestContextSetup;

public class LoginPageStepDefinitions {
	WebDriver driver;
	TestContextSetup testContextSetup;
	LoginPage loginPage;
	
	public LoginPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		loginPage=testContextSetup.pageObjectManager.getLoginPage();
	}
	
	@Given("Go to the base url")
	public void go_to_the_base_url() {
		
	}
	@When("enter {string} and {string}")
	public void enter_and(String userName, String password) {
	  loginPage.enterUserName(userName);
	  loginPage.enterPassword(password);
	}
	@When("click on Login button")
	public void click_on_login_button() {
	   loginPage.clickOnLogin();
	}

}
