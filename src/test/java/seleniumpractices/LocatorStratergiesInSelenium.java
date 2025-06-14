package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStratergiesInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		// By.id
		WebElement maleRadioButton= driver.findElement(By.id("radio"));
		maleRadioButton.click();
		
		// By.name
		WebElement searchField= driver.findElement(By.name("q"));
		searchField.sendKeys("Welcome");
		Thread.sleep(2000);
		searchField.clear();
		
		// By.class
		WebElement titleOfPage= driver.findElement(By.className("title"));
		String title= titleOfPage.getText();
		System.out.println(title);
		
		//By.linkText
		driver.findElement(By.linkText("SeleniumTutorial"));
		
		//By.partialLinkText
		driver.findElement(By.partialLinkText("iumTut"));
		
		// By.tagname
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String linkText= link.getAttribute("href");
			System.out.println(linkText);
			
		}
	}

}
