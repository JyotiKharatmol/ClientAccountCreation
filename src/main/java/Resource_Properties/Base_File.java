package Resource_Properties;
import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_File 
{
   public WebDriver driver;
   public Properties pro;
   
   public WebDriver initializeBrowser() throws IOException
   {  
   FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Resource_Properties/data.properties");
   pro = new Properties();
   pro.load(fis);
   String browserName = pro.getProperty("browser");
   
   if(browserName.equalsIgnoreCase("firefox"))
   {    
	  FirefoxOptions options = new FirefoxOptions();
	  
	  /*
	  
	  options.addArguments("--no-sandbox");
	  
	  options.addArguments("--disable-dev-shm-usage");
	  
	  options.addArguments("--headless");
	  
	  options.addArguments("disable-infobars");
	  
	  options.addArguments("--disable-extensions");
	  
	  options.addArguments("--window-size=1400, 600");
	  
	  options.addArguments("--disable-gbu"); 
	  
	  */
	  
	  WebDriverManager.firefoxdriver().setup();
	  
	  driver = new FirefoxDriver(options);	  
   }
   
   driver.manage().window().maximize();	
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
   return driver;	
   
   }
}
