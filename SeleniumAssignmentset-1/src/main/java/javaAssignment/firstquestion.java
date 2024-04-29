package javaAssignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstquestion {
	public static void hover() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		WebElement hover=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		Actions select=new Actions(driver);
		select.moveToElement(hover).perform();
		driver.close();
		}
		
	public static void javaScriptExecutor() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window,scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("admin23@gmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
		driver.close();
		
	}
	public static void switchingWindow() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/practiceform/");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		it.next();
		String childwindowId = it.next();
		
		System.out.println("parent window------"+parentWindowId);
		System.out.println("child window------"+childwindowId);
		
		driver.switchTo().window(childwindowId);
		System.out.println("child window" + driver.getTitle());
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window" + driver.getTitle());
		driver.quit();

	}
	public static void implicitWait() {
		WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.close();
		}
			


		public static void explicitWait() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.seleniumframework.com/practiceform/");
			driver.findElement(By.id("timingAlert")).click();
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			driver.close();
		}
	public static void main(String[] args) throws InterruptedException {
		hover();
		//javaScriptExecutor();
		//switchingWindow();
		//implicitWait();
		//explicitWait();
	
		
		
	}
}
