package Resource_Properties;

import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
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
	  driver = WebDriverManager.chromedriver().create();
	   
   }
   
 
   driver.manage().window().maximize();	
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	return driver;
   }
	
	
}
