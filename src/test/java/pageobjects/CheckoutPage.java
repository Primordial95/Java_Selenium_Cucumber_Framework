package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
		@FindBy(xpath = "//div[@class='inventory_item_name']")
		private WebElement productNamElement;
		
		@FindBy(id = "finish")
		private WebElement finishBtn;
		
		@FindBy(xpath = "//h2[@class='complete-header']")
		private WebElement orderConfirmationElement;
		
		public CheckoutPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyProduct() {
			return productNamElement.getText();
		}
		
		public void clickFinish() {
			finishBtn.click();
		}
		
		public String OrderConfirmationText() {
			return orderConfirmationElement.getText();
		}
}
