package omayotestcases;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import omayo.pages.HomePage;

public class HomePageVerifications extends OmayoBaseTeat {

	
	@Test
	public void verifyHomepage() {
		HomePage homePage = new HomePage(driver);
		assertFalse( homePage.getMaleRadiobtn().isSelected(),"By default male radio button  is selected");
		assertFalse( homePage.getFemaleRadiobtn().isSelected(),"By default male radio button  is selected");
	}
}
