package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	@FindBy(xpath = "//input[@id='radio1']")
	WebElement maleRadiobtn;
	
	@FindBy(xpath = "//input[@id='radio2']")
	WebElement femaleRadiobtn;
	
	
	@FindBy(id="drop1")
	WebElement olderNewsLettersDropdown;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getMaleRadiobtn() {
		return maleRadiobtn;
	}

	public WebElement getFemaleRadiobtn() {
		return femaleRadiobtn;
	}

	public WebElement getOlderNewsLettersDropdown() {
		return olderNewsLettersDropdown;
	}

	// Methods
	public boolean isOlderNewsLettersDropdownVisible() {
		return getOlderNewsLettersDropdown().isDisplayed();
	}
}
