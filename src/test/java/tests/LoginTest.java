package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest {
WebDriver driver;
LoginPage loginpage;
@BeforeMethod
public void launchSrasysacademy()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	loginpage=new LoginPage(driver);
	loginpage.LaunchApplication();
}
@AfterMethod
public void closeBrowser()
{
	driver.close();
}
@Test
public void loginTest()
{
	loginpage.Logindetails("akshaya.parvatham27@gmail.com","Akki@1234");
}
}
