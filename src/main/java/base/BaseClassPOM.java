package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassPOM {
WebDriver driver;
public final String url="https://srasysacademy.com/login";
By RegisterButton= By.xpath("//button[text()='Register']");
By firstName= By.xpath("//input[@name='fname']");
By lastName= By.xpath("//input[@name='lname']");
By emailAdress= By.xpath("//input[@type='email']");
By countryCode= By.xpath("//select[@name='countryCode']");
By streetAdrees=By.xpath("//input[@name='fname']");
By cityName=By.xpath("//input[@name='city']");
By countryName =By.xpath("//select[@name='country']");
By stateName=By.xpath("//select[@name='state']");
By passwordField=By.xpath("//input[@name='password']");
By confirmPassword=By.xpath("//input[@name='confirmPassword']");

public BaseClassPOM(WebDriver driver)
{
	this.driver=driver;
}
public void LaunchApplication()
{
driver.get(url);
}
public void Registrationdetails(String surname,String name,String email,String countrycode,String streetadress,String city,String country,String state,String password,String confirmpassword) 
{
	driver.findElement(RegisterButton).click();
driver.findElement(firstName).sendKeys(surname);
driver.findElement(lastName).sendKeys(name);
driver.findElement(emailAdress).sendKeys(email);
new
Select(driver.findElement(countryCode)).selectByValue(countrycode);
driver.findElement(streetAdrees).sendKeys(streetadress);
driver.findElement(cityName).sendKeys(city);
new
Select(driver.findElement(countryName)).selectByVisibleText(country);
new
Select(driver.findElement(stateName)).selectByValue(state);
driver.findElement(passwordField).sendKeys(password);
driver.findElement(confirmPassword).sendKeys(confirmpassword);

}
}

