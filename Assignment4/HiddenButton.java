package Assignment4;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenButton {
	@Test
	public void hiddenButton() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// implicit wait
		// driver.manage().timeouts().implicitlyWait(10, null);

		// URL launch
		driver.get("https://learn.letskodeit.com/p/practice");

		// identify element and click
		driver.findElement(By.id("hide-textbox")).click();

		// Javascript executor class with executeScript method
		JavascriptExecutor j = (JavascriptExecutor) driver;

		// identify element and set value
		j.executeScript("document.getElementById('displayed-text').value='Selenium';");
		String s = (String) j.executeScript("returndocument.getElementById('displayed-text').value");
		System.out.print("Value entered in hidden field: " + s);
		driver.close();

	}
}
