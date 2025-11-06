package locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
				driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
List<WebElement> tableele=driver.findElements(By.xpath("//table=[@id=\"customers\"]"));
for(WebElement tableele1:tableele)
{
	
	String s1=tableele1.getText();
	System.out.println(s1);
}
	Thread.sleep(3000);
	driver.close();
		

	}

}
