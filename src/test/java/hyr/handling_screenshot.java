package hyr;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//if it is chromedriver driver = new chromedriver()
		//(Takesscreenshot ts = driver;)
		//if it is webdriver driver = new chromedriver()
		//( we need to typecast it (takesscreenshot ts = (takesscreenshot)driver;)
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		/*to take page scrrenshot
		 * 
		TakesScreenshot ts= driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//screenshor//opencardhomepage.png");
		FileUtils.copyFile(src, trg);
		*/
		
		/* to take particular element screenshot
		WebElement footer = driver.findElementByXPath("//footer//div[@class='container']");
		File ft =footer.getScreenshotAs(OutputType.FILE);
		File sd = new File(".//screenshor//footersection.png");
		FileUtils.copyFile(ft, sd);
		driver.close();
		*/
		
		
		
	}

}
