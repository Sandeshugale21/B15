package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utilities;

public class LoginScenarioUsingDataProvider {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Utilities.readProperty("newtoursurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	@Test(dataProvider="userData")
	public void loginTestUsingDataProvider(String username, String password) {
		
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String loginMsg=	driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
	
		Assert.assertEquals(loginMsg, "Login Successfully");
	}
	
	@DataProvider(name="userData")
	public String[][] dataProvider() {
		String user[][]= {{"admin","admin@123"},{"admin1","admin@123"},{"admin2","admin@123"}};
		return user;
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
