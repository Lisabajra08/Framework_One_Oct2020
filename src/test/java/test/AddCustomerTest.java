package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShoulbBeToAddCustomer() {
		driver= BrowserFactory.init();
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickOnSigninButton();
		
		DashBoardPage dashBoardPage=PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.validateDashBoardPage();
		dashBoardPage.clickCustomerButton();
		dashBoardPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage=PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.enterUserName("Selenium");
		addCustomerPage.chooseCompanyOption("Techfios");
		addCustomerPage.enterEmail("abc@gmail.com");
		addCustomerPage.enterPhone("1234567");
		addCustomerPage.enterAddress("Street");
		addCustomerPage.enterCityAddress("Irving");
		addCustomerPage.enterState("Texas");
		addCustomerPage.enterZipcode("23480");
		addCustomerPage.chooseCountryOption("United States");
		addCustomerPage.clickOnSubmit();
		
		BrowserFactory.tearDown();
	}
	
}
