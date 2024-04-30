package Assignment2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void mouseHover() {
		String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTooltip = "OrangeHRM";
		WebElement hrm = driver.findElement(By.xpath("//title[text()='OrangeHRM']"));
		String actualTooltip = hrm.getAttribute("title");
		System.out.println("Actual Title of Tool Tip" + actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed");
		}
		driver.close();
	}
}
