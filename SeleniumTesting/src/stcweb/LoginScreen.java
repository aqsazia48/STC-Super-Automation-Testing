package stcweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class LoginScreen extends Configuration {

	public static void main(String[] args) throws Exception  {
			
		
		WebDriver chromeDriver = new ChromeDriver(); 
		loadingWebpage(chromeDriver);
		
		
		String text = chromeDriver.findElement(By.xpath("//h1[@class='app-name']")).getText();
		Assert.assertTrue(text != null);
		System.out.println("Login Page Loaded Successfully!");
		
		
		// Click on Login Button
		chromeDriver.findElement(By.cssSelector("button[class='login-button account-button button']")).click(); 
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME, TimeUnit.SECONDS);
			 
		// Enter Email Id into Email Address Input Field
		chromeDriver.findElement(By.id("username")).sendKeys(Login.EMAIL_ID); 
		
		// Enter Password into Password Input Field
		chromeDriver.findElement(By.id("password")).sendKeys((Login.PASSWORD)); 
		
		// Click on Sign In Button
		chromeDriver.findElement(By.id("kc-login")).click(); 
		
		chromeDriver.quit();
		
	}	
}

