package login;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	@Test
	public void man() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElementByName("username").sendKeys("admin");
		driver.findElementByName("password").sendKeys("admin123");
		driver.findElementByXPath("//*[@type='submit']").click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Syam\\eclipse-workspace\\selenium\\src\\test\\resources\\log.jpg");
		FileUtils.copyFile(source, f);
		System.out.println("screenshot has been taken");
	}
}