package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utilities;

public class SoftAssertInSelenium {
	
	WebDriver driver;
	SoftAssert verify;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		verify = new SoftAssert();
		driver.get(Utilities.readProperty("newtoursurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	@Test
	public void loginTestUsingDataProvider() {
		
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String expectedResult ="Logn Successfully";
		String loginMsg=	driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();

		//Assert.assertEquals(loginMsg, expectedResult);
		verify.assertEquals(loginMsg, expectedResult,"User not logged in successfully");
		System.out.println("before first verification");
		
		String thankYouMsg=	driver.findElement(By.xpath("//b[normalize-space()='Thank you for Loggin.']")).getText();
		verify.assertTrue(thankYouMsg.trim().equalsIgnoreCase("Thank you for Loggin."));
		System.out.println("after both verification");
		verify.assertAll();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
