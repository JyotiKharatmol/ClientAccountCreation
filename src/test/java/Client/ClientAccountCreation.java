package Client;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Resource_Properties.Base_File;
import Page_Objects.ClientSignUp;
import java.util.Random;

public class ClientAccountCreation extends Base_File 
{

	@BeforeMethod()
	public void initialize() throws IOException 
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
	}

	@Test
	public void AccountCreationWith_FreeClassPack() throws InterruptedException 
	{

		ClientSignUp a = new ClientSignUp(driver);
		a.FirstName().sendKeys("Robert");
		a.LastName().sendKeys("Smith");	
		Random ab = new Random();
		int randomInt = ab.nextInt(100);
		a.Email().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.PhoneNo().sendKeys("5345382834");
		a.DOB().sendKeys("09091995");
		a.Address1().sendKeys("101 Highland Street");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Maria");
		a.eLastName().sendKeys("Smith");
		a.eEmail().sendKeys("maria.smith@gmail.com");
		a.ePhoneNo().sendKeys("3453453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.zero$classPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Robert Smith");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Robert Smith");
		a.SaveAndContinue4().click();
		a.Confirm().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),
				"Congratulations! Your account has been created.");
				
	}
	
	@Test
	public void AccountCreationWith_PurchaseClassPack() 
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.FirstName().sendKeys("Micheal");
		a.LastName().sendKeys("Smith");
		Random ab = new Random();
		int randomInt = ab.nextInt(1000);
		a.Email().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.PhoneNo().sendKeys("2345434121");
		a.Address1().sendKeys("Highland Street 121");
		a.City().sendKeys("Atlanta");
		a.DOB().sendKeys("09091995");
		a.Zip().sendKeys("30303");
		a.State().click();
		a.Georgia().click();
		a.eFirstName().sendKeys("Patricia");
		a.eLastName().sendKeys("Smith");
		a.eEmail().sendKeys("patricia.smith@gmail.com");
		a.ePhoneNo().sendKeys("3453453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.$classPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("George Smith");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("George Smith");
		a.SaveAndContinue4().click();
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("4391");
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),
				"Congratulations! Your account has been created.");
	}


	@Test
	public void AccountCreationWith_PurchaseMembership()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.FirstName().sendKeys("Joseph");
		a.LastName().sendKeys("William");
		Random ab = new Random();
		int randomInt = ab.nextInt(1000);
		a.Email().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.PhoneNo().sendKeys("2345434121");
		a.Address1().sendKeys("Highland Street 121");
		a.City().sendKeys("Atlanta");
		a.DOB().sendKeys("09091995");
		a.Zip().sendKeys("30303");
		a.State().click();
		a.Georgia().click();
		a.eFirstName().sendKeys("Micheal");
		a.eLastName().sendKeys("William");
		a.eEmail().sendKeys("micheal.william@gmail.com");
		a.ePhoneNo().sendKeys("3453453412");
		a.eRelationship().sendKeys("Brother");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.memPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Joseph Williams");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Joseph Williams");
		a.SaveAndContinue4().click();
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("4391");
		a.agreeToChargeMonthlyCheckbox().click();
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),
				"Congratulations! Your account has been created.");
	}
	
	@Test
	public void AccountCreationWith_NoPackage() 
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.FirstName().sendKeys("Maria");
		a.LastName().sendKeys("Rodriguez");
		Random i = new Random();
		int randomInt = i.nextInt(1000);
		a.Email().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.PhoneNo().sendKeys("4834484031");
		a.Address1().sendKeys("Highland Street 121");
		a.DOB().sendKeys("03091995");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Johnson");
		a.eLastName().sendKeys("Rodriguez");
		a.eEmail().sendKeys("johnson.rodriguez@gmail.com");
		a.ePhoneNo().sendKeys("5838932917");
		a.eRelationship().sendKeys("Brother");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.skipPurchasePackageLater().click();
		a.skipPackage_Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Maria Rodriguez");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Maria Rodriguez");
		a.SaveAndContinue4().click();
		a.Confirm().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),
				"Congratulations! Your account has been created.");
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}
	
		
}
