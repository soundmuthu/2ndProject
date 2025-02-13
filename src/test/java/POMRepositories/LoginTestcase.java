package POMRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepositories.LoginPagePOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestcase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver ;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		LoginPagePOM obj = new LoginPagePOM(driver);
		obj.setusername("Admin");
		obj.setpassword("admin123");
		obj.clicklogin();
		
	}

}
