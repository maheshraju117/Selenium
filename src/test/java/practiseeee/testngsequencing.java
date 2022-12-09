package practiseeee;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testngsequencing {
	@Test(priority = 1,groups = "checkolist")
	public void apple() {
		System.out.println("this is apple");
		Assert.fail();
	}
	@Test(priority=4, groups = "checkolist")
	public void zebra() {
		System.out.println("this is zebra");
	}
	@Test(priority = 3,enabled = true)
	public void honey() {
		System.out.println("this is honey");
	}
	@Test(priority = 2,dependsOnMethods = "apple")
	public void dog() {
		System.out.println("this is dog");
	}
	
	
	
}
