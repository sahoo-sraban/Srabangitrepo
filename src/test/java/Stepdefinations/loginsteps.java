package Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("inside step user is in log in page");
	}

	@When("enter user name & pswd")
	public void enter_user_name_pswd() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("inside step user name & pswd ");
	}

	@And("clcik on lognin button")
	public void clcik_on_lognin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("inside step user is  able to clcik on button ");
	}

	@Then("user is navigated to thr home page")
	public void user_is_navigated_to_thr_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("inside step user navigate to home page");
	}


}
