package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;

	@FindBy(id = "search")
	public WebElement allDepartments;

	@FindBy(id = "searchInput")
	public WebElement searchInputField;

	@FindBy(id = "searchBtn")
	public WebElement searchButton;

	@FindBy(xpath = "//img[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;

	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement SmartHome;

	@FindBy(xpath = "//p[text()='Kasa Smart Light Switch HS200']")
	public WebElement KasaSmartLightSwitchHS200;

	@FindBy(xpath = "//span[text()='All']")
	public WebElement allElement;

	@FindBy(id = "contentHeader")
	public WebElement ShopBydepartment;

	@FindBy(xpath = "//p[text()='Cart ']")
	public WebElement cart;
	@FindBy(xpath = "//a[text()='Sign in']")
	public WebElement SingInBtn;
	@FindBy(id = "email")
	public WebElement Email;
	@FindBy(id = "password")
	public WebElement Password;
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement Login;
	@FindBy(xpath = "//h1[text()='TEKSCHOOL']")
	public WebElement Title;
	@FindBy(id = "newAccountBtn")
	public WebElement CreateNewAccount;
	@FindBy(id = "nameInput")
	public WebElement Name;
	
	@FindBy(id = "emailInput")
	public WebElement NewEmail;
	@FindBy(id = "passwordInput")
	public WebElement Password1;
	@FindBy(id = "confirmPasswordInput")
	public WebElement ConfirmPassword1;
	@FindBy(id = "signupBtn")
	public WebElement SignUp;
	@FindBy(id="phoneNumberInput")
	public WebElement PhoneNumber;
	@FindBy(id="previousPasswordInput")
	public WebElement PreviousPasswordInput;
	@FindBy(id="newPasswordInput")
	public WebElement NewPasswordInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement ConfirmPasswordInput ;
	@FindBy(id="personalUpdateBtn")
	public WebElement PersonalUpdateBtn;
	@FindBy(id="credentialsSubmitBtn")
	public WebElement UpdatePersonalInfo;
	
	@FindBy(id="cardNumberInput")
	public WebElement CardNumber;
	@FindBy(id="nameOnCardInput")
	
	public WebElement NameOnCard ;
	@FindBy(id="expirationMonthInput")
	public WebElement ExpMonth ;
	@FindBy(id="expirationYearInput")
	public WebElement ExpYear ;
	@FindBy(id="securityCodeInput")
	public WebElement SecurityCode ;
	@FindBy(id="paymentSubmitBtn")
	public WebElement AddOnYourCard ;
	
	@FindBy(xpath="//a[text()='Test Selenium']")
	public WebElement TestSelenium;
	@FindBy(xpath="//a[text()='Drop Down']")
	public WebElement DropDown ;
	@FindBy(id="programmingLanguageSelect")
	public WebElement ProgrammingLanguageSelect;
	@FindBy(id="countrySelect")
	public WebElement CountrySelect ;
	@FindBy(id="languageSelect")
	public WebElement languageSelect;
	
	@FindBy(id="accountLink")
	public WebElement account;
}
