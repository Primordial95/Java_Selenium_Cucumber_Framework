package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		WebDriver driver;
	
		@FindBy(xpath = "//span[text()='Products']")
		private WebElement productElement;
		
		@FindBy(xpath = "//a[text()='About']")
		private WebElement aboutElement;
		
		@FindBy(xpath = "//button[text()='Open Menu']")
		private WebElement menuBtn;
		
		@FindBy(xpath = "//img[@alt='Saucelabs']")
		private WebElement imgLogElement;
		
		@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
		private WebElement productNameElement;
		
		@FindBy(xpath = "//a[@class='shopping_cart_link']")
		private WebElement cartBtn;
		
		@FindBy(css = "button[id='add-to-cart']")
		private WebElement addToCartBtn;
		
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		public String getProductText() {
			return productElement.getText();
		}
		
		public void clickOnAbout() {
			menuBtn.click();
			aboutElement.click();
		}
	
		public boolean logoDisplayed() {
			return imgLogElement.isDisplayed();
		}
		
		public void selectProductAndAddToCart() {
			productNameElement.click();
			addToCartBtn.click();
			cartBtn.click();
		}
		
		public String getProductName() {
			return productNameElement.getText();
		}
}
