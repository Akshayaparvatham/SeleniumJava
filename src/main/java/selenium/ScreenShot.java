package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException,IOException,InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.navigate().to("https://tutorialsninja.com/demo/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 Robot r=new Robot();
		 driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("hp");
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0,750)", " ");
         r.delay(3000);
         js.executeScript("window.scrollBy(0,-250)", " ");
         r.delay(3000);
         TakesScreenshot screen=(TakesScreenshot)driver;
         File src=screen.getScreenshotAs(OutputType.FILE);
         File target=new File("C://Users//Pradeep//eclipse-workspace//basicsofjava//Screenshots//HpResults.jpg");
         FileUtils.copyFile(src, target);
         Thread.sleep(3000);
         driver.close();
	}

}
