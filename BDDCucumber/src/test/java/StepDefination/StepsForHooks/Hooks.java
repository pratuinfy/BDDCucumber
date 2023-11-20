package StepDefination.StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class Hooks {
	
	@Before
	public void browsersetup() {
		
		System.out.println("i am in the browser set up");
	}
	
	@After
    public void teardown() {
		
		System.out.println("i am in the teardown set up");
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("user_is_on_the_login_page");
	}

	@When("user enterd valid Username and Password")
	public void user_enterd_valid_username_and_password() {
		System.out.println("user_enterd_valid_username_and_password");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("click_on_login_button");
	}

	@Then("user is redirected to home page")
	public void user_is_redirected_to_home_page() {
		System.out.println("user_is_redirected_to_home_page");
	}

}
