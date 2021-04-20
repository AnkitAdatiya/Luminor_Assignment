package reusable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Selenide.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {

	WebDriver driver;

	@BeforeTest
	public void launchLuminor() {
		System.out.println("Selenide Print Before Test1");
		System.setProperty("webdriver.chrome.driver", "G:\\IBM\\Assignment\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverRunner.setWebDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		open("https://luminor.ee/");
	}

	@AfterTest
	public void takeScreenShot() throws IOException {
		System.out.println("Taking Screenshot");

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("G:\\IBM\\LuminorScreenshot\\homePageScreenshot.png"));

		System.out.println("Closing browser");
		driver.close();
	}
}
