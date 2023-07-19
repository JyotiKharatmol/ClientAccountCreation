package Resource_Properties;

import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_File 
{
   public WebDriver driver;
   public Properties pro;
   
   public WebDriver initializeBrowser() throws IOException
   {
   FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resource_Properties\\data.properties");
   pro = new Properties();
   pro.load(fis);
   String browserName = pro.getProperty("browser");
   
   
   if(browserName.equalsIgnoreCase("chrome"))
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti_xfiqe3z\\Desktop\\Personal\\Selenium Java\\Browser Driver\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   
   }
   
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	return driver;
	
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
