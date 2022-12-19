package hyr;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class handling_upload_files {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/");
		driver.findElementByXPath("//div[normalize-space()='Upload Resume']").click();
		WebElement upload = driver.findElementByXPath("//input[@id='file-upload']");
		
		//by using javascript we can click elements
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", upload);
		
		//by using robot class we can perform upload files
		Robot rb= new Robot();
		rb.delay(2000);
		
		//by using string selection we can save sourcepath of a file
		StringSelection ss = new StringSelection("C:\\Users\\Syam\\OneDrive\\Desktop\\automation tester.docx");
		
		//by using toolkit we can set contents
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//by using robot class we can performm keyboard actions
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
