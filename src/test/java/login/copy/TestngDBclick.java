package login.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDBclick {
	@Test
	public void dclick()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		WebElement x =driver.findElementByXPath("//button[@ondblclick='myFunction()']");
		act.doubleClick(x).perform();
		driver.switchTo().alert().accept();
	}

}
