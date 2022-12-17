package hyr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_multiple_dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		/*1. to select only one check box
		 
		driver.findElementById("monday").click();*/
		
		/*2. to select all check boxes
		 
		List<WebElement>days = driver.findElementsByXPath("//input[@type='checkbox' and @class='form-check-input']");
		for(WebElement day:days) {
			day.click();
		}*/
		
		/*3. to select by choice check box
		 
		List<WebElement>checkboxes = driver.findElementsByXPath("//input[@type='checkbox' and @class='form-check-input']");
		for(WebElement box:checkboxes) {
			String day = box.getAttribute("id");
			if(day.contains("monday")||day.contains("friday")) {
				box.click();
			}
		}*/	
		
		/*4. select first 2 checkboxes
		 
		List<WebElement>checkboxes = driver.findElementsByXPath("//input[@type='checkbox' and @class='form-check-input']");
		for (int i = 0; i <=2; i++) {
			checkboxes.get(i).click();
		}*/
		
		/*5. select last two checkboxes
		
		List<WebElement>checkboxes = driver.findElementsByXPath("//input[@type='checkbox' and @class='form-check-input']");
		for(int i=checkboxes.size()-2; i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}*/
		
	}
}
