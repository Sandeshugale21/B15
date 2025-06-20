package selenium.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utilities;

public class WebDriverManager1 {

	static WebDriver driver;
	static WebDriverManager1 webDriverManager1;

	private WebDriverManager1() {

	}

	public WebDriver initWebDriver() {

		String browserName = Utilities.readProperty("browser");

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("please select valid browser");
			break;
		}

		return driver;
	}

	public static WebDriver getDriver() {
		if (webDriverManager1 == null) {
			webDriverManager1 = new WebDriverManager1();
			driver=webDriverManager1.initWebDriver();

		}
		return driver;
	}

}
