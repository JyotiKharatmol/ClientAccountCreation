package Client;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page_Objects.ClientSignUp;
import Resource_Properties.Base_File;

public class ClientSignUpLink extends Base_File
{


	@BeforeMethod
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
		
	}
	
	@Test
	public void noPackageClientLogin()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://smartstudio-stage.azul-arc.com/#/alias29/solo-client/client/app/client-signup");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
}
