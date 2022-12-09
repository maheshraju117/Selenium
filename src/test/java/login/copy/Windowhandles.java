package login.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.onlinesbi.sbi/");
		driver.findElementByLinkText("SBI Card").click();
		Set<String>handles = driver.getWindowHandles();
		//To convert set to list because set have no fetching methods
		List<String>handcon = new ArrayList<String>(handles);
		String mainwindow = handcon.get(0);
		String newwindow = handcon.get(1);
		driver.switchTo().window(newwindow);
		String newurl = driver.getCurrentUrl();
		//this will helps to move one window to another window
		driver.switchTo().window(mainwindow);
		String mainurl = driver.getCurrentUrl();
		System.out.println(newurl);
		System.out.println(mainurl);
		
	
	}

}
