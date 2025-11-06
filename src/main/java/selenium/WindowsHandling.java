package selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowsHandling {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//s-1:launuching browser
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//s-2:Entering selenium
		driver.findElement(By.xpath("//input[@class=\"whTextBox\"]")).sendKeys("selenium");
		//s-3:click on button"opens parent window"
		String parentwindow=driver.getWindowHandle();
		WebElement element=driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		//s-4 maximize child screen
	   Set<String>childwindow=driver.getWindowHandles();
	   System.out.println(childwindow);
	   for(String a1:childwindow) {
		   if(!a1.contains(parentwindow)) {
			   driver.switchTo().window(a1);
			   driver.manage().window().maximize();
			   //s-4 fill the form
			   driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("parvatham");
			   driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Akshaya");
			   driver.findElement(By.xpath("//input[@id=\"femalerb\"]")).click();
			   driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("parvatham.akshaya27@gmail.com");
			   driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Akki@1234");
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("//button[@id=\"registerbtn\"]")).click();
			   Thread.sleep(3000);
			   //s-5:close childwindow
			   driver.close();
			   
		   }
	   }
	   //s-5 come to parentwindow
driver.switchTo().window(parentwindow);
//s-6 clear selenium
driver.findElement(By.xpath("//input[@class=\"whTextBox\"]")).clear();
//s-7 enter java
driver.findElement(By.xpath("//input[@class=\"whTextBox\"]")).sendKeys("java");
Thread.sleep(3000);
driver.close();
	}

}
