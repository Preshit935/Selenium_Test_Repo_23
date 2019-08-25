package seleniummaventest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SeleniumMavenTest {
	
	private WebDriver driver;
	private static Logger Log = Logger.getLogger(Logs.class.getName());
	
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  Log.info("New Driver instantiated");
		  
	  }
	
  @Test
  public void f() {
	  driver.get("https://accounts.google.com/signin");
	  Log.info("Web Application Launched");
	  String title = driver.getTitle();
	  Log.info("Web Application Launched"+ title );
	  Assert.assertTrue(title.contains("Sign in – Google accounts"));
	  
  }
 
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
