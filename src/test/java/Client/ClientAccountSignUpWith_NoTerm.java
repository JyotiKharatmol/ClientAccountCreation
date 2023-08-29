package Client;
import java.io.IOException;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Page_Objects.ClientSignUp;
import Resource_Properties.Base_File;

public class ClientAccountSignUpWith_NoTerm extends Base_File
{

	@BeforeMethod
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url1"));
	}
	
	@Test(priority=1)
	public void SignUp_AccountCreationWith_NoTerm_NoPackage()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		a.FirstName().sendKeys("Brie");
		a.LastName().sendKeys("Johnsson");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.PhoneNo().sendKeys("4526534563");
		a.DOB().sendKeys("09061994");
		a.selectGender().click();
		a.Female().click();
		a.Address1().sendKeys("Highland Street 120");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Alex");
		a.eLastName().sendKeys("Johnsson");
		a.eEmail().sendKeys("alex.johnsson@gmail.com");
		a.ePhoneNo().sendKeys("4625676548");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.skipPurchasePackageLater().click();
		a.skipPackage_NoStudioTermAdded_DefaultWaiverTerm().click();
		a.TypeFullName().sendKeys("Brie Johnsson");
		a.SaveAndContinue3().click();
		a.NoStudioTermAdded_DefaultPoliciesTerm().click();
		a.PoliciesTypeFullName().sendKeys("Brie Johnsson");
		a.SaveAndContinue4().click();
		a.Confirm().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		Assert.assertEquals(a.dontHaveAPackageMessage().getText(), "You don't have a package on file for this session.\n"+"Would you like to purchase a new package?");
				
	}
	
	@Test(priority=2)
	public void SignUp_AccountCreationWith_NoTerm_FreeTrailPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		a.FirstName().sendKeys("Jennifer");
		a.LastName().sendKeys("Lawrence");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.PhoneNo().sendKeys("4624565674");
		a.DOB().sendKeys("03091994");
		a.selectGender().click();
		a.Female().click();
		a.Address1().sendKeys("Highland Street 140");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Anne");
		a.eLastName().sendKeys("Lawrence");
		a.eEmail().sendKeys("anne.lawrence@gmail.com");
		a.ePhoneNo().sendKeys("4626456842");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.zero$classPack().click();
		a.SaveAndContinue2().click();
		a.NoStudioTermAdded_DefaultWaiverTerm().click();
		a.TypeFullName().sendKeys("Jennifer Lawrence");
		a.SaveAndContinue3().click();
		a.NoStudioTermAdded_DefaultPoliciesTerm().click();
		a.PoliciesTypeFullName().sendKeys("Jennifer Lawrence");
		a.SaveAndContinue4().click();
		a.Confirm().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.Login().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));	
	}
	
	@Test(priority=3)
	public void SignUp_AccountCreationWith_NoTerm_PurchaseClassPack() 
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		a.FirstName().sendKeys("Alexandra");
		a.LastName().sendKeys("Daddario");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.PhoneNo().sendKeys("4825434121");
		a.Address1().sendKeys("Highland Street 120");
		a.City().sendKeys("Atlanta");
		a.DOB().sendKeys("09091995");
		a.selectGender().click();
		a.Female().click();
		a.Zip().sendKeys("30303");
		a.State().click();
		a.Georgia().click();
		a.eFirstName().sendKeys("Nina");
		a.eLastName().sendKeys("Daddario");
		a.eEmail().sendKeys("nina.daddario@gmail.com");
		a.ePhoneNo().sendKeys("4853453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.$classPack().click();
		a.SaveAndContinue2().click();
		a.NoStudioTermAdded_DefaultWaiverTerm().click();
		a.TypeFullName().sendKeys("Alexandra Daddario");
		a.SaveAndContinue3().click();
		a.NoStudioTermAdded_DefaultPoliciesTerm().click();
		a.PoliciesTypeFullName().sendKeys("Alexandra Daddario");
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
		a.Login_afterPay().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
	}
	
	@Test(priority=4)
	public void SignUp_AccountCreationWith_NoTerm_PurchaseMemPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		a.FirstName().sendKeys("Elizabeth");
		a.LastName().sendKeys("Olsen");
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
		a.eFirstName().sendKeys("Natalie");
		a.eLastName().sendKeys("Olsen");
		a.eEmail().sendKeys("natalie.olsen@gmail.com");
		a.ePhoneNo().sendKeys("4853453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.xSessionsMemPack().click();
		a.SaveAndContinue2().click();
		a.NoStudioTermAdded_DefaultWaiverTerm().click();
		a.TypeFullName().sendKeys("Elizabeth Olsen");
		a.SaveAndContinue3().click();
		a.NoStudioTermAdded_DefaultPoliciesTerm().click();
		a.PoliciesTypeFullName().sendKeys("Elizabeth Olsen");
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
		a.Login_afterPay().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
	}
	
	@Test(priority=5)
	public void SignUp_AccountCreationWith_NoTerm_PurchaseUnlimitedMem()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		a.FirstName().sendKeys("Matthew");
		a.LastName().sendKeys("McConaughey");
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
		a.eFirstName().sendKeys("Alex");
		a.eLastName().sendKeys("McConaughey");
		a.eEmail().sendKeys("alex.mcconaughey@gmail.com");
		a.ePhoneNo().sendKeys("4567876545");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.unlimitedMemPack().click();
		a.SaveAndContinue2().click();
		a.NoStudioTermAdded_DefaultWaiverTerm().click();
		a.TypeFullName().sendKeys("Matthew McConaughey");
		a.SaveAndContinue3().click();
		a.NoStudioTermAdded_DefaultPoliciesTerm().click();
		a.PoliciesTypeFullName().sendKeys("Matthew McConaughey");
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
		a.Login_afterPay().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));	
	}
	
	@Test(priority=6)
	public void SignUp_AccountCreationWith_NoTerm_FreeFirstMonthMemPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		a.FirstName().sendKeys("Julianne");
		a.LastName().sendKeys("Moore");
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
		a.eFirstName().sendKeys("Odette");
		a.eLastName().sendKeys("Moore");
		a.eEmail().sendKeys("odette.moore@gmail.com");
		a.ePhoneNo().sendKeys("4567645674");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.freeFirstMonthMemPack().click();
		a.SaveAndContinue2().click();
		a.NoStudioTermAdded_DefaultWaiverTerm().click();
		a.TypeFullName().sendKeys("Julianne Moore");
		a.SaveAndContinue3().click();
		a.NoStudioTermAdded_DefaultPoliciesTerm().click();
		a.PoliciesTypeFullName().sendKeys("Julianne Moore");
		a.SaveAndContinue4().click();
		Assert.assertEquals(a.actualGrandTotalName().getText(), "Grand Total");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$0.00");
		a.sameAsClientDetails().click();
		a.EnterCreditCardNo().sendKeys("4242424242424242");
		a.EnterExpiryDate().sendKeys("0224");
		a.EnterCVV().sendKeys("1041");
		a.agreeToChargeMonthlyCheckbox().click();
		a.Confirm_pay().click();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(), "Congratulations! Your account has been created.");	
		a.Login_afterPay().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
	}
	
	@Test(priority=7)
	public void SignUp_AccountCreationWith_NoTerm_PurchaseClassAndMemPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		a.FirstName().sendKeys("Elle");
		a.LastName().sendKeys("Fanning");
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
		a.eFirstName().sendKeys("Emilia");
		a.eLastName().sendKeys("Fanning");
		a.eEmail().sendKeys("emilia.fanning@gmail.com");
		a.ePhoneNo().sendKeys("4253453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.$classPack().click();
		a.xSessionsMemPack().click();
		a.SaveAndContinue2().click();
		a.NoStudioTermAdded_DefaultWaiverTerm().click();
		a.TypeFullName().sendKeys("Elle Fanning");
		a.SaveAndContinue3().click();
		a.NoStudioTermAdded_DefaultPoliciesTerm().click();
		a.PoliciesTypeFullName().sendKeys("Elle Fanning");
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
		a.Login_afterPay().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));	
	}	
	
	
	@Test(priority=8)
	public void SignUp_AccountCreationWith_NoTerm_PurchaseClassAndMemPack_ClassPackPromoCode()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink().click();
		a.FirstName().sendKeys("Isabella");
		a.LastName().sendKeys("Fanning");
		String randomInt = RandomStringUtils.randomAlphanumeric(3);
		a.Email().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.PhoneNo().sendKeys("4825434121");
		a.DOB().sendKeys("09091995");
		a.selectGender().click();
		a.PreferNotDisclose().click();
		a.Address1().sendKeys("Highland Street 120");
		a.City().sendKeys("Atlanta");
		a.State().click();
		a.Georgia().click();
		a.Zip().sendKeys("30303");
		a.eFirstName().sendKeys("Emma");
		a.eLastName().sendKeys("Fanning");
		a.eEmail().sendKeys("emma.fanning@gmail.com");
		a.ePhoneNo().sendKeys("4253453412");
		a.eRelationship().sendKeys("Sister");
		a.Password().sendKeys("Password@3");
		a.ConfirmPassword().sendKeys("Password@3");
		a.SaveAndContinue1().click();
		a.$classPack().click();
		a.xSessionsMemPack().click();
		a.SaveAndContinue2().click();
		a.NoStudioTermAdded_DefaultWaiverTerm().click();
		a.TypeFullName().sendKeys("Isabella Fanning");
		a.SaveAndContinue3().click();
		a.NoStudioTermAdded_DefaultPoliciesTerm().click();
		a.PoliciesTypeFullName().sendKeys("Isabella Fanning");
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
		a.Login_afterPay().click();
		a.clientUsername().sendKeys("jyoti.kharatmol+" + randomInt + "@azularc.com");
		a.clientPassword().sendKeys("Password@3");
		a.clientLogin().click();
		a.SessionOnCalendar().click();
		a.sessionSignUp().click();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));	
	}	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

	
}
