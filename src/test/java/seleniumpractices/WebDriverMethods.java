package seleniumpractices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Load new web Page in the current browser window
		driver.get("https://omayo.blogspot.com/");
		
		//maximize browser window
		driver.manage().window().maximize();
		
		String url =driver.getCurrentUrl();
		System.out.println("current page url : "+url);
		
		
		String title=driver.getTitle();
		System.out.println("Title of page : "+title);
		
		WebElement textarea= driver.findElement(By.xpath("//textarea"));
		textarea.sendKeys("Welcome");
		
		WebElement maleRadioButton= driver.findElement(By.xpath("//input[@id='radio1']"));
		maleRadioButton.click();
		
		List<WebElement> radioButtons= driver.findElements(By.xpath("//input[@type='radio']"));
		Iterator<WebElement> it= radioButtons.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getAttribute("value"));
		}
		
		
		// close current window
		//driver.close();
		
		
		//close current browser
		driver.quit();
		
	}

}
