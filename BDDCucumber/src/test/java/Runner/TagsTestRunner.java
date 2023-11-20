package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features="src/test/java/Features/Tags.feature",glue={"StepDefination"},
tags="@SmokeTest and @Important")

public class TagsTestRunner {

	
	
}
