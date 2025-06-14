package seleniumpractices;

import java.awt.TextField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement textArea= driver.findElement(By.xpath("//textarea[@id='ta1']"));
		textArea.sendKeys("Welcmoe");
		Thread.sleep(2000);
		textArea.clear();
		
		
		String color= driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color");
		System.out.println(color);
		
		
		String tagname = textArea.getTagName();
		System.out.println(tagname);
		
		boolean visible= textArea.isDisplayed();
		System.out.println("WebElement is visible :" +visible);
		
		System.out.println("Web Element is visible :"+driver.findElement(By.xpath("//div[@id='delayedText']")).isDisplayed());
		//Thread.sleep(10000);
		System.out.println("Web Element is visible :"+driver.findElement(By.xpath("//div[@id='delayedText']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@id='delayedText']")).getCssValue("visibility"));
		
		
		System.out.println("text area is enebled" +textArea.isEnabled());
		
		
		System.out.println(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//button[@id='but1']")).getAttribute("disabled"));
		
		
		System.out.println("Bike radiobtm is selected:" +driver.findElement(By.xpath("//input[@value='Bike']")).isSelected());
		System.out.println("Bicycle radiobtm is selected:" +driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'This is a sample Text ')]")).getText());
		
		driver.quit();
		

	}

}
