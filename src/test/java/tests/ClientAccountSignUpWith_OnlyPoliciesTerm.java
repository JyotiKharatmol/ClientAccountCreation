package tests;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.ClientSignUp;
import testComponents.BaseTest;


public class ClientAccountSignUpWith_OnlyPoliciesTerm extends BaseTest
{

	@BeforeMethod
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("urlWith_OnlyPoliciesTerm"));
	}
	
	@Test(priority=1)
	public void SignUp_AccountCreationWithOnlyPoliciesTerm_NoPackage()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink();
		a.enterFirstName();
		a.enterLastName();
		String randomInt = a.enterEmail();
		a.enterPhoneNo();
		a.enterDOB();
		a.selectGender();
		a.selectGender_female();
		a.enterAddress1();
		a.enterCity();
		a.selectState();
		a.selectState_georgia();
		a.enterZip();
		a.enterEFirstName();
		a.enterELastName();
		a.enterEEmail();
		a.enterEPhoneNo();
		a.enterERelationship();
		a.enterPassword();
		a.enterConfirmPassword();
		a.saveAndContinue1();
		a.skipIWillPurchasePackageLater();
		
		a.NoStudioTermAdded_DefaultWaiverTermCheckbox();
		a.waiverTypeFullName();
		a.saveAndContinue3();
		a.agreeToPoliciesTerm1Checkbox();
		a.agreeToPoliciesTerm2Checkbox();
		a.agreeToPoliciesDefaultTermCheckbox();
		a.policiesTypeFullName();
		a.saveAndContinue4();
	
		Assert.assertEquals(a.confirmFirstName().getText(), "Rose");
		Assert.assertEquals(a.confirmLastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEmail().getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.confirmPhoneNo().getText(), "4834484031");
		Assert.assertEquals(a.confirmAddress().getText(), "Highland Street 120");
		Assert.assertEquals(a.confirmEFirstName().getText(), "Emily");
		Assert.assertEquals(a.confirmELastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEEmail().getText(), "emily.lavelle@gmail.com");
		Assert.assertEquals(a.confirmEPhoneNo().getText(), "4838932917");
		Assert.assertEquals(a.confirmERelationship().getText(), "Sister");
		a.confirmAccountCreation();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.login();
		a.enterClientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.enterClientPassword();
		a.clientLogin();
		a.selectSessionOnCalendar();
		a.signUpForSelectedSession();
		Assert.assertEquals(a.dontHaveAPackageMessage().getText(), "You don't have a package on file for this session.\n"+"Would you like to purchase a new package?");			
	}
	
	@Test(priority=2)
	public void SignUp_AccountCreationWithOnlyPoliciesTerm_FreeTrailPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink();
		a.enterFirstName();
		a.enterLastName();
		String randomInt = a.enterEmail();
		a.enterPhoneNo();
		a.enterDOB();
		a.selectGender();
		a.selectGender_female();
		a.enterAddress1();
		a.enterCity();
		a.selectState();
		a.selectState_georgia();
		a.enterZip();
		a.enterEFirstName();
		a.enterELastName();
		a.enterEEmail();
		a.enterEPhoneNo();
		a.enterERelationship();
		a.enterPassword();
		a.enterConfirmPassword();
		a.saveAndContinue1();
		Assert.assertEquals(a.zero$classPack_Name().getText(), "Free Yoga Trail Session Pack");
		Assert.assertEquals(a.zero$classPack_Price().getText(), "$0.00");
		Assert.assertEquals(a.zero$classPack_Expiry().getText(), "Valid thru 1 Year from Date of Purchase");
		a.selectZero$classPack();
		a.saveAndContinue2();
		
		a.NoStudioTermAdded_DefaultWaiverTermCheckbox();
		a.waiverTypeFullName();
		a.saveAndContinue3();
		a.agreeToPoliciesTerm1Checkbox();
		a.agreeToPoliciesTerm2Checkbox();
		a.agreeToPoliciesDefaultTermCheckbox();
		a.policiesTypeFullName();
		a.saveAndContinue4();
		
		Assert.assertEquals(a.confirmFirstName().getText(), "Rose");
		Assert.assertEquals(a.confirmLastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEmail().getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.confirmPhoneNo().getText(), "4834484031");
		Assert.assertEquals(a.confirmAddress().getText(), "Highland Street 120");
		Assert.assertEquals(a.confirmEFirstName().getText(), "Emily");
		Assert.assertEquals(a.confirmELastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEEmail().getText(), "emily.lavelle@gmail.com");
		Assert.assertEquals(a.confirmEPhoneNo().getText(), "4838932917");
		Assert.assertEquals(a.confirmERelationship().getText(), "Sister");
		Assert.assertEquals(a.confirmPackageName().getText(), "Free Yoga Trail Session Pack");
		Assert.assertEquals(a.confirmPriceOnClassPack().getText(), "$0.00");
		Assert.assertEquals(a.confirmExpiryOnClassPack().getText(), "Valid thru 1 Year from Date of Purchase");
		Assert.assertEquals(a.confirmPrice().getText(), "$0.00");
		Assert.assertEquals(a.actualGrandTotalName().getText(), "You Pay Today");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$0.00");
		a.confirmAccountCreation();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.login();
		a.enterClientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.enterClientPassword();
		a.clientLogin();
		a.selectSessionOnCalendar();
		a.signUpForSelectedSession();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
	}
	
	@Test(priority=3)
	public void SignUp_AccountCreationWithOnlyPoliciesTerm_PurchaseClassPack() 
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink();
		a.enterFirstName();
		a.enterLastName();
		String randomInt = a.enterEmail();
		a.enterPhoneNo();
		a.enterDOB();
		a.selectGender();
		a.selectGender_genderVariant();
		a.enterAddress1();
		a.enterCity();
		a.selectState();
		a.selectState_georgia();
		a.enterZip();
		a.enterEFirstName();
		a.enterELastName();
		a.enterEEmail();
		a.enterEPhoneNo();
		a.enterERelationship();
		a.enterPassword();
		a.enterConfirmPassword();
		a.saveAndContinue1();
		Assert.assertEquals(a.$classPack_Name().getText(), "Yoga Session Pack");
		Assert.assertEquals(a.$classPack_Price().getText(), "$1.50");
		Assert.assertEquals(a.$classPack_Expiry().getText(), "Valid thru 1 Year from Date of Purchase");
		a.select$classPack();
		a.saveAndContinue2();
		
		a.NoStudioTermAdded_DefaultWaiverTermCheckbox();
		a.waiverTypeFullName();
		a.saveAndContinue3();
		a.agreeToPoliciesTerm1Checkbox();
		a.agreeToPoliciesTerm2Checkbox();
		a.agreeToPoliciesDefaultTermCheckbox();
		a.policiesTypeFullName();
		a.saveAndContinue4();
		
		Assert.assertEquals(a.confirmFirstName().getText(), "Rose");
		Assert.assertEquals(a.confirmLastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEmail().getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.confirmPhoneNo().getText(), "4834484031");
		Assert.assertEquals(a.confirmAddress().getText(), "Highland Street 120");
		Assert.assertEquals(a.confirmEFirstName().getText(), "Emily");
		Assert.assertEquals(a.confirmELastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEEmail().getText(), "emily.lavelle@gmail.com");
		Assert.assertEquals(a.confirmEPhoneNo().getText(), "4838932917");
		Assert.assertEquals(a.confirmERelationship().getText(), "Sister");
		Assert.assertEquals(a.confirmPackageName().getText(), "Yoga Session Pack");
		Assert.assertEquals(a.confirmPriceOnClassPack().getText(), "$1.50");
		Assert.assertEquals(a.confirmExpiryOnClassPack().getText(), "Valid thru 1 Year from Date of Purchase");
		Assert.assertEquals(a.confirmPrice().getText(), "$1.50");
		Assert.assertEquals(a.actualGrandTotalName().getText(), "You Pay Today");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$1.50");
		a.enterSessionPackPromoCode();
		a.promoCodeApply();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName().getText(), "Promo-(yog247)");
		Assert.assertEquals(a.promoCodeAmount().getText(), "-$0.50");
		Assert.assertEquals(a.grandTotalNameAfterDiscount().getText(), "You Pay Today");
		Assert.assertEquals(a.grandTotalAmountAfterDiscount().getText(), "$1.00");
		a.sameAsClientDetailsCheck();
		Assert.assertEquals(a.cardHolderFirstName().getAttribute("value"), "Rose");
		Assert.assertEquals(a.cardHolderLastName().getAttribute("value"), "Lavelle");
		Assert.assertEquals(a.cardHolderEmail().getAttribute("value"), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.cardHolderAddress().getAttribute("value"), "Highland Street 120");
		Assert.assertEquals(a.cardHolderCity().getAttribute("value"), "Atlanta");
		Assert.assertEquals(a.cardHolderZip().getAttribute("value"), "30303");
		a.enterCreditCardNo();
		a.enterExpiryDate();
		a.enterCVV();
		a.confirm_pay();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.login_afterPay();
		a.enterClientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.enterClientPassword();
		a.clientLogin();
		a.selectSessionOnCalendar();
		a.signUpForSelectedSession();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
	}
	
	@Test(priority=4)
	public void SignUp_AccountCreationWithOnlyPoliciesTerm_PurchaseMemPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink();
		a.enterFirstName();
		a.enterLastName();
		String randomInt = a.enterEmail();
		a.enterPhoneNo();
		a.enterDOB();
		a.selectGender();
		a.selectGender_female();
		a.enterAddress1();
		a.enterCity();
		a.selectState();
		a.selectState_georgia();
		a.enterZip();
		a.enterEFirstName();
		a.enterELastName();
		a.enterEEmail();
		a.enterEPhoneNo();
		a.enterERelationship();
		a.enterPassword();
		a.enterConfirmPassword();
		a.saveAndContinue1();
		a.moveRightArrow();
		Assert.assertEquals(a.xSessionsMemPack_Name().getText(), "1 Year Pilates Membership Package");
		Assert.assertEquals(a.xSessionsMemPack_Price().getText(), "$2.00");
		Assert.assertEquals(a.xSessionsMemPack_AutoPayInterval().getText(), "Per Month");
		a.selectXSessionsMemPack();
		a.saveAndContinue2();
		
		a.NoStudioTermAdded_DefaultWaiverTermCheckbox();
		a.waiverTypeFullName();
		a.saveAndContinue3();
		a.agreeToPoliciesTerm1Checkbox();
		a.agreeToPoliciesTerm2Checkbox();
		a.agreeToPoliciesDefaultTermCheckbox();
		a.policiesTypeFullName();
		a.saveAndContinue4();
		
		Assert.assertEquals(a.confirmFirstName().getText(), "Rose");
		Assert.assertEquals(a.confirmLastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEmail().getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.confirmPhoneNo().getText(), "4834484031");
		Assert.assertEquals(a.confirmAddress().getText(), "Highland Street 120");
		Assert.assertEquals(a.confirmEFirstName().getText(), "Emily");
		Assert.assertEquals(a.confirmELastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEEmail().getText(), "emily.lavelle@gmail.com");
		Assert.assertEquals(a.confirmEPhoneNo().getText(), "4838932917");
		Assert.assertEquals(a.confirmERelationship().getText(), "Sister");
		Assert.assertEquals(a.confirmPackageName().getText(), "1 Year Pilates Membership Package");
		Assert.assertEquals(a.confirmPriceOnMemPack().getText(), "$2.00");
		Assert.assertEquals(a.confirmAutoPayIntervalOnMemPack().getText(), "Per Month");
		Assert.assertEquals(a.confirmPrice().getText(), "$2.00");
		Assert.assertEquals(a.actualGrandTotalName().getText(), "You Pay Today");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$2.00");
		a.enterMemPackPromoCode();
		a.promoCodeApply();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName().getText(), "Promo-(mempack23)");
		Assert.assertEquals(a.promoCodeAmount().getText(), "-$0.80");
		Assert.assertEquals(a.grandTotalNameAfterDiscount().getText(), "You Pay Today");
		Assert.assertEquals(a.grandTotalAmountAfterDiscount().getText(), "$1.20");	
		a.sameAsClientDetailsCheck();
		Assert.assertEquals(a.cardHolderFirstName().getAttribute("value"), "Rose");
		Assert.assertEquals(a.cardHolderLastName().getAttribute("value"), "Lavelle");
		Assert.assertEquals(a.cardHolderEmail().getAttribute("value"), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.cardHolderAddress().getAttribute("value"), "Highland Street 120");
		Assert.assertEquals(a.cardHolderCity().getAttribute("value"), "Atlanta");
		Assert.assertEquals(a.cardHolderZip().getAttribute("value"), "30303");
		a.enterCreditCardNo();
		a.enterExpiryDate();
		a.enterCVV();
		a.agreeToChargeMonthlyCheckbox();
		a.confirm_pay();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.login_afterPay();
		a.enterClientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.enterClientPassword();
		a.clientLogin();
		a.selectSessionOnCalendar();
		a.signUpForSelectedSession();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
	}
	
	@Test(priority=5)
	public void SignUp_AccountCreationWithOnlyPoliciesTerm_PurchaseUnlimitedMem()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink();
		a.enterFirstName();
		a.enterLastName();
		String randomInt = a.enterEmail();
		a.enterPhoneNo();
		a.enterDOB();
		a.selectGender();
		a.selectGender_female();
		a.enterAddress1();
		a.enterCity();
		a.selectState();
		a.selectState_georgia();
		a.enterZip();
		a.enterEFirstName();
		a.enterELastName();
		a.enterEEmail();
		a.enterEPhoneNo();
		a.enterERelationship();
		a.enterPassword();
		a.enterConfirmPassword();
		a.saveAndContinue1();
		Assert.assertEquals(a.unlimitedMemPack_Name().getText(), "1 Year Unlimited Membership Package");
		Assert.assertEquals(a.unlimitedMemPack_Price().getText(), "$1.00");
		Assert.assertEquals(a.unlimitedMemPack_AutoPayInterval().getText(), "Per Month");
		a.selectUnlimitedMemPack();
		a.saveAndContinue2();
		
		a.NoStudioTermAdded_DefaultWaiverTermCheckbox();
		a.waiverTypeFullName();
		a.saveAndContinue3();
		a.agreeToPoliciesTerm1Checkbox();
		a.agreeToPoliciesTerm2Checkbox();
		a.agreeToPoliciesDefaultTermCheckbox();
		a.policiesTypeFullName();
		a.saveAndContinue4();
		
		Assert.assertEquals(a.confirmFirstName().getText(), "Rose");
		Assert.assertEquals(a.confirmLastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEmail().getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.confirmPhoneNo().getText(), "4834484031");
		Assert.assertEquals(a.confirmAddress().getText(), "Highland Street 120");
		Assert.assertEquals(a.confirmEFirstName().getText(), "Emily");
		Assert.assertEquals(a.confirmELastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEEmail().getText(), "emily.lavelle@gmail.com");
		Assert.assertEquals(a.confirmEPhoneNo().getText(), "4838932917");
		Assert.assertEquals(a.confirmERelationship().getText(), "Sister");
		Assert.assertEquals(a.confirmPackageName().getText(), "1 Year Unlimited Membership Package");
		Assert.assertEquals(a.confirmPriceOnMemPack().getText(), "$1.00");
		Assert.assertEquals(a.confirmAutoPayIntervalOnMemPack().getText(), "Per Month");
		Assert.assertEquals(a.confirmPrice().getText(), "$1.00");
		Assert.assertEquals(a.actualGrandTotalName().getText(), "You Pay Today");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$1.00");
		a.enterMemPackPromoCode();
		a.promoCodeApply();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName().getText(), "Promo-(mempack23)");
		Assert.assertEquals(a.promoCodeAmount().getText(), "-$0.40");
		Assert.assertEquals(a.grandTotalNameAfterDiscount().getText(), "You Pay Today");
		Assert.assertEquals(a.grandTotalAmountAfterDiscount().getText(), "$0.60");	
		a.sameAsClientDetailsCheck();
		Assert.assertEquals(a.cardHolderFirstName().getAttribute("value"), "Rose");
		Assert.assertEquals(a.cardHolderLastName().getAttribute("value"), "Lavelle");
		Assert.assertEquals(a.cardHolderEmail().getAttribute("value"), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.cardHolderAddress().getAttribute("value"), "Highland Street 120");
		Assert.assertEquals(a.cardHolderCity().getAttribute("value"), "Atlanta");
		Assert.assertEquals(a.cardHolderZip().getAttribute("value"), "30303");
		a.enterCreditCardNo();
		a.enterExpiryDate();
		a.enterCVV();
		a.agreeToChargeMonthlyCheckbox();
		a.confirm_pay();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.login_afterPay();
		a.enterClientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.enterClientPassword();
		a.clientLogin();
		a.selectSessionOnCalendar();
		a.signUpForSelectedSession();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));	
	}
	
	@Test(priority=6)
	public void SignUp_AccountCreationWithOnlyPoliciesTerm_FreeFirstMonthMemPack()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink();
		a.enterFirstName();
		a.enterLastName();
		String randomInt = a.enterEmail();
		a.enterPhoneNo();
		a.enterDOB();
		a.selectGender();
		a.selectGender_female();
		a.enterAddress1();
		a.enterCity();
		a.selectState();
		a.selectState_georgia();
		a.enterZip();
		a.enterEFirstName();
		a.enterELastName();
		a.enterEEmail();
		a.enterEPhoneNo();
		a.enterERelationship();
		a.enterPassword();
		a.enterConfirmPassword();
		a.saveAndContinue1();
		Assert.assertEquals(a.freeFirstMonthMemPack_Name().getText(), "Free First Month Membership Package");
		Assert.assertEquals(a.freeFirstMonthMemPack_Price().getText(), "$1.00");
		Assert.assertEquals(a.freeFirstMonthMemPack_AutoPayInterval().getText(), "Per Month");
		a.selectFreeFirstMonthMemPack();
		a.saveAndContinue2();
		
		a.NoStudioTermAdded_DefaultWaiverTermCheckbox();
		a.waiverTypeFullName();
		a.saveAndContinue3();
		a.agreeToPoliciesTerm1Checkbox();
		a.agreeToPoliciesTerm2Checkbox();
		a.agreeToPoliciesDefaultTermCheckbox();
		a.policiesTypeFullName();
		a.saveAndContinue4();

		Assert.assertEquals(a.confirmFirstName().getText(), "Rose");
		Assert.assertEquals(a.confirmLastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEmail().getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.confirmPhoneNo().getText(), "4834484031");
		Assert.assertEquals(a.confirmAddress().getText(), "Highland Street 120");
		Assert.assertEquals(a.confirmEFirstName().getText(), "Emily");
		Assert.assertEquals(a.confirmELastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEEmail().getText(), "emily.lavelle@gmail.com");
		Assert.assertEquals(a.confirmEPhoneNo().getText(), "4838932917");
		Assert.assertEquals(a.confirmERelationship().getText(), "Sister");
		Assert.assertEquals(a.confirmPackageName().getText(), "Free First Month Membership Package");
		Assert.assertEquals(a.confirmPriceOnMemPack().getText(), "$1.00");
		Assert.assertEquals(a.confirmAutoPayIntervalOnMemPack().getText(), "Per Month");
		Assert.assertEquals(a.confirmPrice().getText(), "$1.00");		
		Assert.assertEquals(a.actualGrandTotalName().getText(), "You Pay Today");
		Assert.assertEquals(a.actualGrandTotalAmount().getText(), "$0.00");
		a.sameAsClientDetailsCheck();
		Assert.assertEquals(a.cardHolderFirstName().getAttribute("value"), "Rose");
		Assert.assertEquals(a.cardHolderLastName().getAttribute("value"), "Lavelle");
		Assert.assertEquals(a.cardHolderEmail().getAttribute("value"), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.cardHolderAddress().getAttribute("value"), "Highland Street 120");
		Assert.assertEquals(a.cardHolderCity().getAttribute("value"), "Atlanta");
		Assert.assertEquals(a.cardHolderZip().getAttribute("value"), "30303");
		a.enterCreditCardNo();
		a.enterExpiryDate();
		a.enterCVV();
		a.agreeToChargeMonthlyCheckbox();
		a.confirm_pay();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.login_afterPay();
		a.enterClientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.enterClientPassword();
		a.clientLogin();
		a.selectSessionOnCalendar();
		a.signUpForSelectedSession();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));
	}
	
	@Test(priority=7)
	public void SignUp_AccountCreationWithOnlyPoliciesTerm_PurchaseClassAndMemPack_WithMemPackPromoCode()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink();
		a.enterFirstName();
		a.enterLastName();
		String randomInt = a.enterEmail();
		a.enterPhoneNo();
		a.enterDOB();
		a.selectGender();
		a.selectGender_female();
		a.enterAddress1();
		a.enterCity();
		a.selectState();
		a.selectState_georgia();
		a.enterZip();
		a.enterEFirstName();
		a.enterELastName();
		a.enterEEmail();
		a.enterEPhoneNo();
		a.enterERelationship();
		a.enterPassword();
		a.enterConfirmPassword();
		a.saveAndContinue1();
		Assert.assertEquals(a.$classPack_Name().getText(), "Yoga Session Pack");
		Assert.assertEquals(a.$classPack_Price().getText(), "$1.50");
		Assert.assertEquals(a.$classPack_Expiry().getText(), "Valid thru 1 Year from Date of Purchase");
		a.select$classPack();
		a.moveRightArrow();
		Assert.assertEquals(a.xSessionsMemPack_Name().getText(), "1 Year Pilates Membership Package");
		Assert.assertEquals(a.xSessionsMemPack_Price().getText(), "$2.00");
		Assert.assertEquals(a.xSessionsMemPack_AutoPayInterval().getText(), "Per Month");
		a.selectXSessionsMemPack();
		a.saveAndContinue2();
		
		a.NoStudioTermAdded_DefaultWaiverTermCheckbox();
		a.waiverTypeFullName();
		a.saveAndContinue3();
		a.agreeToPoliciesTerm1Checkbox();
		a.agreeToPoliciesTerm2Checkbox();
		a.agreeToPoliciesDefaultTermCheckbox();
		a.policiesTypeFullName();
		a.saveAndContinue4();
		
		Assert.assertEquals(a.confirmFirstName().getText(), "Rose");
		Assert.assertEquals(a.confirmLastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEmail().getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.confirmPhoneNo().getText(), "4834484031");
		Assert.assertEquals(a.confirmAddress().getText(), "Highland Street 120");
		Assert.assertEquals(a.confirmEFirstName().getText(), "Emily");
		Assert.assertEquals(a.confirmELastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEEmail().getText(), "emily.lavelle@gmail.com");
		Assert.assertEquals(a.confirmEPhoneNo().getText(), "4838932917");
		Assert.assertEquals(a.confirmERelationship().getText(), "Sister");
		Assert.assertEquals(a.actualGrandTotalName_ClassAndMem().getText(), "You Pay Today");
		Assert.assertEquals(a.actualGrandTotalAmount_ClassAndMem().getText(), "$3.50");
		a.enterMemPackPromoCode();
		a.promoCodeApply();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName_ClassAndMem().getText(), "Promo-(mempack23)");
		Assert.assertEquals(a.promoCodeAmount_ClassAndMem().getText(), "-$0.80");
		Assert.assertEquals(a.grandTotalName_ClassAndMem_AfterDiscount().getText(), "You Pay Today");
		Assert.assertEquals(a.grandTotalAmount_ClassAndMem_AfterDiscount().getText(), "$2.70");
		a.sameAsClientDetailsCheck();
		Assert.assertEquals(a.cardHolderFirstName().getAttribute("value"), "Rose");
		Assert.assertEquals(a.cardHolderLastName().getAttribute("value"), "Lavelle");
		Assert.assertEquals(a.cardHolderEmail().getAttribute("value"), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.cardHolderAddress().getAttribute("value"), "Highland Street 120");
		Assert.assertEquals(a.cardHolderCity().getAttribute("value"), "Atlanta");
		Assert.assertEquals(a.cardHolderZip().getAttribute("value"), "30303");
		a.enterCreditCardNo();
		a.enterExpiryDate();
		a.enterCVV();
		a.agreeToChargeMonthlyCheckbox();
		a.confirm_pay();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.login_afterPay();
		a.enterClientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.enterClientPassword();
		a.clientLogin();
		a.selectSessionOnCalendar();
		a.signUpForSelectedSession();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));	
	}	
	
	@Test(priority=8)
	public void SignUp_AccountCreationWithOnlyPoliciesTerm_PurchaseClassAndMemPack_ClassPackPromoCode()
	{
		ClientSignUp a = new ClientSignUp(driver);
		a.signUpLink();
		a.enterFirstName();
		a.enterLastName();
		String randomInt = a.enterEmail();
		a.enterPhoneNo();
		a.enterDOB();
		a.selectGender();
		a.selectGender_female();
		a.enterAddress1();
		a.enterCity();
		a.selectState();
		a.selectState_georgia();
		a.enterZip();
		a.enterEFirstName();
		a.enterELastName();
		a.enterEEmail();
		a.enterEPhoneNo();
		a.enterERelationship();
		a.enterPassword();
		a.enterConfirmPassword();
		a.saveAndContinue1();
		Assert.assertEquals(a.$classPack_Name().getText(), "Yoga Session Pack");
		Assert.assertEquals(a.$classPack_Price().getText(), "$1.50");
		Assert.assertEquals(a.$classPack_Expiry().getText(), "Valid thru 1 Year from Date of Purchase");
		a.select$classPack();
		a.moveRightArrow();
		Assert.assertEquals(a.xSessionsMemPack_Name().getText(), "1 Year Pilates Membership Package");
		Assert.assertEquals(a.xSessionsMemPack_Price().getText(), "$2.00");
		Assert.assertEquals(a.xSessionsMemPack_AutoPayInterval().getText(), "Per Month");
		a.selectXSessionsMemPack();
		a.saveAndContinue2();
		
		a.NoStudioTermAdded_DefaultWaiverTermCheckbox();
		a.waiverTypeFullName();
		a.saveAndContinue3();
		a.agreeToPoliciesTerm1Checkbox();
		a.agreeToPoliciesTerm2Checkbox();
		a.agreeToPoliciesDefaultTermCheckbox();
		a.policiesTypeFullName();
		a.saveAndContinue4();
		
		Assert.assertEquals(a.confirmFirstName().getText(), "Rose");
		Assert.assertEquals(a.confirmLastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEmail().getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.confirmPhoneNo().getText(), "4834484031");
		Assert.assertEquals(a.confirmAddress().getText(), "Highland Street 120");
		Assert.assertEquals(a.confirmEFirstName().getText(), "Emily");
		Assert.assertEquals(a.confirmELastName().getText(), "Lavelle");
		Assert.assertEquals(a.confirmEEmail().getText(), "emily.lavelle@gmail.com");
		Assert.assertEquals(a.confirmEPhoneNo().getText(), "4838932917");
		Assert.assertEquals(a.confirmERelationship().getText(), "Sister");
		Assert.assertEquals(a.actualGrandTotalName_ClassAndMem().getText(), "You Pay Today");
		Assert.assertEquals(a.actualGrandTotalAmount_ClassAndMem().getText(), "$3.50");
		a.enterSessionPackPromoCode();
		a.promoCodeApply();
		Assert.assertEquals(a.promoCodeAppliedMessage().getText(), "Your promo code has been applied successfully!");
		Assert.assertEquals(a.promoCodeName_ClassAndMem().getText(), "Promo-(yog247)");
		Assert.assertEquals(a.promoCodeAmount_ClassAndMem().getText(), "-$0.50");
		Assert.assertEquals(a.grandTotalName_ClassAndMem_AfterDiscount().getText(), "You Pay Today");
		Assert.assertEquals(a.grandTotalAmount_ClassAndMem_AfterDiscount().getText(), "$3.00");
		a.sameAsClientDetailsCheck();
		Assert.assertEquals(a.cardHolderFirstName().getAttribute("value"), "Rose");
		Assert.assertEquals(a.cardHolderLastName().getAttribute("value"), "Lavelle");
		Assert.assertEquals(a.cardHolderEmail().getAttribute("value"), "jyoti.kharatmol+"+randomInt+"@azularc.com");
		Assert.assertEquals(a.cardHolderAddress().getAttribute("value"), "Highland Street 120");
		Assert.assertEquals(a.cardHolderCity().getAttribute("value"), "Atlanta");
		Assert.assertEquals(a.cardHolderZip().getAttribute("value"), "30303");
		a.enterCreditCardNo();
		a.enterExpiryDate();
		a.enterCVV();
		a.agreeToChargeMonthlyCheckbox();
		a.confirm_pay();
		Assert.assertEquals(a.AccountCreationSuccessfulMessage().getText(),"Congratulations! Your account has been created.");
		a.login_afterPay();
		a.enterClientUsername().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		a.enterClientPassword();
		a.clientLogin();
		a.selectSessionOnCalendar();
		a.signUpForSelectedSession();
		Assert.assertEquals(a.sessionSignedUpMessage().getText(), "You have been registered for this session!");
		Assert.assertTrue(a.cancelSession().isDisplayed());
		Assert.assertTrue(a.sessionModalShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.sessionOnCalendarShownWith_GreenCheckMark().isDisplayed());
		Assert.assertTrue(a.packageStatus().getText().contains("1/"));	
	}	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	
}
