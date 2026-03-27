package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage extends BasePage {

	
	public LoginSuccessPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[text()='Login Successfully']")
	WebElement loginSuccessMsg;
	
	@FindBy(xpath = "//b[normalize-space()='Thank you for Loggin.']")
	WebElement yhankYouForLogin;

	public WebElement getLoginSuccessMsg() {
		return loginSuccessMsg;
	}

	public WebElement getYhankYouForLogin() {
		return yhankYouForLogin;
	}
	
	// Method related to Web Element
	public String getLoginSuccessMsgText() {
		 return getLoginSuccessMsg().getText();
	}
	
	public String getYhankYouForLoginText() {
		 return getYhankYouForLogin().getText();
	}
}
