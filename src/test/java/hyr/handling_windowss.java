package hyr;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_windowss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();
		Set<String>windows = driver.getWindowHandles();
		for(String win:windows) {
			if(!win.equals(parentwindow)) {
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		 System.out.println(driver.getTitle());
	}

}
