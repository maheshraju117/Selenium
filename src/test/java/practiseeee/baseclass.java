package practiseeee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		childclass obj = new childclass();
		String q = obj.man("a");
		driver.get(q);
		
		
	}

}
