package practiseeee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.javadoc.io/static/org.seleniumhq.selenium/selenium-api/2.50.1/index.html?overview-summary.html");
		driver.switchTo().frame(2);
		driver.findElementByXPath("(//*[text()='Tree'])[1]").click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElementByXPath("//*[@title='annotation in org.openqa.selenium']").click();
		
		
		
		
		
	}

}
