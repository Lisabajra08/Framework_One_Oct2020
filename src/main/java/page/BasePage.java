package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public void waitForElement(WebDriver driver, int timeInSeconds, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public void selectDropDown(WebElement elementLocator, String visibleText) {
		Select sel=new Select(elementLocator);
		sel.selectByVisibleText(visibleText);
	}
	public int randomGenerator(int boundNumber) {
		Random rnd=new Random();
		int randomNumber= rnd.nextInt(boundNumber);
		return randomNumber;
	}
	
}
