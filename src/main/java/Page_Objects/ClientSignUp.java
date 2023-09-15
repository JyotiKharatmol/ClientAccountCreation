package Page_Objects;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Abstract.Abstract_Component;

public class ClientSignUp extends Abstract_Component {

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
		return doYouHaveACustomerAccount;
	}
	
	@FindBy(xpath="//span/a[3]")
	WebElement signUpLink;
	
	public WebElement signUpLink()
	{
		return signUpLink;
	}
		
	@FindBy(xpath="//p/div/div[7]/div/div[2]/div")
	WebElement sessionOnCalendar;
	
	public WebElement SessionOnCalendar()
	{
		waitForElementToBeClickable(sessionOnCalendar);
		return sessionOnCalendar;
	}
	
	@FindBy(xpath="//span[text()='SIGN UP']")
	WebElement sessionSignUp;
	
	public WebElement sessionSignUp()
	{
		waitForElementToBeClickable(sessionSignUp);
		return sessionSignUp;
	}
	
	@FindBy(xpath="//form/div/div[3]/div/div/a")
	WebElement dontHaveAnAccountClientSignUp;
	
	public WebElement dontHaveAnAccountClientSignUp()
	{
		return dontHaveAnAccountClientSignUp;
	}
	
	@FindBy(css="input[name='firstName']")
	WebElement firstName;
	
	public WebElement FirstName()
	{
	waitForVisibilityOfElement(firstName);
	return firstName;
	}
	
	@FindBy(css="input[name='lastName']")
	WebElement lastName;
	
	public WebElement LastName()
	{
	return lastName;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement email;
	
	public String Email()
	{
		String randomInt = RandomStringUtils.randomAlphanumeric(4);
		email.sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		return randomInt;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[5]/div/div/div[4]/div/p")
	WebElement emailIdExistsError;

	public WebElement emailIdExistsError()
	{
		return emailIdExistsError;
	}
	
	@FindBy(xpath="//div/div/div/div[5]/div/div/input")
	WebElement phoneNo;
	
	public WebElement PhoneNo()
	{
	return phoneNo;
	}
	
	@FindBy(css="input[name='dob']")
	WebElement dob;
	
	public WebElement DOB()
	{
	return dob;
	}
	
	@FindBy(css="div[id='mui-component-select-gender']")
	WebElement selectGender;
	
	public WebElement selectGender()
	{
		return selectGender;
	}
	
	@FindBy(xpath="//div[@id='menu-gender']/div/ul/li[1]")
	WebElement male;
	
	public WebElement Male()
	{
		return male;
	}
	
	@FindBy(xpath="//div[@id='menu-gender']/div/ul/li[2]")
	WebElement female;
	
	public WebElement Female()
	{
		return female;
	}
	
	@FindBy(xpath="//div[@id='menu-gender']/div/ul/li[3]")
	WebElement genderVariant;
	
	public WebElement GenderVariant()
	{
		return genderVariant;
	}
	
	@FindBy(xpath="//div[@id='menu-gender']/div/ul/li[4]")
	WebElement preferNotToDisclose;
	
	public WebElement PreferNotDisclose()
	{
		return preferNotToDisclose;
	}
	
	@FindBy(css="input[name='address1']")
	WebElement address1;
	
	public WebElement Address1()
	{
	return address1;
	}
	
	@FindBy(css="input[name='city']")
	WebElement city;
	
	public WebElement City()
	{
	return city;
	}
	
	@FindBy(css="div[id='mui-component-select-state']")
	WebElement state;
	
	public WebElement State()
	{
	return state;
	}
	
	@FindBy(xpath="//ul/li[11]")
	WebElement georgia;
	
	public WebElement Georgia()
	{
	waitForElementToBeClickable(georgia);
	return georgia;
	}
	
	@FindBy(css="input[name='zip']")
	WebElement zip;
	
	public WebElement Zip()
	{
	return zip;
	}
	
	@FindBy(css="input[name='emergencyContact.firstName']")
	WebElement eFirstName;
	
	public WebElement eFirstName()
	{
	return eFirstName;
	}
	
	@FindBy(css="input[name='emergencyContact.lastName']")
	WebElement eLastName;
	
	public WebElement eLastName()
	{
	return eLastName;
	}
	
	@FindBy(css="input[name='emergencyContact.emailId']")
	WebElement eEmail;
	
	public WebElement eEmail()
	{
	return eEmail;
	}
	
	@FindBy(xpath="//div/div/div/div[19]/div/div/input")
	WebElement ePhoneNo;
	
	public WebElement ePhoneNo()
	{
	waitForElementToBeClickable(ePhoneNo);
	return ePhoneNo;
	}
	
	@FindBy(css="input[name='emergencyContact.relationShip']")
	WebElement eRelationship;
	
	public WebElement eRelationship()
	{
	return eRelationship;
	}
	
	@FindBy(css="input[name='password']")
	WebElement password;
	
	public WebElement Password()
	{
	return password;
	}
	
	@FindBy(css="input[name='confirmPassword']")
	WebElement confirmPassword;
	
	public WebElement ConfirmPassword()
	{
	return confirmPassword;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue1;
	
	public WebElement SaveAndContinue1()
	{
		waitForElementToBeClickable(saveAndContinue1);
		return saveAndContinue1;
	}
	
	@FindBy(xpath="//div/div[2]/div/p/div/div/div/div/div[6]/div/div/ul/li[2]/div")
	WebElement zero$classPack;
	
	public WebElement zero$classPack()
	{
		waitForElementToBeClickable(zero$classPack);
		return zero$classPack;	
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
	WebElement $classPack;
	
	public WebElement $classPack()
	{
		waitForElementToBeClickable($classPack);
		return $classPack;	
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
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div")
	WebElement xSessionsMemPack;
	
	public WebElement xSessionsMemPack()
	{
		waitForElementToBeClickable(xSessionsMemPack);
		return xSessionsMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div/div[2]/div[1]")
	WebElement xSessionsMemPack_Name;
	
	public WebElement xSessionsMemPack_Name()
	{
		return xSessionsMemPack_Name;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div/div[2]/div[2]")
	WebElement xSessionsMemPack_Price;
	
	public WebElement xSessionsMemPack_Price()
	{
		return xSessionsMemPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div/div[2]/div[3]")
	WebElement xSessionsMemPack_AutoPayInterval;
	
	public WebElement xSessionsMemPack_AutoPayInterval()
	{
		return xSessionsMemPack_AutoPayInterval;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div")
	WebElement unlimitedMemPack;
	
	public WebElement unlimitedMemPack()
	{
		waitForElementToBeClickable(unlimitedMemPack);
		return unlimitedMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div/div[2]/div[1]")
	WebElement unlimitedMemPack_Name;
	
	public WebElement unlimitedMemPack_Name()
	{
		return unlimitedMemPack_Name;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div/div[2]/div[2]")
	WebElement unlimitedMemPack_Price;
	
	public WebElement unlimitedMemPack_Price()
	{
		return unlimitedMemPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div/div[2]/div[3]")
	WebElement unlimitedMemPack_AutoPayInterval;
	
	public WebElement unlimitedMemPack_AutoPayInterval()
	{
		return unlimitedMemPack_AutoPayInterval;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div")
	WebElement freeFirstMonthMemPack;
	
	public WebElement freeFirstMonthMemPack()
	{
		waitForElementToBeClickable(freeFirstMonthMemPack);
		return freeFirstMonthMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div/div[2]/div[1]")
	WebElement freeFirstMonthMemPack_Name;
	
	public WebElement freeFirstMonthMemPack_Name()
	{
		return freeFirstMonthMemPack_Name;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div/div[2]/div[2]")
	WebElement freeFirstMonthMemPack_Price;
	
	public WebElement freeFirstMonthMemPack_Price()
	{
		return freeFirstMonthMemPack_Price;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div/div[2]/div[3]")
	WebElement freeFirstMonthMemPack_AutoPayInterval;
	
	public WebElement freeFirstMonthMemPack_AutoPayInterval()
	{
		return freeFirstMonthMemPack_AutoPayInterval;
	}
	
	@FindBy(css="div[align='center'] a")
	WebElement skipPurchasePackageLater;
	
	public WebElement skipPurchasePackageLater()
	{
		return skipPurchasePackageLater;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue2;
	
	public WebElement SaveAndContinue2()
	{
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
	
	public WebElement waiverTerm1Checkbox()
	{
		waitForElementToBeClickable(waiverTerm1Checkbox);
		return waiverTerm1Checkbox;
	}
	public WebElement skipPackage_waiverTerm1Checkbox()
	{
		waitForInvisibilityOfWebElement(skipPackageAlertMessage);
		waitForElementToBeClickable(waiverTerm1Checkbox);
		return waiverTerm1Checkbox;
	}
	public WebElement skipPackage_NoStudioTermAdded_DefaultWaiverTermCheckbox()
	{
		waitForInvisibilityOfWebElement(skipPackageAlertMessage);
		waitForElementToBeClickable(waiverTerm1Checkbox);
		return waiverTerm1Checkbox;
	}
	
	public WebElement NoStudioTermAdded_DefaultWaiverTermCheckbox()
	{
		waitForElementToBeClickable(waiverTerm1Checkbox);
		return waiverTerm1Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[2]/label/span[2]")
	WebElement waiverTerm2;
	
	public WebElement waiverTerm2()
	{
		return waiverTerm2;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[2]/label/span[1]/span[1]")
	WebElement waiverTerm2Checkbox;
	
	public WebElement waiverTerm2Checkbox()
	{
		waitForElementToBeClickable(waiverTerm2Checkbox);
		return waiverTerm2Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[3]/label/span[2]")
	WebElement defaultWaiverTerm;
	
	public WebElement defaultWaiverTerm()
	{
		return defaultWaiverTerm;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[3]/label/span[1]/span[1]")
	WebElement defaultWaiverTermCheckbox;
	
	public WebElement defaultWaiverTermCheckbox()
	{
		waitForElementToBeClickable(defaultWaiverTermCheckbox);
		return defaultWaiverTermCheckbox;
	}
	
	@FindBy(css="input[name='clientFullName']")
	WebElement waiverTypeFullName;
	
	public WebElement waiverTypeFullName()
	{
		return waiverTypeFullName;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue3;
	
	public WebElement SaveAndContinue3()
	{
		return saveAndContinue3;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[1]/label/span[2]")
	WebElement policiesTerm1;
	
	public WebElement policiesTerm1()
	{
		waitForAttributeOfElementToBe(policiesTypeFullName);
		waitForVisibilityOfElement(policiesTerm1);
		return policiesTerm1;
	}
	
	@FindBy(xpath="//div/div[1]/label/span[1]/span[1]")
	WebElement policiesTerm1Checkbox;
	
	public WebElement PoliciesTerm1Checkbox()
	{
		waitForAttributeOfElementToBe(policiesTypeFullName);
		waitForElementToBeClickable(policiesTerm1Checkbox);
		return policiesTerm1Checkbox;
	}
	
	public WebElement NoStudioTermAdded_DefaultPoliciesTermCheckbox()
	{
		waitForAttributeOfElementToBe(policiesTypeFullName);
		waitForElementToBeClickable(policiesTerm1Checkbox);
		return policiesTerm1Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[2]/label/span[2]")
	WebElement policiesTerm2;
	
	public WebElement policiesTerm2()
	{
		return policiesTerm2;
	}
	
	@FindBy(xpath="//div/div[2]/label/span[1]/span[1]")
	WebElement policiesTerm2Checkbox;
	
	public WebElement PoliciesTerm2Checkbox()
	{
		waitForElementToBeClickable(policiesTerm2Checkbox);
		return policiesTerm2Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[3]/label/span[2]")
	WebElement policiesDefaultTerm;
	
	public WebElement policiesDefaultTerm()
	{
		return policiesDefaultTerm;
	}
	
	@FindBy(xpath="//div/div[3]/label/span[1]/span[1]")
	WebElement policiesDefaultTermCheckbox;
	
	public WebElement PoliciesDefaultTermCheckbox()
	{
		waitForElementToBeClickable(policiesDefaultTermCheckbox);
		return policiesDefaultTermCheckbox;
	}
	
	@FindBy(css="input[name='clientContractFullName']")
	WebElement policiesTypeFullName;
	
	public WebElement PoliciesTypeFullName()
	{
		return policiesTypeFullName;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue4;
	
	public WebElement SaveAndContinue4()
	{
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
	WebElement promoCode;
	
	public WebElement promoCode()
	{
		return promoCode;
	}
	
	@FindBy(css="button[name='promoCodeApply']")
	WebElement promoCodeApply;
	
	public WebElement promoCodeApply()
	{
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
	WebElement sameAsClientDetails;
	
	public WebElement sameAsClientDetails()
	{
		return sameAsClientDetails;
	}
	
	@FindBy(css="input[name='firstName']")
	WebElement cardHolderFirstName;
	
	public WebElement cardHolderFirstName()
	{
		return cardHolderFirstName;
	}
	
	@FindBy(css="input[name='lastName']")
	WebElement cardHolderLastName;
	
	public WebElement cardHolderLastName()
	{
		return cardHolderLastName;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement cardHolderEmail;
	
	public WebElement cardHolderEmail()
	{
		return cardHolderEmail;
	}
	
	@FindBy(css="input[name='address1']")
	WebElement cardHolderAddress;
	
	public WebElement cardHolderAddress()
	{
		return cardHolderAddress;
	}
	
	@FindBy(css="input[name='city']")
	WebElement cardHolderCity;
	
	public WebElement cardHolderCity()
	{
		return cardHolderCity;
	}
	
	@FindBy(css="div[id='mui-component-select-state']")
	WebElement cardHolderSelectState;
	
	public WebElement cardHolderSelectState()
	{
		return cardHolderSelectState;
	}
	
	@FindBy(css="ul[role='listbox'] li:nth-child(11)")
	WebElement cardHolderGeorgia;
	
	public WebElement cardHolderGeorgia()
	{
		return cardHolderGeorgia;
	}
	
	@FindBy(css="input[name='zip']")
	WebElement cardHolderZip;
	
	public WebElement cardHolderZip()
	{
		return cardHolderZip;
	}
	
	@FindBy(xpath="//div[14]/div/div/input")
	WebElement enterCreditCardNo;
	
	public WebElement EnterCreditCardNo()
	{
		return enterCreditCardNo;
	}
	
	@FindBy(xpath="//div[15]/div/div/input")
	WebElement enterExpiryDate;
	
	public WebElement EnterExpiryDate()
	{
		return enterExpiryDate;
	}
	
	@FindBy(xpath="//div[16]/div/div/input")
	WebElement enterCVV;
	
	public WebElement EnterCVV()
	{
		return enterCVV;
	}
	
	@FindBy(xpath="//div[22]/label/span[1]/span[1]")
	WebElement agreeToChargeMonthlyCheck;
	
	public WebElement agreeToChargeMonthlyCheckbox()
	{
		return agreeToChargeMonthlyCheck;
	}
	
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement confirm;
	
	public WebElement Confirm()
	{
		return confirm;
	}
	
	@FindBy(xpath="//span[text()='CONFIRM & PAY']")
	WebElement confirm_pay;
	
	public WebElement Confirm_pay()
	{
		return confirm_pay;
	}
	
	@FindBy(xpath="//p[1]")
	WebElement accountCreationSuccessfulMessage;
	
	public WebElement AccountCreationSuccessfulMessage()
	{
		waitForTextInElement(accountCreationSuccessfulMessage);
		return accountCreationSuccessfulMessage;
	}
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement login;
	
	public WebElement Login()
	{
		waitForElementToBeClickable(login);
		return login;
	}
	
	@FindBy(css="img[alt='Loader']")
	WebElement loaderIcon;
	
	public WebElement Login_afterPay()
	{
		waitForInvisibilityOfWebElement(loaderIcon);
		waitForElementToBeClickable(login);
		return login;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement clientUsername;

	public WebElement clientUsername()
	{
		return clientUsername;
	}
	
	@FindBy(css="input[name='password']")
	WebElement clientPassword;
	
	public WebElement clientPassword()
	{
		return clientPassword;
	}
	
	@FindBy(xpath="//span[text()='LOGIN']")
	WebElement clientLogin;
	
	public WebElement clientLogin()
	{
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




