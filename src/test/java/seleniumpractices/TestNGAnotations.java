package seleniumpractices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnotations {

	@BeforeSuite
	public void beforeSuit() {

		System.out.println("before each suit");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before each test plan");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before each class");
	}

	@BeforeMethod
	public void beforeMethod() { 
		System.out.println("before each merthod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after each merthod");
	}

	@Test
	public void testCase() {
		System.out.println("testcase");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after each class");
	}

	@AfterTest
	public void afteretest() {

		System.out.println("after each test plan");

	}

	@AfterSuite
	public void aftereSuit() {

		System.out.println("after each suit");

	}

}
