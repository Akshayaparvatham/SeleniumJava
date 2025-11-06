package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DatepickerDemo {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
String MonthAndDate = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
while(!MonthAndDate.contains("November 2025"))
{
	driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
	 MonthAndDate = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
}
driver.findElement(By.xpath("//div[@aria-label='Fri Nov 14 2025']")).click();
Thread.sleep(3000);
driver.close();
	}

}
