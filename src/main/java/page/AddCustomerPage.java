package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage{

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	//Element library
		@FindBy(how = How.XPATH, using = "//input[@id='account']")
		WebElement USERNAME_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@id='cid']")
		WebElement COMPANY_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='email']")
		WebElement EMAIL_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='phone']")
		WebElement PHONE_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='address']")
		WebElement ADDRESS_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='city']")
		WebElement CITY_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='state']")
		WebElement STATE_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='zip']")
		WebElement ZIPCODE_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\'select2-country-container\']")
		WebElement COUNTRY_FIELD_ELEMENT;
		@FindBy(how = How.XPATH, using ="//button[@id='submit']")
		WebElement SUBMIT_ELEMENT;

		
	//Interactive Methods
		public void enterUserName(String name) {
			int generateNumber= randomGenerator(999);
			USERNAME_FIELD_ELEMENT.sendKeys(name + generateNumber);
		}
		public void chooseCompanyOption(String company) {
			selectDropDown(COMPANY_FIELD_ELEMENT, company);
		
		}
		public void enterEmail(String email) {
			int generateNumber= randomGenerator(999);
			EMAIL_FIELD_ELEMENT.sendKeys(generateNumber+email);
		}
		public void enterPhone(String phone) {
			int generateNumber= randomGenerator(999);
			PHONE_FIELD_ELEMENT.sendKeys(generateNumber+phone);
		}
		public void enterAddress(String location) {
			ADDRESS_FIELD_ELEMENT.sendKeys(location);
			
		}
		public void enterCityAddress(String city) {
			CITY_FIELD_ELEMENT.sendKeys(city);
			
		}
		public void enterState(String state) {
			STATE_FIELD_ELEMENT.sendKeys(state);
		}
		
		public void enterZipcode(String zipcode) {
			ZIPCODE_FIELD_ELEMENT.sendKeys(zipcode);
		}
		public void chooseCountryOption(String Country) {
		selectDropDown(COUNTRY_FIELD_ELEMENT, Country);
		}
		public void clickOnSubmit() {
			SUBMIT_ELEMENT.click();
	
		}
}
	
	
	
	
	
