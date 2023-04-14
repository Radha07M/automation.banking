package banking.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SingInStep {
	@Given("Open flipkart application")
	public void openFlipkartApplication()
	{
		System.out.println("Opened Flipkart app");
	}
	
	@When("user enters a username $username and password $password")
	public void enterUsernamePassword(String username, String password)
	{
		System.out.println("Entered valid username and password");
	}
	
	@Then("Verifies user logged in to flipkart application with valid user details")
	public void verifyLoggedInToFlipkart()
	{
		System.out.println("Verifed user logged in to flipkart");
	}
}
