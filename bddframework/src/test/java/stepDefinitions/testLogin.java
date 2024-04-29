package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testLogin {
	
	WebDriver driver;
		@When("user launches the application")
		public void user_launches_the_application() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		}

		
		@Given("user launches the shopping application")
		public void user_launches_the_shopping_application() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://demo-shopping-website.onrender.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		}
		@When("user enters username")
		public void user_enters_username() {
		   driver.findElement(By.name("username")).sendKeys("Admin");
		}

		@When("user enters password")
		public void user_enters_password() {
			driver.findElement(By.name("password")).sendKeys("admin123");
		}
		@When("user enters username as {string}")
		public void user_enters_username_as(String username) {
			 driver.findElement(By.name("username")).sendKeys(username);;
		}

		@When("user enters password as {string}")
		public void user_enters_password_as(String password) {
			 driver.findElement(By.name("password")).sendKeys(password);;
		}

		@When("user clicks on login button")
		public void user_clicks_on_login_button() {
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		}
		@When("selecting the particular case")
		public void selecting_the_particular_case() {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"btn-shopping\"]"))).click();
		}
		

		@Then("user should be logged in successfully")
		public void user_should_be_logged_in_successfully() {
			driver.quit();
		
		}
	/*	@When("^user enters (.+) and (.+)$")
	    public void user_enters_and(String username, String password) throws Throwable {
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
		}*/
}
