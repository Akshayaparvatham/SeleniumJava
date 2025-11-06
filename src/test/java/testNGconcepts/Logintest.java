package testNGconcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
 WebDriver driver;
	@Parameters({"browserType","url"})
	@BeforeTest
	public void setup(String browserType, String url ) {
		if(browserType.contains("Chrome"))
		{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	}else if(browserType.contains("Edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		}
}
@Parameters({"username","password"})
@Test
	
public void login(String username,String password) throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);

}
@AfterTest
public void tearDown() {
	if(driver !=null) {
	driver.quit();
}
}
}
