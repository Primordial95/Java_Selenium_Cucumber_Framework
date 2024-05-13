package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
		private WebDriver driver;
		private HomePage homePage;
		private LoginPage loginPage;
		private CartPage cartPage;
		private CheckoutPage checkoutPage;
		
		public PageObjectManager(WebDriver driver) {
			this.driver=driver;
		}
		
		public LoginPage getLoginPage() {
			loginPage=new LoginPage(driver);
			return loginPage;
		}
		
		public HomePage  getHomePage() {
			homePage=new HomePage (driver);
			return homePage;
		}
		
		public CartPage getCartPage() {
			cartPage=new CartPage(driver);
			return cartPage;
		}
		
		public CheckoutPage getCheckoutPage() {
			checkoutPage=new CheckoutPage(driver);
			return checkoutPage;
		}
		
}
