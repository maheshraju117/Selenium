package hyr;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	@Test(dataProvider = "data")
	public void mahesh(String user, String pass){
		
		System.out.println("username is "+user);
		System.out.println("password is "+pass);
		System.out.println();

	}
	
	@Test(dataProvider = "data1")
	public void mahesh1(String user1, String pass1){
	    
	    System.out.println("username is "+user1);
	    System.out.println("password is "+pass1);
	    System.out.println();

	}
	//1st approach
	@DataProvider
	public Object[][] data() {
		Object[][] obj=new Object[4][2];
		obj[0][0]="username";
		obj[0][1]="password";
		
		obj[1][0]="username1";
		obj[1][1]="password1";
		
		obj[2][0]="username2";
		obj[2][1]="password2";
		
		obj[3][0]="username3";
		obj[3][1]="password3";
		
		return obj;
	}
	
	//2nd approach
	@DataProvider
	public Object[][] data1(){
		
	return new Object[][] {{"user","pass"},{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		
		
	}

}
