package sa.test.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import sa.test.pageObjects.SAHome;





public class BaseTest{
	
  public static WebDriver driver;
  public static SAHome sahome;
  public static CommonConfig config;
  
	
	
	public static WebDriver InitializeDriver() {
		
		
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
	    //System.setProperty("WebDriver.chrome.driver", "D:\\Softwares\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 return driver;
		 
	}
	
	
	@BeforeMethod
	public static SAHome launchApp() {
		
		driver= InitializeDriver();
		sahome=new SAHome(driver);
		sahome.goTo(ConfigVar.baseUrl);
        return sahome;
	
		
	}
	
	@AfterMethod(alwaysRun=true)
	
	public void tearDown()
	{
		driver.close();
	}
    }
	
	
	
	
	
	
	
	
	


