package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
		@FindBy(id = "user-name")
		private WebElement userNameBox;
		
		@FindBy(id = "password")
		private WebElement passwordBox;
		
		@FindBy(id = "login-button")
		private WebElement loginBtn;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void enterUserName(String userName) {
			userNameBox.sendKeys(userName);
		}
		
		public void enterPassword(String password) {
			passwordBox.sendKeys(password);
		}
		
		public void clickOnLogin() {
			loginBtn.click();
		}
		
}
