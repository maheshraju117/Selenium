package hyr;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_javascript_executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = driver;
		// get title of the page
		//js.executeScript(location.reload());
		// java script executor is usde to some following methods
		//flash the webelement
		//scroll up & down
		//zoom
		//send keys
		//click
		
		
		
		
	}

}
