package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {
	
WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		
	}

	
	// Element Library
	//One way
	// WebElement WEBELEMENT_USERNAME_FIELD_LOCATOR = driver.findElement(By.id("username"));
	
	//Second way
	// By BY_USERNAME_FIELD_LOCATOR = By.id("username");
	
	//Third way for Page Object Model
	@FindBy(how = How.XPATH,using = "//span[contains(text(),'Dashboard')]") WebElement DASHBOARD_LOCATOR;

	public void clickDashBoardButton() {
		DASHBOARD_LOCATOR.click();
		
	}

	
}
