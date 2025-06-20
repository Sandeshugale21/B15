package omayotestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import omayo.pages.LoginPage;
import omayo.pages.LoginSuccessPage;
import util.Utilities;

public class VerifyValidUserLogin extends OmayoBaseTeat{
	
	LoginPage loginPage;
	LoginSuccessPage loginSuccessPage;
	@Test(description="Verify valid user login", priority=0, groups= {"sanity"})
	public void verifyValidLogin() {
		
		loginPage =new LoginPage(driver);
		loginSuccessPage = new LoginSuccessPage(driver);
		driver.navigate().to(Utilities.readProperty("newtourshomepageurl"));
		
		loginPage.setUserName("admin");
		loginPage.setPassword("admin@123");
		loginPage.clickOnSubmitBtn();
		
		Utilities.waitForElementToBeVisible(driver, 30L, loginSuccessPage.getLoginSuccessMsg());
		Assert.assertEquals(loginSuccessPage.getLoginSuccessMsgText(), "Login Successfully");
		Assert.assertEquals(loginSuccessPage.getYhankYouForLoginText().trim(), "Thank you for Loggin.");
		
	}
	
}
