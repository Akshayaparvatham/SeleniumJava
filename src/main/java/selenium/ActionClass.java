package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.navigate().to("https://demo.automationtesting.in/Static.html");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//img[@id=\"angular\"]"));
		Thread.sleep(2000);
		WebElement destination=driver.findElement(By.xpath("//div[@id=\"droparea\"]"));
		Thread.sleep(2000);
a.dragAndDrop(source, destination).build().perform();
Thread.sleep(2000);
driver.close();
	}

}
