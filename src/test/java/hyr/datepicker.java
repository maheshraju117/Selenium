package hyr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		int day = 30;
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElementById("second_date_picker").click();
		driver.findElementByXPath("//a[@data-handler='next']").click();
		driver.findElementByXPath("//*[@id='ui-datepicker-div']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()=16]").click();
		
		
		
	}
}
