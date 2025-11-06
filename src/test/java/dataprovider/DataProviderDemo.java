package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
public WebDriver driver;
@Test(dataProvider="data")
public void DataProviderConcepts(String username,String password)
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.findElement(By.xpath(""));
}
}
