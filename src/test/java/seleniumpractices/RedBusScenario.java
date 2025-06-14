package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusScenario {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String parentWindowHandle=driver.getWindowHandle();
		List<WebElement> footerLinks= driver.findElements(By.xpath("//div[@class='footerContent']//a"));
		for(WebElement link:footerLinks) {
			String linkText=link.getAttribute("href");
			driver.switchTo().newWindow(WindowType.TAB).navigate().to(linkText);
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(parentWindowHandle);
			
		}

	}

}
