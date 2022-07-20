package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/featurefiles",
		glue =  {"C:\\Users\\Saravana\\eclipse-workspace\\MyCucumber\\src\\test\\java\\Day1\\StepDefinition.java"},
		
		plugin = {"pretty, html: target/cucmber-reports/cucmber-pretty"}
		)
public class RunnerClassOne {

	
}
