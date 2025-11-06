package testNGconcepts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNGPriority {
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

}@AfterMethod
	public void tearDown() throws InterruptedException {
	Thread.sleep(1000);
	driver.close();
}

@Test(priority=1)
public void Enter() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name=\"userid\"]")).sendKeys("Akshaya");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name=\"pswrd\"]")).sendKeys("Akki123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value=\"Cancel\"]")).click();
	Thread.sleep(2000);
	
}
@Test(priority=2)
public void click() throws InterruptedException {
	driver.findElement(By.xpath("//div[@id=\"HTML25\"]")).click();
	Thread.sleep(2000);
	
}
@Test(priority=3)
public void textarea() throws InterruptedException {
	driver.findElement(By.xpath("//textarea[@id=\"ta1\"]")).sendKeys("Selenium");
	Thread.sleep(2000);
}
@Test(priority=4)
public void search() throws InterruptedException {
	driver.findElement(By.xpath("//input[@size=\"10\"]")).sendKeys("Bike");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(2000);
}
@Test(priority=5)
public void selected() throws InterruptedException {
	driver.findElement(By.xpath("//input[@value=\"orange\"]")).isSelected();
	Thread.sleep(2000);
}
@Test(priority=6)
public void Singledropdown() throws InterruptedException {
	Select s=new Select(driver.findElement(By.xpath("//select[@id=\"drop1\"]")));
	s.selectByIndex(4);
	Thread.sleep(2000);
	Select s1=new Select(driver.findElement(By.xpath("//select[@id=\"drop1\"]")));
	s1.selectByValue("def");
	Thread.sleep(2000);
}
@Test(priority=6)
public void Multipledropdown() throws InterruptedException {
	Select s=new Select(driver.findElement(By.xpath("//select[@id=\"multiselect1\"]")));
	s.selectByIndex(2);
	s.selectByVisibleText("Volovo");
	Thread.sleep(2000);
}
@Test(priority=7)
public void WebTable() throws InterruptedException {
	List<WebElement>table=driver.findElements(By.xpath("//table[@id=\"table1\"]"));
	for(WebElement a:table) {
		String s=a.getText();
		System.out.println(s);
	}
	Thread.sleep(2000);
}
@Test(priority=8)
public void button() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id=\"radio2\"]")).click();
	Thread.sleep(2000);
}
@Test(priority=9)
public void Enabled() throws InterruptedException {
	WebElement w=driver.findElement(By.xpath("//input[@id=\"timerButton\"]"));
	boolean b=w.isEnabled();
	System.out.println(b);
	w.click();
	Thread.sleep(2000);
}
@Test(priority=10)
public void text() throws InterruptedException {
	driver.findElement(By.xpath("//textarea[@id=\"ta1\"]")).getText();
	Thread.sleep(2000);
}
}