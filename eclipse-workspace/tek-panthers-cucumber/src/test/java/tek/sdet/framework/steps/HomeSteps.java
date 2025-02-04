package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
// all your step definitions classes wiil extends
// CommonUtility class	
// we need to create object of POMFactory class
// POMFactory instance should be on top of the class
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();// wrote this one in CommonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + "is equal to" + expectedTitle);
	}

	@Then("User verify retail page loge is present")

	public void userVerifyRetailPageLogoIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
		logger.info("logo is present");
	}

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String value) {
		selectByVisibleText(factory.homePage().allDepartments, value);
		logger.info(value + " was selected from the drop down");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePage().searchInputField, value);
		logger.info("user entered " + value);

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search button");
	}

	@Then("Item should be present")
	public void itemShouldBePresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().playStationItem));
		logger.info("item is present");

	}

	@Then("Item1 should be present")
	public void itemShouldBePresent1() throws InterruptedException {

		Assert.assertTrue(isElementDisplayed(factory.homePage().KasaSmartLightSwitchHS200));
		logger.info("item is present");

	}

	@When("User click on All section")
	public void UserClickOnAllSection() {
		click(factory.homePage().allElement);
	}

	@Then("User verifies {string} is present")
	public void UserVerifiesIsPresent(String value) {
		String expectedValue = value;

		String actualValue = getElementText(factory.homePage().ShopBydepartment);

		Assert.assertEquals(expectedValue, actualValue);
		logger.info(expectedValue + "is present");
	}

	@Then("user verifies cart icon is present")
	public void UserVerifiesCartIconIsPresent() {

		Assert.assertTrue(isElementDisplayed(factory.homePage().cart));
		logger.info("cart icon is present");
	}

	@When("user click on Sign in button")
	public void userClickOnSignInButton() {
		SlowDown();
		click(factory.homePage().SingInBtn);
		logger.info("user clicked on Sign in button");
	}

	@When("user enter valid email {string} and password {string}")
	public void userEnterValidEmailAndPassword(String value1, String value2) {
		SlowDown();
		sendText(factory.homePage().Email, value1);
		SlowDown();
		sendText(factory.homePage().Password, value2);
	}

	@Then("user click on login button")
	public void userClickOnLoginButton() {
		SlowDown();
		click(factory.homePage().Login);
		logger.info("user clicked on Login button");
	}

	@When("user verifies TEKSCHOOL title is present")
	public void userVerifiesTEKSCHOOLTitleIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().Title));
		logger.info("TEKSCHOOL title is present");
	}

	@When("user click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		SlowDown();
		click(factory.homePage().CreateNewAccount);
		logger.info("user clicked on Create New Account button");
	}

	@When("user enter name {string} and email {string} and password {string} and confirm password {string}")
	public void userEnterNameAndEmailAndPasswordAndConfirmPassword(String value1, String value2, String value3,
			String value4) {
		SlowDown();
		sendText(factory.homePage().Name, value1);
		SlowDown();
		sendText(factory.homePage().NewEmail, value2);
		SlowDown();
		sendText(factory.homePage().Password1, value3);
		SlowDown();
		sendText(factory.homePage().ConfirmPassword1, value4);

	}

	@Then("user click on sign up button")
	public void userClickOnSignUpButton() {
		SlowDown();
		click(factory.homePage().SignUp);
		logger.info("user clicked on SignUp button");
	}

	@When("User enter your name  {string}")
	public void userEnterYourName(String value) {
		SlowDown();
		clearTextUsingSendKeys(factory.homePage().Name);
		sendText(factory.homePage().Name, value);

	}

	@When("User enter Your phonenumber {string}")
	public void userEnterYourPhonenumber(String value) {
		SlowDown();
		sendText(factory.homePage().PhoneNumber, value);

	}

	@When("User enter your previous password {string}")
	public void userEnterYourPreviousPassword(String value) {
		SlowDown();
		sendText(factory.homePage().PreviousPasswordInput, value);

	}

	@When("User enter your new password {string}")
	public void userEnterYourNewPassword(String value) {
		SlowDown();
		sendText(factory.homePage().NewPasswordInput, value);

	}

	@When("user enter your confirm password {string}")
	public void userEnterYourConfirmPassword(String value) {
		SlowDown();
		sendText(factory.homePage().ConfirmPasswordInput, value);

	}

	@When("change password save button")
	public void changePasswordSaveButton() {
		SlowDown();
		click(factory.homePage().PersonalUpdateBtn);
		logger.info("user clicked on password update button");

	}

	@When("Update your personal info")
	public void updateYourPersonalInfo() {
		SlowDown();
		click(factory.homePage().UpdatePersonalInfo);
		logger.info("user clicked on update button");

	}

	@When("User enter your card number {string}")
	public void userEnterYourCardNumber(String value) {
		SlowDown();
		sendText(factory.homePage().CardNumber, value);

	}

	@When("User enter your name on card {string}")
	public void userEnterYourNameOnCard(String value) {
		SlowDown();
		sendText(factory.homePage().NameOnCard, value);

	}

	@When("User enter Exp Month {string} and Exp Year {string} on card")
	public void userEnterExpMonthAndExpYearOnCard(String value1, String value2) {
		SlowDown();
		selectByVisibleText(factory.homePage().ExpMonth, value1);
		
		SlowDown();
		selectByVisibleText(factory.homePage().ExpYear, value2);

	}

	@When("User enter Security Code {string}")
	public void userEnterSecurityCode(String value) {
		SlowDown();
		sendText(factory.homePage().SecurityCode, value);

	}

	@Then("User enter Add on your card")
	public void userEnterAddOnYourCard() {

		SlowDown();
		click(factory.homePage().AddOnYourCard);
	}

	
	
	@When("User click on Test Selenium")
	public void userClickOnTestSelenium() {
		
		SlowDown();
		click(factory.homePage().TestSelenium);
		logger.info("user clicked on Test selenium");	
	}
	@When("User click on Drop Down button")
	public void userClickOnDropDownButton() {
		SlowDown();
		click(factory.homePage().DropDown);
		logger.info("user clicked on Drop Down button");
		
	}
	@When("User select programming language {string}")
	public void userSelectProgrammingLanguage(String value) {
		SlowDown();
		selectByVisibleText(factory.homePage().ProgrammingLanguageSelect, value);
		
	}
	@When("user select by country {string}")
	public void userSelectByCountry(String value) {
		SlowDown();
		selectByVisibleText(factory.homePage().CountrySelect, value);	
		
	}
	@Then("User select by language {string}")
	public void userSelectByLanguage(String value) {
		SlowDown();
		selectByVisibleText(factory.homePage().languageSelect, value);	
		
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
	}


	
}
