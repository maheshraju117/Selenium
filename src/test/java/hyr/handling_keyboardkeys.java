package hyr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_keyboardkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/* To use keyboard
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).perform();
		act.sendKeys(Keys.SPACE).perform();
		*/
		
		
		//to perform CTRL+A ,CTRL+C,TAB,CTRL+V
		driver.get("https://text-compare.com/");
		driver.findElementById("inputText1").sendKeys("hello rudraraju mahesh");
		Actions act = new Actions(driver);
		
		// to perform CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// to perform CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//to perform move to one tab to another tab
		act.sendKeys(Keys.TAB).perform();
		
		//to perform CTRL+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
	}

}
