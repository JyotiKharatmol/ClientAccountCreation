package testComponents;
import java.time.Duration;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
   public WebDriver driver;
   public Properties pro;
   
   public WebDriver initializeBrowser() throws IOException
   {  
   FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/GlobalData.properties");
   pro = new Properties();
   pro.load(fis);
   String browserName = pro.getProperty("browser");
   
   if(browserName.equalsIgnoreCase("chrome"))
   {    
	  ChromeOptions options = new ChromeOptions();
	 
	  options.addArguments("--no-sandbox"); 
	  options.addArguments("--disable-dev-shm-usage");
	  options.addArguments("--headless");
	  options.addArguments("--disable-gpu");
	  options.addArguments("--disable-infobars");
	  options.addArguments("--disable-extensions");
	  options.addArguments("--window-size=1400, 600");
	 
	
	  WebDriverManager.chromedriver().setup(); 
	  driver = new ChromeDriver(options);
   }
   driver.manage().window().maximize();	
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));	
   return driver;	
   }
   
   public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
   {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(System.getProperty("user.dir")+"//reports//"+ testCaseName +".png");
	FileUtils.copyFile(source, dest);
	return System.getProperty("user.dir")+"//reports//"+ testCaseName + ".png";
	
   } 
   

}
