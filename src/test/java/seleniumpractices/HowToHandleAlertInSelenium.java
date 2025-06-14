package seleniumpractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Utilities;

public class HowToHandleAlertInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(Utilities.readProperty("url"));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		Alert alt= driver.switchTo().alert();	
		System.out.println(alt.getText());
		alt.sendKeys("hello");
		Thread.sleep(3000);
		alt.accept();
		//alt.dismiss();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}
	

}
