package Resource_Properties;
import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
   
   if(browserName.equalsIgnoreCase("chrome"))
   {    
	  ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--headless");
	  
	  options.addArguments("--disable-gbu");
	  
	  options.addArguments("--no-sandbox");
	  
	  options.addArguments("--disable-dev-shm-usage");
	  
	  options.addArguments("--disable-infobars");
	  
	  options.addArguments("--disable-extensions");
	  
	  options.addArguments("--window-size=1400, 600");
	  
	  WebDriverManager.chromiumdriver().setup();
	  
	  driver = new ChromeDriver(options);
   }
   
   driver.manage().window().maximize();	
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
   return driver;	
   
   }
}
