package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	@Test
	public void dragdrop() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement Sourcelocator = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement Destinationlocator = driver.findElement(By.xpath("//p[text()='Dropped!']"));
		action.dragAndDrop(Sourcelocator, Destinationlocator).perform();
		driver.quit();
	}
}