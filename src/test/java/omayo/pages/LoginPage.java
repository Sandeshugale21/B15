package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	//page constructor to initialize element
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	// Web Element
	@FindBy(name="userName")
	WebElement userNameTextField;
	
	@FindBy(name="password")
	WebElement passwordTextField;
	
	@FindBy(name="submit")
	WebElement submitButton;

	// Getter method to get web element
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	// Method related to web wlement
	
	public void setUserName(String uname) {
		getUserNameTextField().clear();
		getUserNameTextField().sendKeys(uname);
	}
	
	public void setPassword(String password) {
		getPasswordTextField().clear();
		getPasswordTextField().sendKeys(password);
	}
	
	public void clickOnSubmitBtn() {
		getSubmitButton().click();
		
	}
	

}
