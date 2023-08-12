package Client;
import java.io.IOException;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Resource_Properties.Base_File;
import Page_Objects.ClientSignUp;

public class ClientAccountCreation extends Base_File 
{

	@BeforeMethod()
	public void initialize() throws IOException 
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
	}
	
	@Test(priority=1)
	public void AccountCreationWith_NoPackage() 
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.DoYouHaveAcustomerAccount().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		a.dontHaveAnAccountClientSignUp().click();
		a.FirstName().sendKeys("Rose");
		a.LastName().sendKeys("Lavelle");	
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.PhoneNo().sendKeys("4834484031");
		a.DOB().sendKeys("03091995");
		a.selectGender().click();
		a.Female().click();
		a.Address1().sendKeys("Highland Street 120");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Emily");
		a.eLastName().sendKeys("Lavelle");
		a.eEmail().sendKeys("emily.lavelle@gmail.com");
		a.ePhoneNo().sendKeys("4838932917");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.skipPurchasePackageLater().click();
		a.skipPackage_Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Rose Lavelle");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Rose Lavelle");
		a.SaveAndContinue4().click();
		a.Confirm().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		Assert.assertEquals(a.dontHaveAPackageMessage().getText(), "You don't have a package on file for this session.\n"+"Would you like to purchase a new package?");
		
	}
	
	@Test(priority=2)
	public void AccountCreationWith_FreeTrailPack() throws InterruptedException 
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.DoYouHaveAcustomerAccount().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		a.dontHaveAnAccountClientSignUp().click();
		a.FirstName().sendKeys("Crystal");
		a.LastName().sendKeys("Dunn");	
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.PhoneNo().sendKeys("4845382834");
		a.DOB().sendKeys("09091995");
		a.selectGender().click();
		a.Female().click();
		a.Address1().sendKeys("Highland Street 100");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Meghan");
		a.eLastName().sendKeys("Dunn");
		a.eEmail().sendKeys("meghan.dunn@gmail.com");
		a.ePhoneNo().sendKeys("4853453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.zero$classPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Crystal Dunn");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Crystal Dunn");
		a.SaveAndContinue4().click();
		a.Confirm().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
		a.SessionOnCalendar().click();
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());		
		Assert.assertTrue(a.cancelSession().isDisplayed());
	}
	
	@Test(priority=3)
	public void AccountCreationWith_PurchaseClassPack() 
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.DoYouHaveAcustomerAccount().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		a.dontHaveAnAccountClientSignUp().click();
		a.FirstName().sendKeys("Sophia");
		a.LastName().sendKeys("Huerta");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.PhoneNo().sendKeys("4825434121");
		a.Address1().sendKeys("Highland Street 140");
		a.City().sendKeys("Atlanta");
		a.DOB().sendKeys("09091995");
		a.selectGender().click();
		a.Female().click();
		a.Zip().sendKeys("30303");
		a.State().click();
		a.Georgia().click();
		a.eFirstName().sendKeys("Alyssa");
		a.eLastName().sendKeys("Huerta");
		a.eEmail().sendKeys("alyssa.huerta@gmail.com");
		a.ePhoneNo().sendKeys("4853453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.$classPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Sophia Huerta");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Sophia Huerta");
		a.SaveAndContinue4().click();
		Assert.assertEquals(a.actualGrandTotalName().getText(), "Grand Total");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$1.00");
		a.promoCode().sendKeys("yog247");
		a.promoCodeApply().click();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName().getText(), "Promo-(yog247)");
		Assert.assertEquals(a.promoCodeAmount().getText(), "-$0.50");
		Assert.assertEquals(a.grandTotalNameAfterDiscount().getText(), "Grand Total");
		Assert.assertEquals(a.grandTotalAmountAfterDiscount().getText(), "$0.50");
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("4391");
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
		a.SessionOnCalendar().click();
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.cancelSession().isDisplayed());
		
	}
	
	@Test(priority=4)
	public void AccountCreationWith_PurchaseMemPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.DoYouHaveAcustomerAccount().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		a.dontHaveAnAccountClientSignUp().click();
		a.FirstName().sendKeys("Ashley");
		a.LastName().sendKeys("Sanchez");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.PhoneNo().sendKeys("4805434121");
		a.DOB().sendKeys("09091995");
		a.selectGender().click();
		a.Female().click();
		a.Address1().sendKeys("Highland Street 150");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Naomi");
		a.eLastName().sendKeys("Sanchez");
		a.eEmail().sendKeys("micheal.william@gmail.com");
		a.ePhoneNo().sendKeys("4853453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.xSessionsMemPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Ashley Sanchez");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Ashley Sanchez");
		a.SaveAndContinue4().click();	
		Assert.assertEquals(a.actualGrandTotalName().getText(), "Grand Total");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$1.00");
		a.promoCode().sendKeys("mempack23");
		a.promoCodeApply().click();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName().getText(), "Promo-(mempack23)");
		Assert.assertEquals(a.promoCodeAmount().getText(), "-$0.50");
		Assert.assertEquals(a.grandTotalNameAfterDiscount().getText(), "Grand Total");
		Assert.assertEquals(a.grandTotalAmountAfterDiscount().getText(), "$0.50");	
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("4391");
		a.agreeToChargeMonthlyCheckbox().click();
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
		a.SessionOnCalendar().click();
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.cancelSession().isDisplayed());
		
	}
	
	@Test(priority=5)
	public void AccountCreationWith_PurchaseUnlimitedMem()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.DoYouHaveAcustomerAccount().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		a.dontHaveAnAccountClientSignUp().click();
		a.FirstName().sendKeys("Morgan");
		a.LastName().sendKeys("Freeman");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.PhoneNo().sendKeys("4567765420");
		a.DOB().sendKeys("09301994");
		a.selectGender().click();
		a.Male().click();
		a.Address1().sendKeys("Highland Street 140");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Matthew");
		a.eLastName().sendKeys("Freeman");
		a.eEmail().sendKeys("matthew.freeman@gmail.com");
		a.ePhoneNo().sendKeys("4567876545");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.unlimitedMemPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Morgan Freeman");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Morgan Freeman");
		a.SaveAndContinue4().click();	
		Assert.assertEquals(a.actualGrandTotalName().getText(), "Grand Total");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$1.00");
		a.promoCode().sendKeys("mempack23");
		a.promoCodeApply().click();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName().getText(), "Promo-(mempack23)");
		Assert.assertEquals(a.promoCodeAmount().getText(), "-$0.50");
		Assert.assertEquals(a.grandTotalNameAfterDiscount().getText(), "Grand Total");
		Assert.assertEquals(a.grandTotalAmountAfterDiscount().getText(), "$0.50");	
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("1204");
		a.agreeToChargeMonthlyCheckbox().click();
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
		a.SessionOnCalendar().click();
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.cancelSession().isDisplayed());
	}
	
	
	@Test(priority=6)
	public void AccountCreationWith_FreeFirstMonthMemPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.DoYouHaveAcustomerAccount().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		a.dontHaveAnAccountClientSignUp().click();
		a.FirstName().sendKeys("Betty");
		a.LastName().sendKeys("White");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.PhoneNo().sendKeys("4565434567");
		a.DOB().sendKeys("09301994");
		a.selectGender().click();
		a.GenderVariant().click();
		a.Address1().sendKeys("Highland Street 120");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Olivia");
		a.eLastName().sendKeys("White");
		a.eEmail().sendKeys("olivia.white@gmail.com");
		a.ePhoneNo().sendKeys("4567645674");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.freeFirstMonthMemPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Betty White");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Betty White");
		a.SaveAndContinue4().click();
		Assert.assertEquals(a.$0grandTotal().getText(), "$0.00");
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("1041");
		a.agreeToChargeMonthlyCheckbox().click();
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(), "Congratulations! Your account has been created.");	
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
		a.SessionOnCalendar().click();
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.cancelSession().isDisplayed());
	}
	
	
	
	@Test(priority=7)
	public void AccountCreationWith_PurchaseClassAndMemPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.DoYouHaveAcustomerAccount().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		a.dontHaveAnAccountClientSignUp().click();
		a.FirstName().sendKeys("Anne");
		a.LastName().sendKeys("Hathaway");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.PhoneNo().sendKeys("4825434121");
		a.DOB().sendKeys("09091995");
		a.selectGender().click();
		a.PreferNotDisclose().click();
		a.Address1().sendKeys("Highland Street 125");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Shirley");
		a.eLastName().sendKeys("Hathaway");
		a.eEmail().sendKeys("shirley.hathaway@gmail.com");
		a.ePhoneNo().sendKeys("4253453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.$classPack().click();
		a.xSessionsMemPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Anne Hathaway");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Anne Hathway");
		a.SaveAndContinue4().click();
		Assert.assertEquals(a.actualGrandTotalName_ClassAndMem().getText(), "Grand Total");
		Assert.assertEquals(a.actualGrandTotalAmount_ClassAndMem().getText(), "$2.00");
		a.promoCode().sendKeys("mempack23");
		a.promoCodeApply().click();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName_ClassAndMem().getText(), "Promo-(mempack23)");
		Assert.assertEquals(a.promoCodeAmount_ClassAndMem().getText(), "-$0.50");
		Assert.assertEquals(a.grandTotalName_ClassAndMem_AfterDiscount().getText(), "Grand Total");
		Assert.assertEquals(a.grandTotalAmount_ClassAndMem_AfterDiscount().getText(), "$1.50");
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("4391");
		a.agreeToChargeMonthlyCheckbox().click();
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
		a.SessionOnCalendar().click();
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.cancelSession().isDisplayed());	
	}	
	
	
	@Test(priority=8)
	public void AccountCreationWith_PurchaseClassAndMemPack_ClassPackPromo()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.DoYouHaveAcustomerAccount().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		a.dontHaveAnAccountClientSignUp().click();
		a.FirstName().sendKeys("Ava");
		a.LastName().sendKeys("Hathaway");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.PhoneNo().sendKeys("4825434121");
		a.DOB().sendKeys("09091995");
		a.selectGender().click();
		a.PreferNotDisclose().click();
		a.Address1().sendKeys("Highland Street 125");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Shirley");
		a.eLastName().sendKeys("Hathaway");
		a.eEmail().sendKeys("shirley.hathaway@gmail.com");
		a.ePhoneNo().sendKeys("4253453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.$classPack().click();
		a.xSessionsMemPack().click();
		a.SaveAndContinue2().click();
		a.Term1Checkbox().click();
		a.Term2Checkbox().click();
		a.DefaultCheckbox().click();
		a.TypeFullName().sendKeys("Anne Hathaway");
		a.SaveAndContinue3().click();
		a.PoliciesTerm1().click();
		a.PoliciesTerm2().click();
		a.PoliciesDefaultCheckbox().click();
		a.PoliciesTypeFullName().sendKeys("Anne Hathway");
		a.SaveAndContinue4().click();
		Assert.assertEquals(a.actualGrandTotalName_ClassAndMem().getText(), "Grand Total");
		Assert.assertEquals(a.actualGrandTotalAmount_ClassAndMem().getText(), "$2.00");
		a.promoCode().sendKeys("yog247");
		a.promoCodeApply().click();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName_ClassAndMem().getText(), "Promo-(yog247)");
		Assert.assertEquals(a.promoCodeAmount_ClassAndMem().getText(), "-$0.50");
		Assert.assertEquals(a.grandTotalName_ClassAndMem_AfterDiscount().getText(), "Grand Total");
		Assert.assertEquals(a.grandTotalAmount_ClassAndMem_AfterDiscount().getText(), "$1.50");
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("4391");
		a.agreeToChargeMonthlyCheckbox().click();
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
		a.SessionOnCalendar().click();
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.cancelSession().isDisplayed());
		
	}
	
	
	
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}
	
		
}
