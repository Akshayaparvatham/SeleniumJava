package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id=\"uploadfile\"]")).sendKeys("C://Users//Pradeep//Desktop//java programms_Day2");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class=\"dropbtn\"]")).click();
        Thread.sleep(2000);
        driver.close();
	}

}
