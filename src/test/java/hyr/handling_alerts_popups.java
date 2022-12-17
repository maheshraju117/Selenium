package hyr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_alerts_popups {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//1 handle single alert
		
		driver.findElementByXPath("//button[@onclick='jsAlert()']").click();
		driver.switchTo().alert().accept();
		
		//2. handle 2 alerts
		
		driver.findElementByXPath("//button[@onclick='jsConfirm()']").click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		//3. enter text in an alert
		
		driver.findElementByXPath("//button[@onclick='jsPrompt()']").click();
		Thread.sleep(2000);
		Alert ale =driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.sendKeys("maheshraju rudraraju");
		ale.accept();*/
		
		
		/*4. To enter autherization credentials in apop-up
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");*/
		
		
		/*5. to handle browser popup's
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		chromedriver driver = new ChromeDriver(options);*/
		
	}

}
