package navigatefunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateTo {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=\"female\"]")).click();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
