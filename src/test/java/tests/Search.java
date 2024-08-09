package tests;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	WebDriver driver;

    @Given("^User opens Application$")
    public void user_opens_application() {
        System.out.println(">> Application opened");
    }

    @When("^User enters valid product into Search field$")
    public void user_enters_valid_product_into_search_field() {
       System.out.println(">> Valid product entered into field");
    }

    @When("User enters non-existing product into Search field")
    public void user_enters_non_existing_product_into_search_field() {
        System.out.println(">> No product matching the search ");
    }

    @When("User doesnt enter any product into Search field")
    public void user_doesnt_enter_any_product_into_search_field() {
        // Do nothing as no input is provided
    	System.out.println(">> No such  product exists message displayed");
    	
    }

    @When("User clicks on Search button")
    public void user_clicks_on_search_button() {
        System.out.println(">> User clicked the Search button");
    }

    @Then("Valid Product should be displayed in search results")
    public void valid_product_should_be_displayed_in_search_results() {
        System.out.println(">> Valid product displayed");
    }

    @Then("Proper text informing the User about no product matching should be displayed")
    public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
        System.out.println(">> No matching product message displayed");
    }

}
