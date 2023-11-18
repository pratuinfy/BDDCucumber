package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class Login {
	
	WebDriver driver=new ChromeDriver();
	
	@Given("User will on login page")
	public void user_will_on_login_page() 
	{
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
		
	}

	@When("User enters(.*) and (.*)$")
	public void user_enters(String username , String password) {
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
	}

	@When("Click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("User is redireced to home page")
	public void user_is_redireced_to_home_page() {
	   
		System.out.println(driver.getTitle());
		driver.quit();
	}

	
}
