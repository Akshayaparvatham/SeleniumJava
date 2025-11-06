package alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmAlert {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
Thread.sleep(2000);
Alert alert=driver.switchTo().alert();
alert.accept();
Thread.sleep(2000);
driver.close();

	}

}
