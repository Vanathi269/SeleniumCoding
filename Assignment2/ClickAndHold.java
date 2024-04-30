package Assignment2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {
	@Test
	public void clickAndHold() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Get started free"));

		action.moveToElement(element).clickAndHold();
		driver.quit();
	}
}
