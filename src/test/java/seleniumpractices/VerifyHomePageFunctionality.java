/**
 * 
 */
package seleniumpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class will used to verify home page functionality
 */
public class VerifyHomePageFunctionality {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void verifyHomePageTitle() {

		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "omayo (QAFox.com)","Title is not matched");

	}

	@Test(enabled = true)
	public void verifyHomePageurl() {

		String pageurl = driver.getCurrentUrl();

		Assert.assertEquals(pageurl, "https://omayo.blogspot.com/","uel is not matched");

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
