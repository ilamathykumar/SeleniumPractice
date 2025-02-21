package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().SingInBtn);
		logger.info("user clicked on Sign In option");
	}


		@When("User enter email {string} and password {string}")
		public void userEnterEmailAndPassword(String email,String password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwordField,password);
		logger.info("user entered email "+ email + " and password "+ password);
	SlowDown();
		
	}
	
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("user logged in into account");
		SlowDown();
		
	}
	@And("user click on create new account button")
	public void UserClickOnCreateNewAccountButton() {
		click(factory.signInPage().newAccountButton);
		logger.info("user clicked on create new account button");
	}
	@And("user fill the signup information  with below data")
	public void UerFillTheSignupInformmationWithBelowData(DataTable data) {
	List<Map<String,String>> signUpData= data.asMaps(String.class,String.class);
	sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
	sendText(factory.signInPage().NewEmail,signUpData.get(0).get("email"));
	sendText(factory.signInPage().Password1,signUpData.get(0).get("password"));
	sendText(factory.signInPage().ConfirmPassword1,signUpData.get(0).get("confirmpassword"));
	logger.info("user entered requrired information into sign up form");
	//List<List<String>> signUp = data.asList(String.class);
	//System.out.println(factory.signInPage().get(0).get(0));
	}
	@And("user click on signup button")
	public void UserClickOnSignupButton() {
		click(factory.signInPage().SignUp);
		logger.info("user clicked on Sign up button");	
	}
	@Then("user should be logged into account page")
	public void UserShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImage));
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("Account Was created");
	    SlowDown();
	}
	}
	
	
	
