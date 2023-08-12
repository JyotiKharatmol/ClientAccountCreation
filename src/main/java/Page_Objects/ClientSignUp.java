package Page_Objects;
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
	
	public WebElement Email()
	{
		return email;
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
		return saveAndContinue1;
	}
	
	@FindBy(xpath="//div/div[2]/div/p/div/div/div/div/div[6]/div/div/ul/li[2]/div")
	WebElement zero$classPack;
	
	public WebElement zero$classPack()
	{
		waitForElementToBeClickable(zero$classPack);
		return zero$classPack;	
	}
	
	@FindBy(xpath="//div/div[2]/div/p/div/div/div/div/div[6]/div/div/ul/li[1]/div")
	WebElement $classPack;
	
	public WebElement $classPack()
	{
		waitForElementToBeClickable($classPack);
		return $classPack;	
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[3]/div")
	WebElement xSessionsMemPack;
	
	public WebElement xSessionsMemPack()
	{
		waitForElementToBeClickable(xSessionsMemPack);
		return xSessionsMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[2]/div")
	WebElement unlimitedMemPack;
	
	public WebElement unlimitedMemPack()
	{
		waitForElementToBeClickable(unlimitedMemPack);
		return unlimitedMemPack;
	}
	
	@FindBy(xpath="//p/div/div/div[1]/div/div[10]/div/div/ul/li[1]/div")
	WebElement freeFirstMonthMemPack;
	
	public WebElement freeFirstMonthMemPack()
	{
		waitForElementToBeClickable(freeFirstMonthMemPack);
		return freeFirstMonthMemPack;
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
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[1]/label/span[1]/span[1]")
	WebElement term1Checkbox;
	
	public WebElement Term1Checkbox()
	{
		waitForElementToBeClickable(term1Checkbox);
		return term1Checkbox;
	}
	public WebElement skipPackage_Term1Checkbox()
	{
		waitForInvisibilityOfWebElement(skipPackageAlertMessage);
		waitForElementToBeClickable(term1Checkbox);
		return term1Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[2]/label/span[1]/span[1]")
	WebElement term2Checkbox;
	
	public WebElement Term2Checkbox()
	{
		waitForElementToBeClickable(term2Checkbox);
		return term2Checkbox;
	}
	
	@FindBy(xpath="//div/div[8]/div/div/div/div[3]/label/span[1]/span[1]")
	WebElement defaultCheckbox;
	
	public WebElement DefaultCheckbox()
	{
		waitForElementToBeClickable(defaultCheckbox);
		return defaultCheckbox;
	}
	
	@FindBy(css="input[name='clientFullName']")
	WebElement typeFullName;
	
	public WebElement TypeFullName()
	{
		return typeFullName;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement saveAndContinue3;
	
	public WebElement SaveAndContinue3()
	{
		return saveAndContinue3;
	}

	@FindBy(xpath="//div/div[1]/label/span[1]/span[1]")
	WebElement policiesTerm1;
	
	public WebElement PoliciesTerm1()
	{
		waitForAttributeOfElementToBe(policiesTypeFullName);
		waitForElementToBeClickable(policiesTerm1);
		return policiesTerm1;
	}
	
	@FindBy(xpath="//div/div[2]/label/span[1]/span[1]")
	WebElement policiesTerm2;
	
	public WebElement PoliciesTerm2()
	{
		waitForElementToBeClickable(policiesTerm2);
		return policiesTerm2;
	}
	
	@FindBy(xpath="//div/div[3]/label/span[1]/span[1]")
	WebElement policiesDefaultTerm;
	
	public WebElement PoliciesDefaultCheckbox()
	{
		waitForElementToBeClickable(policiesDefaultTerm);
		return policiesDefaultTerm;
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
	
	@FindBy(xpath="//p/div/div/div[2]/div/div/div/div[4]/div/div/div/div[3]/span[2]")
	WebElement $0grandTotal;
	
	public WebElement $0grandTotal()
	{
		return $0grandTotal;
	}
	
	@FindBy(xpath="//p/div/div/div[3]/div/div/div[9]/div/div/div[2]/div/label/span[1]/span[1]")
	WebElement sameAsClientDetails;
	
	public WebElement sameAsClientDetails()
	{
		return sameAsClientDetails;
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




