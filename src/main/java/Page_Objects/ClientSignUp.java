package Page_Objects;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Abstract.AbstractComponent;

public class ClientSignUp extends AbstractComponent 
{

	WebDriver driver;
	
	public ClientSignUp(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span/a[1]")
	WebElement doYouHaveACustomerAccount;
	
	public WebElement DoYouHaveAcustomerAccount()
	{
		doYouHaveACustomerAccount.click();
		return doYouHaveACustomerAccount;
	}
	
	@FindBy(xpath="//span/a[3]")
	WebElement signUpLink;
	
	public WebElement signUpLink()
	{
		signUpLink.click();
		return signUpLink;
	}
		
	@FindBy(xpath="//p/div/div[7]/div/div[2]/div")
	WebElement selectSessionOnCalendar;
	
	public WebElement selectSessionOnCalendar()
	{
		waitForElementToBeClickable(selectSessionOnCalendar);
		selectSessionOnCalendar.click();
		return selectSessionOnCalendar;
	}
	
	@FindBy(xpath="//span[text()='SIGN UP']")
	WebElement signUpForSelectedSession;
	
	public WebElement signUpForSelectedSession()
	{
		waitForElementToBeClickable(signUpForSelectedSession);
		signUpForSelectedSession.click();
		return signUpForSelectedSession;
	}
	
	@FindBy(xpath="//form/div/div[3]/div/div/a")
	WebElement dontHaveAnAccount_signUpHere;
	
	public WebElement dontHaveAnAccount_signUpHere()
	{
		dontHaveAnAccount_signUpHere.click();
		return dontHaveAnAccount_signUpHere;
	}
	
	@FindBy(css="input[name='firstName']")
	WebElement enterFirstName;
	
	public WebElement enterFirstName()
	{
	waitForVisibilityOfElement(enterFirstName);
	enterFirstName.sendKeys("Rose");
	return enterFirstName;
	}
	
	@FindBy(css="input[name='lastName']")
	WebElement enterLastName;
	
	public WebElement enterLastName()
	{
	enterLastName.sendKeys("Lavelle");
	return enterLastName;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement enterEmail;
	
	public String enterEmail()
	{
		String randomInt = RandomStringUtils.randomAlphanumeric(4);
		enterEmail.sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		return randomInt;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[5]/div/div/div[4]/div/p")
	WebElement emailIdExistsError;

	public WebElement emailIdExistsError()
	{
		return emailIdExistsError;
	}
	
	@FindBy(xpath="//div/div/div/div[5]/div/div/input")
	WebElement enterPhoneNo;
	
	public WebElement enterPhoneNo()
	{
	enterPhoneNo.sendKeys("4834484031");
	return enterPhoneNo;
	}
	
	@FindBy(css="input[name='dob']")
	WebElement enterDOB;
	
	public WebElement enterDOB()
	{
	enterDOB.sendKeys("03091995");
	return enterDOB;
	}
	
	@FindBy(css="div[id='mui-component-select-gender']")
	WebElement selectGender;
	
	public WebElement selectGender()
	{
		selectGender.click();
		return selectGender;
	}
	
	@FindBy(xpath="//div[@id='menu-gender']/div/ul/li[1]")
	WebElement selectGender_male;
	
	public WebElement selectGender_male()
	{
		selectGender_male.click();
		return selectGender_male;
	}
	
	@FindBy(xpath="//div[@id='menu-gender']/div/ul/li[2]")
	WebElement selectGender_female;
	
	public WebElement selectGender_female()
	{
		selectGender_female.click();
		return selectGender_female;
	}
	
	@FindBy(xpath="//div[@id='menu-gender']/div/ul/li[3]")
	WebElement selectGender_genderVariant;
	
	public WebElement selectGender_genderVariant()
	{
		selectGender_genderVariant.click();
		return selectGender_genderVariant;
	}
	
	@FindBy(xpath="//div[@id='menu-gender']/div/ul/li[4]")
	WebElement selectGender_preferNotToDisclose;
	
	public WebElement selectGender_preferNotToDisclose()
	{
		selectGender_preferNotToDisclose.click();
		return selectGender_preferNotToDisclose;
	}
	
	@FindBy(css="input[name='address1']")
	WebElement enterAddress1;
	
	public WebElement enterAddress1()
	{
	enterAddress1.sendKeys("Highland Street 120");
	return enterAddress1;
	}
	
	@FindBy(css="input[name='city']")
	WebElement enterCity;
	
	public WebElement enterCity()
	{
	enterCity.sendKeys("Atlanta");
	return enterCity;
	}
	
	@FindBy(css="div[id='mui-component-select-state']")
	WebElement selectState;
	
	public WebElement selectState()
	{
	selectState.click();
	return selectState;
	}
	
	@FindBy(xpath="//ul/li[11]")
	WebElement selectState_georgia;
	
	public WebElement selectState_georgia()
	{
	waitForElementToBeClickable(selectState_georgia);
	selectState_georgia.click();
	return selectState_georgia;
	}
	
	@FindBy(css="input[name='zip']")
	WebElement enterZip;
	
	public WebElement enterZip()
	{
	enterZip.sendKeys("30303");
	return enterZip;
	}
	
	@FindBy(css="input[name='emergencyContact.firstName']")
	WebElement enterEFirstName;
	
	public WebElement enterEFirstName()
	{
	enterEFirstName.sendKeys("Emily");	
	return enterEFirstName;
	}
	
	@FindBy(css="input[name='emergencyContact.lastName']")
	WebElement enterELastName;
	
	public WebElement enterELastName()
	{
	enterELastName.sendKeys("Lavelle");
	return enterELastName;
	}
	
	@FindBy(css="input[name='emergencyContact.emailId']")
	WebElement enterEEmail;
	
	public WebElement enterEEmail()
	{
	enterEEmail.sendKeys("emily.lavelle@gmail.com");
	return enterEEmail;
	}
	
	@FindBy(xpath="//div/div/div/div[19]/div/div/input")
	WebElement enterEPhoneNo;
	
	public WebElement enterEPhoneNo()
	{
	waitForElementToBeClickable(enterEPhoneNo);
	enterEPhoneNo.sendKeys("4838932917");
	return enterEPhoneNo;
	}
	
	@FindBy(css="input[name='emergencyContact.relationShip']")
	WebElement enterERelationship;
	
	public WebElement enterERelationship()
	{
	enterERelationship.sendKeys("Sister");
	return enterERelationship;
	}
	
	@FindBy(css="input[name='password']")
	WebElement enterPassword;
	
	public WebElement enterPassword()
	{
	enterPassword.sendKeys("Password@3");
	return enterPassword;
	}
	
	@FindBy(css="input[name='confirmPassword']")
	WebElement enterConfirmPassword;
	
	public WebElement enterConfirmPassword()
	{
	enterConfirmPassword.sendKeys("Password@3");
	return enterConfirmPassword;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue1;
	
	public WebElement saveAndContinue1()
	{
		waitForElementToBeClickable(saveAndContinue1);
		saveAndContinue1.click();
		return saveAndContinue1;
	}
	
	@FindBy(xpath="//div/div[2]/div/p/div/div/div/div/div[6]/div/div/ul/li[2]/div")
	WebElement selectZero$classPack;
	
	public WebElement selectZero$classPack()
	{
		waitForElementToBeClickable(selectZero$classPack);
		selectZero$classPack.click();
		return selectZero$classPack;	
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[6]/div/div/ul/li[2]/div/div[2]/div[1]")
	WebElement zero$classPack_Name;
	
	public WebElement zero$classPack_Name()
	{
		return zero$classPack_Name;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[6]/div/div/ul/li[2]/div/div[2]/div[3]")
	WebElement zero$classPack_Price;
	
	public WebElement zero$classPack_Price()
	{
		return zero$classPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[6]/div/div/ul/li[2]/div/div[2]/div[2]")
	WebElement zero$classPack_Expiry;
	
	public WebElement zero$classPack_Expiry()
	{
		return zero$classPack_Expiry;
	}
	
	@FindBy(xpath="//div/div[2]/div/p/div/div/div/div/div[6]/div/div/ul/li[1]/div")
	WebElement select$classPack;
	
	public WebElement select$classPack()
	{
		waitForElementToBeClickable(select$classPack);
		select$classPack.click();
		return select$classPack;	
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[6]/div/div/ul/li[1]/div/div[2]/div[1]")
	WebElement $classPack_Name;
	
	public WebElement $classPack_Name()
	{
		return $classPack_Name;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[6]/div/div/ul/li[1]/div/div[2]/div[3]")
	WebElement $classPack_Price;
	
	public WebElement $classPack_Price()
	{
		return $classPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[6]/div/div/ul/li[1]/div/div[2]/div[2]")
	WebElement $classPack_Expiry;
	
	public WebElement $classPack_Expiry()
	{
		return $classPack_Expiry;
	}
	
	@FindBy(css="svg[carouselState='[object Object]']")
	WebElement moveRightArrow;
	
	public WebElement moveRightArrow()
	{
		waitForElementToBeClickable(moveRightArrow);
		moveRightArrow.click();
		return moveRightArrow;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[4]/div")
	WebElement selectXSessionsMemPack;
	
	public WebElement selectXSessionsMemPack()
	{
		waitForElementToBeClickable(selectXSessionsMemPack);
		selectXSessionsMemPack.click();
		return selectXSessionsMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[4]/div/div[2]/div[1]")
	WebElement xSessionsMemPack_Name;
	
	public WebElement xSessionsMemPack_Name()
	{
		waitForVisibilityOfElement(selectXSessionsMemPack);
		return xSessionsMemPack_Name;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[4]/div/div[2]/div[2]")
	WebElement xSessionsMemPack_Price;
	
	public WebElement xSessionsMemPack_Price()
	{
		return xSessionsMemPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[4]/div/div[2]/div[3]")
	WebElement xSessionsMemPack_AutoPayInterval;
	
	public WebElement xSessionsMemPack_AutoPayInterval()
	{
		return xSessionsMemPack_AutoPayInterval;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div")
	WebElement selectUnlimitedMemPack;
	
	public WebElement selectUnlimitedMemPack()
	{
		waitForElementToBeClickable(selectUnlimitedMemPack);
		selectUnlimitedMemPack.click();
		return selectUnlimitedMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div/div[2]/div[1]")
	WebElement unlimitedMemPack_Name;
	
	public WebElement unlimitedMemPack_Name()
	{
		return unlimitedMemPack_Name;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div/div[2]/div[2]")
	WebElement unlimitedMemPack_Price;
	
	public WebElement unlimitedMemPack_Price()
	{
		return unlimitedMemPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div/div[2]/div[3]")
	WebElement unlimitedMemPack_AutoPayInterval;
	
	public WebElement unlimitedMemPack_AutoPayInterval()
	{
		return unlimitedMemPack_AutoPayInterval;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div")
	WebElement selectFreeFirstMonthMemPack;
	
	public WebElement selectFreeFirstMonthMemPack()
	{
		waitForElementToBeClickable(selectFreeFirstMonthMemPack);
		selectFreeFirstMonthMemPack.click();
		return selectFreeFirstMonthMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div/div[2]/div[1]")
	WebElement freeFirstMonthMemPack_Name;
	
	public WebElement freeFirstMonthMemPack_Name()
	{
		return freeFirstMonthMemPack_Name;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div/div[2]/div[2]")
	WebElement freeFirstMonthMemPack_Price;
	
	public WebElement freeFirstMonthMemPack_Price()
	{
		return freeFirstMonthMemPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div/div[2]/div[3]")
	WebElement freeFirstMonthMemPack_AutoPayInterval;
	
	public WebElement freeFirstMonthMemPack_AutoPayInterval()
	{
		return freeFirstMonthMemPack_AutoPayInterval;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div")
	WebElement selectDifferentFirstMonthMemPack;
	
	public WebElement selectDifferentFirstMonthMemPack()
	{
		selectDifferentFirstMonthMemPack.click();
		return selectDifferentFirstMonthMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div/div[2]/div[1]")
	WebElement differentFirstMonthMemPack_Name;
	
	public WebElement differentFirstMonthMemPack_Name()
	{
		return differentFirstMonthMemPack_Name;
	}

	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div/div[2]/div[2]")
	WebElement differentFirstMonthMemPack_Price;
	
	public WebElement differentFirstMonthMemPack_Price()
	{
		return differentFirstMonthMemPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div/div[2]/div[3]")
	WebElement differentFirstMonthMemPack_AutoPayInterval;
	
	public WebElement differentFirstMonthMemPack_AutoPayInterval()
	{
		return differentFirstMonthMemPack_AutoPayInterval;
	}
	
	@FindBy(css="div[align='center'] a")
	WebElement skipIWillPurchasePackageLater;
	
	public WebElement skipIWillPurchasePackageLater()
	{
		skipIWillPurchasePackageLater.click();
		return skipIWillPurchasePackageLater;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue2;
	
	public WebElement saveAndContinue2()
	{
		saveAndContinue2.click();
		return saveAndContinue2;
	}
	
	@FindBy(css="div[class='MuiAlert-message']")
	WebElement skipPackageAlertMessage;
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[1]/label/span[2]")
	WebElement waiverTerm1;
	
	public WebElement waiverTerm1()
	{
		waitForInvisibilityOfWebElement(skipPackageAlertMessage);
		return waiverTerm1;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[1]/label/span[1]/span[1]")
	WebElement waiverTerm1Checkbox;
	
	public WebElement agreeToWaiverTerm1Checkbox()
	{
		waitForElementToBeClickable(waiverTerm1Checkbox);
		waiverTerm1Checkbox.click();
		return waiverTerm1Checkbox;
	}
	
	public WebElement skipPackage_agreeToWaiverTerm1Checkbox()
	{
	   //waitForInvisibilityOfWebElement(skipPackageAlertMessage);
		
		waitForElementToBeClickable(waiverTerm1Checkbox);
		waiverTerm1Checkbox.click();
		return waiverTerm1Checkbox;
	}
	
	public WebElement skipPackage_NoStudioTermAdded_DefaultWaiverTermCheckbox()
	{
		waitForInvisibilityOfWebElement(skipPackageAlertMessage);
		waitForElementToBeClickable(waiverTerm1Checkbox);
		waiverTerm1Checkbox.click();
		return waiverTerm1Checkbox;
	}
	
	public WebElement NoStudioTermAdded_DefaultWaiverTermCheckbox()
	{
		waitForElementToBeClickable(waiverTerm1Checkbox);
		waiverTerm1Checkbox.click();;
		return waiverTerm1Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[2]/label/span[2]")
	WebElement waiverTerm2;
	
	public WebElement waiverTerm2()
	{
		return waiverTerm2;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[2]/label/span[1]/span[1]")
	WebElement agreeToWaiverTerm2Checkbox;
	
	public WebElement agreeToWaiverTerm2Checkbox()
	{
		waitForElementToBeClickable(agreeToWaiverTerm2Checkbox);
		agreeToWaiverTerm2Checkbox.click();
		return agreeToWaiverTerm2Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[3]/label/span[2]")
	WebElement defaultWaiverTerm;
	
	public WebElement defaultWaiverTerm()
	{
		return defaultWaiverTerm;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[3]/label/span[1]/span[1]")
	WebElement agreeToDefaultWaiverTermCheckbox;
	
	public WebElement agreeToDefaultWaiverTermCheckbox()
	{
		waitForElementToBeClickable(agreeToDefaultWaiverTermCheckbox);
		agreeToDefaultWaiverTermCheckbox.click();
		return agreeToDefaultWaiverTermCheckbox;
	}
	
	@FindBy(css="input[name='clientFullName']")
	WebElement waiverTypeFullName;
	
	public WebElement waiverTypeFullName()
	{
		waiverTypeFullName.sendKeys("Rose Lavelle");
		return waiverTypeFullName;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue3;
	
	public WebElement saveAndContinue3()
	{
		waitForElementToBeClickable(saveAndContinue3);
		saveAndContinue3.click();
		return saveAndContinue3;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[1]/label/span[2]")
	WebElement policiesTerm1;
	
	public WebElement policiesTerm1()
	{
		waitForAttributeOfElementToBe(policiesTypeFullName, "name", "clientContractFullName");
		waitForVisibilityOfElement(policiesTerm1);
		return policiesTerm1;
	}
	
	@FindBy(xpath="//div/div[1]/label/span[1]/span[1]")
	WebElement agreeToPoliciesTerm1Checkbox;
	
	public WebElement agreeToPoliciesTerm1Checkbox()
	{
		waitForAttributeOfElementToBe(policiesTypeFullName, "name", "clientContractFullName");
		waitForElementToBeClickable(agreeToPoliciesTerm1Checkbox);
		agreeToPoliciesTerm1Checkbox.click();
		return agreeToPoliciesTerm1Checkbox;
	}
	
	public WebElement NoStudioTermAdded_DefaultPoliciesTermCheckbox()
	{
		waitForAttributeOfElementToBe(policiesTypeFullName, "name", "clientContractFullName");
		waitForElementToBeClickable(agreeToPoliciesTerm1Checkbox);
		agreeToPoliciesTerm1Checkbox.click();
		return agreeToPoliciesTerm1Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[2]/label/span[2]")
	WebElement policiesTerm2;
	
	public WebElement policiesTerm2()
	{
		return policiesTerm2;
	}
	
	@FindBy(xpath="//div/div[2]/label/span[1]/span[1]")
	WebElement agreeToPoliciesTerm2Checkbox;
	
	public WebElement agreeToPoliciesTerm2Checkbox()
	{
		waitForElementToBeClickable(agreeToPoliciesTerm2Checkbox);
		agreeToPoliciesTerm2Checkbox.click();
		return agreeToPoliciesTerm2Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[3]/label/span[2]")
	WebElement policiesDefaultTerm;
	
	public WebElement policiesDefaultTerm()
	{
		return policiesDefaultTerm;
	}
	
	@FindBy(xpath="//div/div[3]/label/span[1]/span[1]")
	WebElement agreeToPoliciesDefaultTermCheckbox;
	
	public WebElement agreeToPoliciesDefaultTermCheckbox()
	{
		waitForElementToBeClickable(agreeToPoliciesDefaultTermCheckbox);
		agreeToPoliciesDefaultTermCheckbox.click();
		return agreeToPoliciesDefaultTermCheckbox;
	}
	
	@FindBy(css="input[name='clientContractFullName']")
	WebElement policiesTypeFullName;
	
	public WebElement policiesTypeFullName()
	{
		policiesTypeFullName.sendKeys("Rose Lavelle");
		return policiesTypeFullName;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue4;
	
	public WebElement saveAndContinue4()
	{
		waitForElementToBeClickable(saveAndContinue4);
		saveAndContinue4.click();
		return saveAndContinue4;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[5]/div[2]/div/div[2]/h4")
	WebElement confirmFirstName;
	
	public WebElement confirmFirstName()
	{
		return confirmFirstName;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[5]/div[3]/div/div[2]/h4")
	WebElement confirmLastName;
	
	public WebElement confirmLastName()
	{
		return confirmLastName;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[5]/div[4]/div/div[2]/h4")
	WebElement confirmEmail;
	
	public WebElement confirmEmail()
	{
		return confirmEmail;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[5]/div[5]/div/div[2]/h4")
	WebElement confirmPhoneNo;
	
	public WebElement confirmPhoneNo()
	{
		return confirmPhoneNo;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[5]/div[6]/div/div[2]/h4")
	WebElement confirmAddress;
	
	public WebElement confirmAddress()
	{
		return confirmAddress;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[6]/div[2]/div/div[2]/h4")
	WebElement confirmEFirstName;
	
	public WebElement confirmEFirstName()
	{
		return confirmEFirstName;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[6]/div[3]/div/div[2]/h4")
	WebElement confirmELastName;
	
	public WebElement confirmELastName()
	{
		return confirmELastName;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[6]/div[4]/div/div[2]/h4")
	WebElement confirmEEmail;
	
	public WebElement confirmEEmail()
	{
		return confirmEEmail;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[6]/div[5]/div/div[2]/h4")
	WebElement confirmEPhoneNo;
	
	public WebElement confirmEPhoneNo()
	{
		return confirmEPhoneNo;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[1]/div/div[6]/div[6]/div/div[2]/h4")
	WebElement confirmERelationship;
	
	public WebElement confirmERelationship()
	{
		return confirmERelationship;
	}	
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[3]/div[1]/div/div/div/div[2]/div[1]")
	WebElement confirmPackageName;
	
	public WebElement confirmPackageName()
	{
		return confirmPackageName;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[3]/div[1]/div/div/div/div[2]/div[3]")
	WebElement confirmPriceOnClassPack;
	
	public WebElement confirmPriceOnClassPack()
	{
		return confirmPriceOnClassPack;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[3]/div[1]/div/div/div/div[2]/div[2]")
	WebElement confirmExpiryOnClassPack;
	
	public WebElement confirmExpiryOnClassPack()
	{
		return confirmExpiryOnClassPack;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[3]/div[1]/div/div/div/div[2]/div[2]")
	WebElement confirmPriceOnMemPack;
	
	public WebElement confirmPriceOnMemPack()
	{
		return confirmPriceOnMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[3]/div[1]/div/div/div/div[2]/div[3]")
	WebElement confirmAutoPayIntervalOnMemPack;
	
	public WebElement confirmAutoPayIntervalOnMemPack()
	{
		return confirmAutoPayIntervalOnMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[3]/div[2]/div/span")
	WebElement confirmPrice;
	
	public WebElement confirmPrice()
	{
		return confirmPrice;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[4]/div/div/div/div[3]/span[1]")
	WebElement actualGrandTotalName;
	
	public WebElement actualGrandTotalName()
	{
		return actualGrandTotalName;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[4]/div/div/div/div[3]/span[2]")
	WebElement actualGrandTotalAmount;
	
	public WebElement actualGrandTotalAmount()
	{
		return actualGrandTotalAmount;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[6]/div/div/div/div[3]/span[1]")
	WebElement actualGrandTotalName_ClassAndMem;
	
	public WebElement actualGrandTotalName_ClassAndMem()
	{
		return actualGrandTotalName_ClassAndMem;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[6]/div/div/div/div[3]/span[2]")
	WebElement actualGrandTotalAmount_ClassAndMem;
	
	public WebElement actualGrandTotalAmount_ClassAndMem()
	{
		return actualGrandTotalAmount_ClassAndMem;
	}
	
	@FindBy(css="input[name='promoCode']")
	WebElement enterPromoCode;
	
	public WebElement enterSessionPackPromoCode()
	{
		enterPromoCode.sendKeys("yog247");
		return enterPromoCode;
	}
	
	public WebElement enterMemPackPromoCode()
	{
		enterPromoCode.sendKeys("mempack23");
		return enterPromoCode;
	}
	
	@FindBy(css="button[name='promoCodeApply']")
	WebElement promoCodeApply;
	
	public WebElement promoCodeApply()
	{
		promoCodeApply.click();
		return promoCodeApply;
	}
	
	@FindBy(css="div[class='MuiAlert-message']")
	WebElement promoCodeAppliedMessage;
	
	public WebElement promoCodeAppliedMessage()
	{
		waitForVisibilityOfElement(promoCodeAppliedMessage);
		return promoCodeAppliedMessage;
	}
	
	@FindBy(xpath="//div/p/div/div/div[2]/div/div/div/div[4]/div/div/div/div[3]/span[1]")
	WebElement promoCodeName;
	
	public WebElement promoCodeName()
	{
		return promoCodeName;
	}
	
	@FindBy(xpath="//div/p/div/div/div[2]/div/div/div/div[4]/div/div/div/div[3]/span[2]")
	WebElement promoCodeAmount;
	
	public WebElement promoCodeAmount()
	{
		return promoCodeAmount;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[6]/div/div/div/div[3]/span[1]")
	WebElement promoCodeName_ClassAndMem;
	
	public WebElement promoCodeName_ClassAndMem()
	{
		return promoCodeName_ClassAndMem;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[6]/div/div/div/div[3]/span[2]")
	WebElement promoCodeAmount_ClassAndMem;
	
	public WebElement promoCodeAmount_ClassAndMem()
	{
		return promoCodeAmount_ClassAndMem;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div/div[4]/div/div/div/div[4]/span[1]")
	WebElement grandTotalNameAfterDiscount;
	
	public WebElement grandTotalNameAfterDiscount()
	{
		return grandTotalNameAfterDiscount;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div/div[4]/div/div/div/div[4]/span[2]")
	WebElement grandTotalAmountAfterDiscount;
	
	public WebElement grandTotalAmountAfterDiscount()
	{
		return grandTotalAmountAfterDiscount;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[6]/div/div/div/div[4]/span[1]")
	WebElement grandTotalName_ClassAndMem_AfterDiscount;
	
	
	public WebElement grandTotalName_ClassAndMem_AfterDiscount()
	{
		return grandTotalName_ClassAndMem_AfterDiscount;
	}
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div[6]/div[6]/div/div/div/div[4]/span[2]")
	WebElement grandTotalAmount_ClassAndMem_AfterDiscount;
	
	public WebElement grandTotalAmount_ClassAndMem_AfterDiscount()
	{
		return grandTotalAmount_ClassAndMem_AfterDiscount;
	}
	
	@FindBy(xpath="//p/div/div/div[3]/div/div/div[9]/div/div/div[2]/div/label/span[1]/span[1]")
	WebElement sameAsClientDetailsCheck;
	
	public WebElement sameAsClientDetailsCheck()
	{
		sameAsClientDetailsCheck.click();
		return sameAsClientDetailsCheck;
	}
	
	
	@FindBy(css="input[name='firstName']")
	WebElement cardHolderFirstName;
	
	public WebElement cardHolderFirstName()
	{
		return cardHolderFirstName;
	}
	
	public WebElement enterCardHolderFirstName()
	{
		cardHolderFirstName.sendKeys("Emily");
		return cardHolderFirstName;
	}
	
	@FindBy(css="input[name='lastName']")
	WebElement cardHolderLastName;
	
	public WebElement cardHolderLastName()
	{
		return cardHolderLastName;
	}
	
	public WebElement enterCardHolderLastName()
	{
		cardHolderLastName.sendKeys("Lavelle");
		return cardHolderLastName;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement cardHolderEmail;
	
	public WebElement cardHolderEmail()
	{
		return cardHolderEmail;
	}
	
	public WebElement enterCardHolderEmail()
	{
		cardHolderEmail.sendKeys("emily.lavelle@gmail.com");
		return cardHolderEmail;
	}
	
	@FindBy(css="input[name='address1']")
	WebElement cardHolderAddress;
	
	public WebElement cardHolderAddress()
	{
		return cardHolderAddress;
	}
	
	public WebElement enterCardHolderAddress()
	{
		cardHolderAddress.sendKeys("Highland Street 120");
		return cardHolderAddress;
	}
	
	@FindBy(css="input[name='city']")
	WebElement cardHolderCity;
	
	public WebElement cardHolderCity()
	{
		return cardHolderCity;
	}
	
	public WebElement enterCardHolderCity()
	{
		cardHolderCity.sendKeys("Atlanta");
		return cardHolderCity;
	}
	
	@FindBy(css="div[id='mui-component-select-state']")
	WebElement cardHolderState;
	
	public WebElement cardHolderState()
	{
		return cardHolderState;
	}
	
	public WebElement selectCardHolderState()
	{
		cardHolderState.click();
		return cardHolderState;
	}
	
	@FindBy(css="ul[role='listbox'] li:nth-child(11)")
	WebElement cardHolderState_Georgia;
	
	public WebElement cardHolderState_Georgia()
	{
		return cardHolderState_Georgia;
	}
	
	public WebElement selectCardHolderState_Georgia()
	{
		cardHolderState_Georgia.click();
		return cardHolderState_Georgia;
	}
	
	@FindBy(css="input[name='zip']")
	WebElement cardHolderZip;
	
	public WebElement cardHolderZip()
	{
		return cardHolderZip;
	}
	
	public WebElement enterCardHolderZip()
	{
		cardHolderZip.sendKeys("30303");
		return cardHolderZip;
	}
	
	@FindBy(xpath="//div[14]/div/div/input")
	WebElement enterCreditCardNo;
	
	public WebElement enterCreditCardNo()
	{
		enterCreditCardNo.sendKeys("378282246310005");
		return enterCreditCardNo;
	}
	
	@FindBy(xpath="//div[15]/div/div/input")
	WebElement enterExpiryDate;
	
	public WebElement enterExpiryDate()
	{
		enterExpiryDate.sendKeys("0224");
		return enterExpiryDate;
	}
	
	@FindBy(xpath="//div[16]/div/div/input")
	WebElement enterCVV;
	
	public WebElement enterCVV()
	{
		enterCVV.sendKeys("4391");
		return enterCVV;
	}
	
	@FindBy(xpath="//div[22]/label/span[1]/span[1]")
	WebElement agreeToChargeMonthlyCheck;
	
	public WebElement agreeToChargeMonthlyCheckbox()
	{
		agreeToChargeMonthlyCheck.click();
		return agreeToChargeMonthlyCheck;
	}
	
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement confirm;
	
	public WebElement confirmAccountCreation()
	{
		confirm.click();
		return confirm;
	}
	
	@FindBy(xpath="//span[text()='CONFIRM & PAY']")
	WebElement confirm_pay;
	
	public WebElement confirm_pay()
	{
		confirm_pay.click();
		return confirm_pay;
	}
	
	@FindBy(xpath="//p[1]")
	WebElement accountCreationSuccessfulMessage;
	
	public WebElement AccountCreationSuccessfulMessage()
	{
		waitForTextInElement(accountCreationSuccessfulMessage, "Congratulations! Your account has been created.");
		return accountCreationSuccessfulMessage;
	}
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement login;
	
	public WebElement login()
	{
		waitForElementToBeClickable(login);
		login.click();
		return login;
	}
	
	@FindBy(css="img[alt='Loader']")
	WebElement loaderIcon;
	
	public WebElement login_afterPay()
	{
		waitForInvisibilityOfWebElement(loaderIcon);
		waitForElementToBeClickable(login);
		login.click();
		return login;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement enterClientUsername;

	public WebElement enterClientUsername()
	{
		return enterClientUsername;
	}
	
	@FindBy(css="input[name='password']")
	WebElement enterClientPassword;
	
	public WebElement enterClientPassword()
	{
		enterClientPassword.sendKeys("Password@3");
		return enterClientPassword;
	}
	
	@FindBy(xpath="//span[text()='LOGIN']")
	WebElement clientLogin;
	
	public WebElement clientLogin()
	{
		clientLogin.click();
		return clientLogin;
	}
	
	@FindBy(tagName="h1")
	WebElement dontHaveAPackageMessage;
	
	@FindBy(xpath="//span[text()='PURCHASE PACKAGE']")
	WebElement purchasePackageButton;
	
	public WebElement dontHaveAPackageMessage()
	{
		waitForVisibilityOfElement(purchasePackageButton);
		return dontHaveAPackageMessage;
	}
	
	@FindBy(css="div[class='MuiAlert-message']")
	WebElement sessionSignedUpMessage;
	
	public WebElement sessionSignedUpMessage()
	{
		waitForVisibilityOfElement(sessionSignedUpMessage);
		return sessionSignedUpMessage;
	}
	
	@FindBy(xpath="//p/div/div[7]/div/div[2]/div/div/div[5]")
	WebElement sessionOnCalendarShownWith_GreenCheckMark;
	
	public WebElement sessionOnCalendarShownWith_GreenCheckMark()
	{
		waitForVisibilityOfElement(sessionOnCalendarShownWith_GreenCheckMark);
		return sessionOnCalendarShownWith_GreenCheckMark;
	}
	
	@FindBy(css="svg:nth-child(2)")
	WebElement sessionModalShownWith_GreenCheckMark;
	
	public WebElement sessionModalShownWith_GreenCheckMark()
	{
		return sessionModalShownWith_GreenCheckMark;
	}
	
	@FindBy(xpath="//span[text()='CANCEL SESSION']")
	WebElement cancelSession;
	
	public WebElement cancelSession()
	{
		waitForVisibilityOfElement(cancelSession);
		return cancelSession;
	}
	
	
	@FindBy(tagName="h1")
	WebElement packageStatus;
	
	public WebElement packageStatus()
	{
		waitForInvisibilityOfWebElement(sessionSignedUpMessage);
		waitForVisibilityOfElement(sessionOnCalendarShownWith_GreenCheckMark);
		return packageStatus;
	}
	
}




