package tek.sdet.framework.steps;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RetailSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();

	@Given("login as tek user to retail app with username {string} and password {string}")
	public void loginAsTekUserToRetailAppWithUsernameAndPassword(String userNameValue, String passwordValue)
			throws InterruptedException {
	}

	@Then("assert application title {string}")
	public void assertApplicationTitle(String expectedTitle) {

	}
}