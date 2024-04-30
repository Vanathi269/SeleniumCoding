package Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MHParticularElement {
	@Test
	public void hover() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		// Create object 'action' of an Actions class
		Actions action = new Actions(driver);
		// Mouseover on an element
		action.moveToElement(ele).perform();
		driver.quit();
	}
}
