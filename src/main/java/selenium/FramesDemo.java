package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.findElement(By.xpath("//input[@class=\"frmTextBox\"]")).sendKeys("selenium");
			 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"frm1\"]")));
			 Select s=new Select(driver.findElement(By.xpath("//select[@id=\"selectnav2\"]")));
			 s.selectByIndex(3);
			 Thread.sleep(2000);
			 //go back to main (default)page
			 driver.switchTo().defaultContent();
			 driver.findElement(By.xpath("//input[@class=\"frmTextBox\"]")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@class=\"frmTextBox\"]")).sendKeys("java");
			 Thread.sleep(2000);
			 driver.close();
	
}
}
