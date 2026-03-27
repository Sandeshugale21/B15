package omayotestcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayo.pages.HomePage;

public class VerifyDropdownFunctionality extends OmayoBaseTeat {

	HomePage homePage;
	SoftAssert verify;

	@Test(description = "Verify dropdown functionality", groups = { "regression" })
	public void verifyDropdownFunctionality() {
		homePage = new HomePage(driver);
		verify = new SoftAssert();
		verify.assertTrue(homePage.isOlderNewsLettersDropdownVisible(), "dropdown is not visible");

		Select select = new Select(homePage.getOlderNewsLettersDropdown());
		verify.assertFalse(select.isMultiple(), "Dropdown allow multiple selection");

		List<String> expectedList = Arrays.asList("Older Newsletters", "doc 1", "doc 2", "doc 3", "doc 4");
		
		List<String> actualList= new ArrayList<String>();
		for(WebElement elm:select.getOptions()) {
			actualList.add(elm.getText());
		}
		verify.assertEquals(actualList, expectedList, "Dropdown options are missing");

		verify.assertAll();

	}

}
