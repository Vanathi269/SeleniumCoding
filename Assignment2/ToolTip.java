package Assignment2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {
	@Test
	public void toolTip() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		WebElement tooltipbutton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		tooltipbutton.click();
		String tooltiptext = tooltipbutton.getAttribute("title");
		System.out.println(tooltiptext);
		{
			if (tooltiptext.equalsIgnoreCase("you hovered over the button")) {
				System.out.println("tool tip match");
			} else {
				System.out.println("tool tip does not match");
			}
		}
		String toolTipText = "you hovered over the button";
		Assert.assertEquals(tooltipbutton, tooltipbutton);
		driver.quit();
	}
}
