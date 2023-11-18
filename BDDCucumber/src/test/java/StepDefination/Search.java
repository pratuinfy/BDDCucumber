package StepDefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	WebDriver driver=new ChromeDriver();
	
	@Given("browser is open")
	public void browser_is_open() {
	    
		System.out.println("browser is open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@And("we are on the google search page")
	public void we_are_on_the_google_search_page() {
		
		driver.navigate().to("https://www.google.com/");
	    
	}

	@When("user enters a text in a search box")
	public void user_enters_a_text_in_a_search_box() {
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("cucumber framework");
	   
	}

	@And("hits enter")
	public void hits_enter() {
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
	    
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
	   
		driver.getPageSource().contains("What is Cucumber Framework? (Benefits of ...");
		driver.close();
		driver.quit();
	}

}
