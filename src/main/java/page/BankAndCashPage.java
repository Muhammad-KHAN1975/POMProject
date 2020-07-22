package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage {
	
WebDriver driver;
	
	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
		
	}

	
	// Element Library
	//One way
	// WebElement WEBELEMENT_USERNAME_FIELD_LOCATOR = driver.findElement(By.id("username"));
	
	//Second way
	// By BY_USERNAME_FIELD_LOCATOR = By.id("username");
	
	//Third way for Page Object Model
	@FindBy(how = How.XPATH,using = "//span[contains(text(),'Bank & Cash')]") WebElement BANKANDCASHPAGE_LOCATOR;
	
	public void clickBankAndCashButton() {
		BANKANDCASHPAGE_LOCATOR.click();
		
	}

}
