package login;

import org.testng.annotations.Test;

public class TestngSequencing {
	
	@Test(priority = 1, enabled =true)
	
	public void mahesh() {
		System.out.println("maheshraju rudraraju");
	}
	@Test(priority = 0)
	public void ramakrishna() {
		System.out.println("ramakrishnamraju rudraraju");
	}
	@Test(priority = 2)
	public void surparaju() {
		System.out.println("surparaju rudraraju");
	}
	
	
	
	
	
	
	
	
	

}
