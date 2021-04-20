package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By loginButton = By.xpath("//button[@class='button layout-default size-default intent-secondary']");
	By SmartID_Label = By.xpath("//span[text()='Smart-ID']");
	By MobileID_Label = By.xpath("//span[text()='Mobiil-ID']");
	By IDCard_Label = By.xpath("//span[text()='ID-kaart']");
	By PINcalculator_Label = By.xpath("//span[text()='PIN-kalkulaator']");

	public void clickLoginBtn() {
		$(loginButton).shouldHave(text("LOGI SISSE"));									
		$(loginButton).click();
	}

	public void verifyIsDisplayedSmartID() {
		$(SmartID_Label).isDisplayed();
	}

	public void verifyIsDisplayedMobileID() {
		$(MobileID_Label).isDisplayed();
	}

	public void verifyIsDisplayedIDCard() {
		$(IDCard_Label).isDisplayed();
	}

	public void verifyIsDisplayedPINcalculator() {
		$(PINcalculator_Label).isDisplayed();
	}

	public String getTextSmartIDLabel() {
		return $(SmartID_Label).getText();
	}

	public String getTextMobileIDLabel() {
		return $(MobileID_Label).getText();
	}

	public String getTextIDCardLabel() {
		return $(IDCard_Label).getText();
	}

	public String getTextPINcalculatorLabel() {
		return $(PINcalculator_Label).getText();
	}
}
