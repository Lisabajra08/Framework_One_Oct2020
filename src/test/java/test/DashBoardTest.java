package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class DashBoardTest {
	WebDriver driver;
	
	@Test
	public void validateDashBoard() {
		driver= BrowserFactory.init();
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.mainPageTitle();
		loginPage.enterUsername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickOnSigninButton();
		
		DashBoardPage dashBoardPage=PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.validateDashBoardPage();
		dashBoardPage.clickCustomerButton();
		dashBoardPage.clickAddCustomerButton();
		
		BrowserFactory.tearDown();
	}

}
