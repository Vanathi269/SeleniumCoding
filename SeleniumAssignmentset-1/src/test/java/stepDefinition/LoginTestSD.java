package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestSD {
	WebDriver driver;

	@Given("user launches the application")
	public void user_launches_the_application() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@When("user enters username")
	public void user_enters_username() {
		driver.findElement(By.name("username")).sendKeys("Admin");	}

	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		driver.quit();

	}

}
