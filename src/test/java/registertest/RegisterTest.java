package registertest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClassPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTest {
	WebDriver driver;
	BaseClassPOM registrationpage;
	@BeforeMethod
	public void launchSrasysacademy()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		registrationpage=new BaseClassPOM(driver);
		registrationpage.LaunchApplication();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	@Test
	public void loginTest()
	{
		registrationpage. Registrationdetails("parvatham","Akshaya","akshaya.parvatham27@gmail.com","IN", "kphb","Hyderabad","India", "Telangana","Akki@1234", "Akki@1234");
	}
	}


