package hyr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_mouse_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*double click & right click
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement dclick = driver.findElementByXPath("//button[@ondblclick='myFunction()']");
		WebElement rclick =driver.findElementByXPath("//span[@class='context-menu-one btn btn-neutral']");
		Actions act = new Actions(driver);
		//double click
		act.doubleClick(dclick).perform();
		driver.switchTo().alert().accept();
		
		//right click
		act.contextClick(rclick).perform();
		List<WebElement> op = driver.findElementsByXPath("//ul[@class='context-menu-list context-menu-root']//li");
		for(WebElement options:op) {
			String cuts =options.getText();
			if(cuts.equalsIgnoreCase("cut")) {
				options.click();
				break;
				}
			}*/
		
		/*drag and drop
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		*/
		/* move to the element
		driver.get("https://demo.opencart.com/");
		WebElement move =driver.findElementByXPath("//*[normalize-space()='Desktops']");
		WebElement mac= driver.findElementByXPath("//li//a[normalize-space()='Mac (1)']");
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();
		mac.click();
		*/
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement slider =driver.findElementByXPath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']");

		System.out.println(slider.getLocation());//(69, 255)
		System.out.println(slider.getSize());//(353, 10)
		WebElement leftslider = driver.findElementByXPath("//span[@style='left: 0%;']");
		WebElement rightslider = driver.findElementByXPath("//span[@style='left: 100%;']");
		Actions act = new Actions(driver);
		// after entering build we can store the action in an action class
		Action a =act.dragAndDropBy(leftslider, 100, 0).build();
		a.perform();
		act.dragAndDropBy(rightslider, -50, 0).perform();
	
	}
	}

