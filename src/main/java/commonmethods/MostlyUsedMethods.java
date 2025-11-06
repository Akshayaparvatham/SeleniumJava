package commonmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MostlyUsedMethods {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		//to delete all cookies
		driver.manage().deleteAllCookies();
		//to maximize
		driver.manage().window().maximize();
		//get text
		String s=driver.findElement(By.xpath("//h2[text()='UnOrdered list']")).getText();
		//current url
		String s1=driver.getCurrentUrl();
		//get title
		String s2=driver.getTitle();
		//page source
		String s3=driver.getPageSource();
		//attribute
		String s4=driver.findElement(By.xpath("//input[@id='radio1']")).getAttribute("name");
		driver.close();
		

	}

}
