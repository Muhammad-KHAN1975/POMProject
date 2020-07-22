package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}

	
	// Element Library
	//One way
	// WebElement WEBELEMENT_USERNAME_FIELD_LOCATOR = driver.findElement(By.id("username"));
	
	//Second way
	// By BY_USERNAME_FIELD_LOCATOR = By.id("username");
	
	//Third way for Page Object Model
	@FindBy(how = How.ID, using = "username") WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.ID, using = "password") WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_LOCATOR;

	
	// Method to interact with elements
	//One way
	public void enterUsername(String userName) {
		USERNAME_FIELD_LOCATOR.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
	}
	
	public void clickSignButton() {
		SIGNIN_BUTTON_LOCATOR.click();
		
	}
	
	//Second way
	/*public void login(String userName, String password) {
		USERNAME_FIELD_LOCATOR.sendKeys(userName);
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
		SIGNIN_BUTTON_LOCATOR.click();
	}*/
}
