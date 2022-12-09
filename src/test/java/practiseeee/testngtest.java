package practiseeee;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class testngtest {
  @Test(groups = "checkolist")
  public void test() {
	  System.out.println("hey mahesh all is good");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("hey hiiiii");
	  System.out.println("hey your test has been starting");
	  System.out.println("your test execution started");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("your test has come to end");
	  System.out.println("your test has no failures");
	  System.out.println("test ended");
  }

}
