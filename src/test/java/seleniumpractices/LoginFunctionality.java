package seleniumpractices;

import org.testng.annotations.Test;

public class LoginFunctionality {
	
	
	@Test(priority = 1, groups= {"smoke"})
	public void dTest() {
		System.out.println("Test D is executed");
		
	}
	
	@Test(priority = 0, groups= {"sanity"})
	public void bTest() {
		System.out.println("Test B is executed");
		
	}
	
	@Test(priority = 2, groups= {"regression"})
	public void cTest() {
		System.out.println("Test c is executed");
		
	}
	@Test(priority = 3, groups= {"regretion","sanity"})
	public void ETest() {
		System.out.println("Test E is executed");
		
	}

}
