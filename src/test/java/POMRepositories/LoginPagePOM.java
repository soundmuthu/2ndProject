package POMRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {

	WebDriver driver; 
	
	public LoginPagePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	By username = By.xpath("//input[@name='user-name']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//input[@id='login-button']");
	
	public void setusername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void setpassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clicklogin() {
		driver.findElement(login).click();
	}

}
