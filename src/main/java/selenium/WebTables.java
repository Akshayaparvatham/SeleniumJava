package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.navigate().to("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //s-1:select all values from table
		 List<WebElement>table=driver.findElements(By.xpath("//table[@id=\"customers\"]"));
		 for(WebElement a1:table) {
			 String s1=a1.getText();
			 System.out.println(s1);
		 }
Thread.sleep(2000);
//s-2:columns in table
List<WebElement>coloumns=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
int a=coloumns.size();
System.out.println("coloumns"+a);
Thread.sleep(2000);
//s-3 rows in table
List<WebElement>rows=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
int a1=rows.size()-1;//to eliminate headings(-1)
System.out.println("rows"+a1);
Thread.sleep(2000);
//s-4 cells in table
List<WebElement>cells=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td"));
int a2=cells.size();
System.out.println("cells"+a2);
Thread.sleep(2000);
//s-5 check companies available
List<WebElement>companies=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td[2]"));
int a3=companies.size();
System.out.println("companies"+a3);
for(WebElement b:companies) {
	System.out.println(b.getText());
	//s-6check california present or not
	List<WebElement>california=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td[4]"));
	for(WebElement b1:california) {
		if(b1.getText().contains("California")) {
			System.out.println("california present");	
		}
	}
	//s-7	click checkbox
	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td/input[@type=\"checkbox\"]")).click();
Thread.sleep(2000);
driver.close();
	}

}
}
