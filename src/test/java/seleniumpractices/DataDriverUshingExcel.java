package seleniumpractices;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Utilities;
/*
public class DataDriverUshingExcel {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		driver.get(Utilities.readProperty("newtoursurl"));

		driver.manage().window().maximize();

		Map<Integer, List<Object>> userDetails = Utilities.readExcel("userdetails");

		List<Object> rowData = userDetails.get(2);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(String.valueOf(rowData.get(0)));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(String.valueOf(rowData.get(1)));
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(rowData.get(2)));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(String.valueOf(rowData.get(3)));

		Utilities.selectValueFromDropdown(driver.findElement(By.xpath("//select[@name='country']")), "INDIA");
	}

}
*/