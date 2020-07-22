package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.BankAndCashPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

		WebDriver driver;

		@Test
		public void validUserShouldBeAbleToLogin() {
			driver = BrowserFactory.launchBrowser();
			
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			
			loginPage.enterUsername("techfiosdemo@gmail.com");
			loginPage.enterPassword("abc123");
			loginPage.clickSignButton();
			
			//DashBoardPage dashBoard = PageFactory.initElements(driver, DashBoardPage.class);
			//BankAndCashPage bankAndCash = PageFactory.initElements(driver, BankAndCashPage.class);
			
		}

	}




