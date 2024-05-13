package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
		@FindBy(id = "checkout")
		private WebElement checkoutElement;
		
		@FindBy(id = "first-name")
		private WebElement firstNameBox;
		
		@FindBy(id = "last-name")
		private WebElement lastNameBox;
		
		@FindBy(id = "postal-code")
		private WebElement postalCodeBox;
		
		@FindBy(id = "continue")
		private WebElement continueBtn;
		
		public CartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void checkOut() {
			checkoutElement.click();
		}
		
		public void enterDetails(String firstName,String lastName,int postalcode) {
			firstNameBox.sendKeys(firstName);
			lastNameBox.sendKeys(lastName);
			postalCodeBox.sendKeys(String.valueOf(postalcode));
			continueBtn.click();
		}
}
