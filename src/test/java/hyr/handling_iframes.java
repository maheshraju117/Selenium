package hyr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/* 1  This frame we can move from one frame to another frame
		driver.get("https://www.javadoc.io/static/org.seleniumhq.selenium/selenium-api/2.50.1/index.html?overview-summary.html");
		driver.switchTo().frame("packageListFrame");
		driver.findElementByXPath("//a[text()='org.openqa.selenium.html5']").click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElementByXPath("//div[@class='topNav']//a[text()='Help']").click();
		driver.switchTo().defaultContent();*/
		
		
		/* 2 this iframe can go in to one frame into another an danother frame into another frame
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElementByXPath("//a[normalize-space()='Iframe with in an Iframe']").click();
		WebElement a =driver.findElementByXPath("//iframe[@src='MultipleFrames.html']");
		driver.switchTo().frame(a);
		WebElement b =driver.findElementByXPath("//iframe[@src='SingleFrame.html']");
		driver.switchTo().frame(b);
		driver.findElementByXPath("//input[@type='text']").sendKeys("maheshraju");
		*/
		
		
	}

}
