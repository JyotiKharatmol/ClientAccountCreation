package abstractComponents;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract 
{

	WebDriver driver;

	public Abstract(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "#/fit/solo-client/client/app")
	WebElement calendar;
	
	public WebElement Calendar() 
	{
		return calendar;
	}

	@FindBy(xpath = "//ul/a[2]/div")
	WebElement signUp;
	
	public WebElement SignUp() 
	{
		return signUp;
	}

	@FindBy(xpath = "//span[text()='LOG IN']")
	WebElement login;

	public WebElement Login() 
	{
		return login;
	}
	
	public void waitForVisibilityOfElement(WebElement a)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.visibilityOf(a));
	}
	
	public void waitForElementToBeClickable(WebElement a) 
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.elementToBeClickable(a));
	}
	
	public void waitForAttributeOfElementToBe(WebElement a, String b, String c) 
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.attributeToBe(a, b, c));
	}

	public void waitForTextInElement(WebElement a, String b) 
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.textToBePresentInElement(a, b));

	}
	public void waitForInvisibilityOfWebElement(WebElement a)
	{ 
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.invisibilityOf(a));		
	}

	
	
	
}
