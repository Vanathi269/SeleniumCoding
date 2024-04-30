package Assignment6;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	@Test
	public void takeScreenShot() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String tcname = "sample";
		String filepath = "./screenshot/" + tcname + ".jpge";
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(filepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
