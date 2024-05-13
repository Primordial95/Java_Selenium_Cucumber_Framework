package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobjects.HomePage;
import utils.TestContextSetup;

public class HomePageStepDefinitions {
	TestContextSetup testContextSetup;
	HomePage homePage;
	
	public HomePageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		homePage=testContextSetup.pageObjectManager.getHomePage();
	}
	
	@Then("did user reach the home page and {string} is displayed")
	public void did_user_reach_the_home_page_and_is_displayed(String title) {
	    String expectedTitle=homePage.getPageTitle();
	    Assert.assertEquals(expectedTitle,title);
	}
	@Then("on home page {string} section is displayed or not")
	public void on_home_page_section_is_displayed_or_not(String elementText) {
	    String expectedText=homePage.getProductText();
	    Assert.assertEquals(expectedText, elementText);
	}
	
	@When("click on open menu and then click on about section")
	public void click_on_open_menu_and_then_click_on_about_section() {
	   homePage.clickOnAbout();
	}
	
	@When("user selects the product and add to cart")
	public void user_selects_the_and_add_to_cart() {
	    homePage.selectProductAndAddToCart();
	}
	@Then("did user reach the page and Logo is displayed")
	public void did_user_reach_the_page_and_logo_is_displayed() {
		Assert.assertTrue(homePage.logoDisplayed());
	}
	
}
