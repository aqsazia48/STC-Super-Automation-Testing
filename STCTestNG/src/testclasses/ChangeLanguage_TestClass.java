package testclasses;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangeLanguage_TestClass extends Configuration {
	
	WebDriver chromeDriver;
	
	@BeforeMethod
	public void initializationOfChromeDriver() {
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.chrome.driver",DRIVER_PATH );
		chromeDriver = new ChromeDriver();
			
}
 
	@Test
	public void englishToArabic() {
  
	 	System.out.println("Running Testcase 1 : Change Language from English to Arabic.");	
	 	
		// Maximize the browser Window
		chromeDriver.manage().window().maximize(); 
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME_IN_SECONDS, TimeUnit.SECONDS);
			
		// Launch Web Site  
		chromeDriver.get(BASE_URL); // Loading Stcsuper.com Web page
		
		WebDriverWait wait = new WebDriverWait(chromeDriver, LanguageChange.LOAD_TIME_IN_SECONDS); 
		wait.until(ExpectedConditions.titleContains("eCare")); 
		//chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME, TimeUnit.SECONDS);
			
		// Click on Login Button
		chromeDriver.findElement(By.cssSelector("button[class='change-language-button']")).click(); 
		wait.until(ExpectedConditions.titleContains("eCare")); 
			
		System.out.println("Running Testcase 2 : Change Language from Arabic to English.");	
		
		// Click on Login Button
		chromeDriver.findElement(By.cssSelector("button[class='change-language-button']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[class='sign-up-button account-button button']")));
		
		
}
  

	@AfterMethod
	public void closeBrowser()
	{
		chromeDriver.close();;
	} 


}
