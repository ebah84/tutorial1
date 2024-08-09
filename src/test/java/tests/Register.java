package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	@Given("^I navigate to the Register Account page$")
	public void I_navigate_to_the_Register_Account_page() {
		
		System.out.println(">>User got navigated to Register page");
	}
	
	@When("I enter first name {string} into First name field")
	public void I_enter_first_name_into_First_name_field(String firstNameText) {
		System.out.println(">> User has entered first name:" + firstNameText + "into the first name field");
	}
	
	@When("I enter last name {string}")
	public void i_enter_last_name(String lastNameText) {
	    System.out.println(">>User entered last name: "+ lastNameText+ "into the last name field");
	}

	@When("I enter email address {string} into the email address field")
	public void i_enter_email_address_into_the_email_address_field(String emailText) {
	    System.out.println(">> User has entered email: " + emailText + "into the email field");
	}

	@When("I enter telefon number {string} into the Phone number field")
	public void i_enter_telefon_number_into_the_phone_number_field(String phoneNumberText) {
	    System.out.println(">> User has entered:"+ phoneNumberText + "into the phone number field");
	}

	@When("I enter password {string} into the Password field")
	public void i_enter_password_into_the_password_field(String passwordText) {
	    System.out.println(">> User has entered the password:"+ passwordText + "into the password field");
	}

	@And("I enter password {string} into the Password confirm field")
	public void i_enter_password_into_the_password_confirm_field(String passwordText) {
		System.out.println(">>User has entered the password:"+ passwordText + "into the password confirm field");
	}

	@When("I select Privacy Policy field")
	public void i_select_privacy_policy_field() {
	    System.out.println(">>User has selected privacy policy button");
	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() {
	    System.out.println(">>User has selected Continue button");
	}

	@Then("Account should get created successfully")
	public void account_should_get_created_successfully() {
	   System.out.println(">>User account successfully created");
	}
	
	@When("I select Yes for Newsletter")
	public void i_select_yes_for_newsletter() {
	   System.out.println(">>User has  selected Yes for newslatter");
	}

	@When("I dont enter details into any field")
	public void i_dont_enter_details_into_any_field() {
	    System.out.println(">>User has left all fields blank");
	}

	@Then("Warning messages shoudld be displayed for all mandatory fields")
	public void warning_messages_shoudld_be_displayed_for_all_mandatory_fields() {
	    System.out.println(">> Warning method displayed all the mandatory fields");
	}

	@Then("Warning message about the duplicate email address should be displayed")
	public void warning_message_about_the_duplicate_email_address_should_be_displayed() {
	    System.out.println(">> Warning about duplicate email got displayed");
	}

	

}
