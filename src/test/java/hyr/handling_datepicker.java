package hyr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElementById("onward_cal").click();
		String date="10";
		String month ="Jun";
		String year = "2023";
		// this while loop continue running until it is true
		while (true) {
			String calender = driver.findElementByClassName("monthTitle").getText();
			// split the month & year with <space>
			 String cal[] = calender.split(" ");
			if(cal[0].equalsIgnoreCase(month)&& cal[1].equals(year)) 
				break;
			else
				driver.findElementByXPath("//td[normalize-space()='>']").click();
			}
		List<WebElement> days =driver.findElementsByXPath("//table[@class='rb-monthTable first last']//td");
		for(WebElement dat:days) {
			String d =dat.getText();
			if(d.equalsIgnoreCase(date)) {
				dat.click();
			}
		}
		
		
		}	
	}

