package stepdefinitions;

import io.cucumber.java.en.*;
import pageobjects.CartPage;
import pageobjects.HomePage;
import utils.TestContextSetup;

public class CartPageStepDefinitions {
	TestContextSetup testContextSetup;
	CartPage cartPage;
	
	public CartPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		cartPage=testContextSetup.pageObjectManager.getCartPage();
	}

	@When("user goes to cart and click on checkout")
	public void user_goes_to_cart_and_click_on_checkout() {
	    cartPage.checkOut();
	}
	@When("^user fills the info (.+) (.+) (.+) and clicks on continue$")
	public void user_fills_the_info_zipcode_and_clicks_on_continue(String firstName, String lastName, int postalCode) {
	    cartPage.enterDetails(firstName, lastName, postalCode);
	}

}
