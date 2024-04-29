package javaAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	@Test
 public void demos() {
	 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("abcryqwtyd");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.close();
 }
}
