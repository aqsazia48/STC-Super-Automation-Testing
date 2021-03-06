package testclasses;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SignUp_TestClass extends Configuration {
	
	WebDriver chromeDriver;
	
	@BeforeMethod
	public void initializationOfChromeDriver() {
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.chrome.driver",DRIVER_PATH );
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
				System.out.println("SignUp Successful!");
				
				// Click on SignUp Button
				chromeDriver.findElement(By.cssSelector("button[class='sign-up-button account-button button']")).click(); 
				chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				
				// Enter Name into Name Input Field
				chromeDriver.findElement(By.id("admin-name-input-field")).sendKeys(SignUp.NAME); 
				
				// Enter Brand Name into Brand Name Input Field
				chromeDriver.findElement(By.id("company-name-input-field")).sendKeys(SignUp.BRAND_NAME); 
					
				// Enter Email Id into Email Address Input Field
				chromeDriver.findElement(By.id("admin-email-input-field")).sendKeys(SignUp.EMAIL_ID); 
				
				// Enter Password into Password Input Field
				chromeDriver.findElement(By.id("admin-password-input-field")).sendKeys((SignUp.PASSWORD));
				
				// Click on Sign Up Button
				chromeDriver.findElement(By.cssSelector("button[class='create-account-button button']")).click(); 
				new WebDriverWait(chromeDriver, LOADING_TIME_IN_SECONDS); 
			
		  
	  }
	  
	
	@Test
	  public void loadingHomepageByHttps() {
		
				System.out.println("Running Testcase 2 : loadingHomepageByHttps");
		  
				// Maximize the browser Window
				chromeDriver.manage().window().maximize(); 
				chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				
				// Launch Web Site  
				chromeDriver.get(BASE_URL); // Loading Stcsuper.com Web page
				chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				
				String text = chromeDriver.findElement(By.xpath("//h1[@class='app-name']")).getText();
				Assert.assertTrue(text != null);
				System.out.println("SignUp Successful!");
				
				// Click on SignUp Button
				chromeDriver.findElement(By.cssSelector("button[class='sign-up-button account-button button']")).click(); 
				chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
				
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
				 new WebDriverWait(chromeDriver, LOADING_TIME_IN_SECONDS); 
				
		  
	  }
	
	@AfterMethod
	public void closeBrowser(){
		chromeDriver.close();
		
	}
	  	  
}

