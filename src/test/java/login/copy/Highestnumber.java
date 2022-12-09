package login.copy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Highestnumber {
	public static void main(String[] args) throws Exception {
	int a[] = {1,2,99,66,55,48,9564,646};
	
	int max=a[0];
	for (int i = 0; i < a.length; i++) {
		
		if (a[i]>max) {
			
			max=a[i];
			
		}
		
	}
	System.out.println(max);
	}
}
