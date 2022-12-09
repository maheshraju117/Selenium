package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions a = new Actions(driver);
		WebElement x =driver.findElementByXPath("//span[@class='context-menu-one btn btn-neutral']");
		a.contextClick(x).perform();
		driver.findElementByXPath("//*[text()='Paste']").click();
		driver.switchTo().alert().accept();
		

	}

}
