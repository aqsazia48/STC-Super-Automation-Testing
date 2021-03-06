package stcweb;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpScreen extends Configuration {

public static void main(String[] args) throws Exception  {
		 
		WebDriver chromeDriver = new ChromeDriver(); 
		loadingWebpage(chromeDriver);		
		
		String text = chromeDriver.findElement(By.xpath("//h1[@class='app-name']")).getText();
		Assert.assertTrue(text != null);
		System.out.println("SignUp Page Loaded Successfully!");
		
		// Click on SignUp Button
		chromeDriver.findElement(By.cssSelector("button[class='sign-up-button account-button button']")).click(); 
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME, TimeUnit.SECONDS);
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME, TimeUnit.SECONDS);
		
		// Enter Name into Name Input Field
		chromeDriver.findElement(By.id("admin-name-input-field")).sendKeys(SignUp.NAME); 
		
		// Enter Brand Name into Brand Name Input Field
		chromeDriver.findElement(By.id("company-name-input-field")).sendKeys(SignUp.BRAND_NAME); 
			
		// Enter Email Id into Email Address Input Field
		chromeDriver.findElement(By.id("admin-email-input-field")).sendKeys(SignUp.EMAIL_ID); 
		
		// Enter Password into Password Input Field
		chromeDriver.findElement(By.id("admin-password-input-field")).sendKeys((SignUp.PASSWORD)); 
		
		// Click on Sign In Button
		chromeDriver.findElement(By.cssSelector("button[class='create-account-button button']")).click(); 
		
		chromeDriver.quit(); 
		
	}	
}


