package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("^User navigates to Login page$")
	public void user_navigates_to_login_page() {
	   
		System.out.println(">>User navigated to login ");
	}

	@When("^User enters valid email (.+)$")
	public void user_enters_valid_email_address(String email) {
	    
		System.out.println(">>User enters valid email " + email);
	}
	
	@And ("^Enters valid password (.+)$")
	public void enters_valid_password(String password) {
	    System.out.println(">> User enters valid password" + password);
	}

	

	@And("^Clicks on Login button$")
	public void clicks_on_login_button() {
	    System.out.println(">>User clicks on login button");
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() {
		
		System.out.println(">>User succesfully logged in");
	    
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmail) {
		
		System.out.println(">>User entered invalid password" + invalidEmail);
	    
	}

	@When("Enters invalid password {string}")
	public void enters_invalid_password(String invalidPassword) {
		System.out.println(">>User entered invalid password" + invalidPassword);
	    
	}

	@Then("^User should get a proper warning message$")
	public void user_should_get_a_proper_warning_message() {
	    System.out.println(">>User got proper warning");
	}



	@When("^User doesn't provide any credentials$")
	public void user_doesn_t_provide_any_credentials() {
	   System.out.println(">>User has not entered any credentials");
	}


}
