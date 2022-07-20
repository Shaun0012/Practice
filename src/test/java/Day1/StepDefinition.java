package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver;
	
	@Given("User opens the  browser and launches the url using {string}")
	public void user_opens_the_browser_and_launches_the_url_using(String url) {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	@When("User enters the credentials to login")
	public void user_enters_the_credentials_to_login(DataTable dataTable) {
	    List<String> input = dataTable.transpose().asList(String.class);
	    String username =input.get(0);
	    String pwd =input.get(1);
	    
	    driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys(pwd);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	   
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
	}

	@Then("User is on the web page")
	public void User_is_on_the_web_page() {
	    
		System.out.println(driver.getTitle());
		driver.close();
	}
}
