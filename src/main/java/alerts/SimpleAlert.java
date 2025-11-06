package alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
Thread.sleep(3000);
Alert alert=driver.switchTo().alert();
alert.accept();
Thread.sleep(3000);
driver.close();

	}

}
