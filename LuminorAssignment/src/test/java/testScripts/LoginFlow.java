package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import reusable.BaseClass;

public class LoginFlow extends BaseClass{
	
	WebDriver driver;
	
	@Test
	public void login(){
		
		LoginPage loginPage = new LoginPage(driver);
		System.out.println("Selenide Login Flow");
		
		//Click on Login button
		loginPage.clickLoginBtn();
		
		//Verify login type smartId is visible (smartId, mobileId, id-card, pin-calculator)
		loginPage.verifyIsDisplayedSmartID();
		System.out.println(loginPage.getTextSmartIDLabel());
		
		//Verify login type mobileId is visible
		loginPage.verifyIsDisplayedMobileID();
		System.out.println(loginPage.getTextMobileIDLabel());
		
		//Verify login type id-card is visible
		loginPage.verifyIsDisplayedIDCard();
		System.out.println(loginPage.getTextIDCardLabel());
		
		//Verify login type pin-calculator is visible
		loginPage.verifyIsDisplayedPINcalculator();
		System.out.println(loginPage.getTextPINcalculatorLabel());
		
		//Screenshot captured in @BeforeTest method in Base class
		
		System.out.println("Selenide Login Ends");
	}

}
