package utils;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
		public WebDriver driver;
		public Properties properties;
		
		public Properties loadConfig() {
			try {
				FileInputStream fis = new FileInputStream("..\\SauceDemoCucumber\\src\\test\\java\\resources\\global.properties");			
				properties = new Properties();
				properties.load(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return properties;
		}
		
		public WebDriver webDriverManger() {
			properties=loadConfig();
			if(properties.getProperty("browser").equalsIgnoreCase("chrome")) {
//				ChromeOptions chromeOptions = new ChromeOptions();
//				chromeOptions.addArguments("--headless");
				driver=new ChromeDriver();
			}
			else if(properties.getProperty("browser").equalsIgnoreCase("firefox")){
				driver=new FirefoxDriver();
			}
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			return driver;
		}
}
