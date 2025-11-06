package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 Robot r=new Robot();
		 for(int i=0;i<3;i++) {
			 r.keyPress(KeyEvent.VK_CONTROL);
			 r.keyPress(KeyEvent.VK_ADD);
			 r.keyRelease(KeyEvent.VK_SUBTRACT);
			 r.keyRelease(KeyEvent.VK_ADD);
		 }
r.delay(3000);
driver.close();
	}

}
