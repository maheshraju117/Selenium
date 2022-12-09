package practiseeee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstrapdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElementById("menu1").click();
		List<WebElement>dd =driver.findElementsByXPath("//*[@class='dropdown-menu']");
		for (int i = 0; i < dd.size(); i++) {
			
			WebElement a =dd.get(i);
			String b = a.getText();
			
			if (b.contains("JavaScript")) {
			
			a.click();
			}
			System.out.println(b);

		}
	}
}
