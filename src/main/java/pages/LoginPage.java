package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public final String url="https://srasysacademy.com/login";
	By emailAdress= By.xpath("//input[@name='email']");
	By passwordField= By.xpath("//input[@name='password']");
	By loginButton= By.xpath("//button[@type='submit']");
	By RegisterButton= By.xpath("//button[text()='Register']");
	//loginpage constructor(classname and constructor name should be same)
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
public void LaunchApplication()
{
	driver.get(url);
}
public void Logindetails(String username,String password) 
{
	driver.findElement(emailAdress).sendKeys(username);
	driver.findElement(passwordField).sendKeys(password);
	driver.findElement(loginButton).click();
}
public void Registerpage() {
	driver.findElement(RegisterButton).click();
}
}
