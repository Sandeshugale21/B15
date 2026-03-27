package omayotestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utilities;

public class OmayoBaseTeat  {
	WebDriver driver;

	
	@BeforeMethod
	public void setup() {
		//driver=WebDriverManager1.getDriver();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(Utilities.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf( Utilities.readProperty("timeout"))));
		
		
		
	}
	
	
	@AfterMethod
	public void tearDowb() {
		if(driver!=null) {
		driver.quit();
		}
	}
}
