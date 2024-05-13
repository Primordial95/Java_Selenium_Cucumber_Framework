package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import utils.TestContextSetup;

public class CheckOutPageStepDefinitions {
	TestContextSetup testContextSetup;
	HomePage homePage;
	CheckoutPage checkoutPage;
	
	public CheckOutPageStepDefinitions(TestContextSetup testContextSetup) {
			this.testContextSetup=testContextSetup;
			homePage=testContextSetup.pageObjectManager.getHomePage();
			checkoutPage=testContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	@Then("product is added and verified with name")
	public void product_is_added_and_verified_with_name() {
		Assert.assertEquals(homePage.getProductName(), checkoutPage.verifyProduct());
	}
	@Then("click on finish button")
	public void click_on_finish_button() {
	   checkoutPage.clickFinish();
	}
	@Then("Order successfull message is showing {string}")
	public void order_successfull_message_is_showing(String checkoutMessage) {
	    Assert.assertEquals(checkoutPage.OrderConfirmationText() , checkoutMessage);
	}
}
