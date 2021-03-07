package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Login_TestClass extends Configuration {
	  
		WebDriver chromeDriver;
		
	 @BeforeMethod
	 public void initializationOfChromeDriver() {
		 		
			// declaration and instantiation of objects/variables  
				System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
				chromeDriver = new ChromeDriver();
	}
			
	 @Test
	 public void loadingHomepageByHttp() {
		  
		 	System.out.println("Running Testcase 1 : loadingHomepageByHttp");	
		 	
			// Maximize the browser Window
			chromeDriver.manage().window().maximize(); 
			chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				
			// Launch Web Site  
			chromeDriver.get(BASE_URL); // Loading Stcsuper.com Web page
			chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				
			String text = chromeDriver.findElement(By.xpath("//h1[@class='app-name']")).getText();
			Assert.assertTrue(text != null);
			System.out.println("LogIn Successful!");
				
			// Click on Login Button
			chromeDriver.findElement(By.cssSelector("button[class='login-button account-button button']")).click(); 
			chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				
			// Enter Email Id into Email Address Input Field
			chromeDriver.findElement(By.id("username")).sendKeys(Login.EMAIL_ID); 
				
			// Enter Password into Password Input Field
			chromeDriver.findElement(By.id("password")).sendKeys((Login.PASSWORD)); 
			
			// Check Mark the "Remember Me" Check Box
			WebElement checkBox = chromeDriver.findElement(By.id("rememberMe"));
			checkBox.click();
				
			// Click on Sign In Button
			chromeDriver.findElement(By.id("kc-login")).click(); 

			chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				
	}
		  
	  
	@Test
	public void loadingHomePageByHttps() {
		  
  		System.out.println("Running Testcase 2 : loadingHomePageByHttps");
  		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
		
		// Maximize the browser Window
		chromeDriver.manage().window().maximize(); 
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
		
		// Launch Web Site  
		chromeDriver.get(BASE_URL); // Loading Stcsuper.com Web page
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
		
		String text = chromeDriver.findElement(By.xpath("//h1[@class='app-name']")).getText();
		Assert.assertTrue(text != null);
		System.out.println("LogIn Successful!");
		
		// Click on Login Button
		chromeDriver.findElement(By.cssSelector("button[class='login-button account-button button']")).click(); 
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
			
		// Enter Email Id into Email Address Input Field
		chromeDriver.findElement(By.id("username")).sendKeys(Login.EMAIL_ID); 
		
		// Enter Password into Password Input Field
		chromeDriver.findElement(By.id("password")).sendKeys((Login.PASSWORD));
		
		// Check Mark the "Remember Me" Check Box
		WebElement checkBox = chromeDriver.findElement(By.id("rememberMe"));
		checkBox.click();
		
		// Click on Sign In Button
		chromeDriver.findElement(By.id("kc-login")).click(); 
		  
	}
	  
	@AfterMethod
	public void closeBrowser(){
		chromeDriver.close();
	} 
 
 
}
