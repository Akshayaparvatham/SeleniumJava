package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Links {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		List<WebElement>footerlinks=  driver.findElements(By.tagName("a"));
		System.out.println(footerlinks.size());
		for(WebElement l1:footerlinks) {
			System.out.println(l1.getAttribute("href"));
		}
Thread.sleep(3000);
driver.close();
	}

}
