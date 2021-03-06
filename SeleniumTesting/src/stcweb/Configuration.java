package stcweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Configuration {

	// declaration and instantiation of objects/variables  
	final static int LOADING_TIME = 10;
	final static String BASE_URL = "https://stcsuper.com/";
	final static String DRIVER_PATH = "C:\\Users\\zi gaming\\eclipse-workspace\\SeleniumTesting\\chromedriver.exe";
	
	public class Login{
		final static String EMAIL_ID = "ahmadshahwaiz@gmail.com";
		final static String PASSWORD = "nihari123";
	}
	
	public class SignUp{
		final static String NAME = "Aqsa Zia";
		final static String BRAND_NAME = "My Brand";
		final static String EMAIL_ID = "shahwaiz90@yahoo.com";
		final static String PASSWORD = "Nihari123";
	}
	
	public static void loadingWebpage(WebDriver chromeDriver) { 
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
		// Maximize the browser Window
		chromeDriver.manage().window().maximize(); 
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME, TimeUnit.SECONDS);
		
		// Launch Web Site  
		chromeDriver.get(BASE_URL); // Loading Stcsuper.com Web page
		chromeDriver.manage().timeouts().implicitlyWait(LOADING_TIME, TimeUnit.SECONDS);
	}
}
