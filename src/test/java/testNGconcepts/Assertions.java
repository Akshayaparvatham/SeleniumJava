package testNGconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assertions {
public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

}@AfterMethod
	public void tearDown() throws InterruptedException {
	Thread.sleep(1000);
	driver.close();
}

@Test(priority=1)
public void Enter() throws InterruptedException {
	String actualvalue=driver.findElement(By.xpath("//a[@id=\"link1\"]")).getText();
	String expectedvalue="Selenium143";
	Assert.assertEquals(actualvalue, expectedvalue);
	System.out.println("test case pass");
	
	

}
@Test(priority=2)
public void click() throws InterruptedException {
	boolean actualvalue=driver.findElement(By.xpath("//input[@id=\"radio2\"]")).isEnabled();
	Assert.assertTrue(actualvalue);
	Thread.sleep(2000);
	
}

}
