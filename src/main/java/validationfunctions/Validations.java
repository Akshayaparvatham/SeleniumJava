package validationfunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement w =driver.findElement(By.xpath("//input[@id=\"radio2\"]"));
boolean b=w.isEnabled();
System.out.println(b);
w.click();
Thread.sleep(3000);
boolean b1=w.isSelected();
System.out.println(b1);
WebElement w1 =driver.findElement(By.xpath("//h2[text()='UnOrdered list']"));
boolean b2=w1.isDisplayed();
System.out.println(b2);
driver.close();
	}

}

