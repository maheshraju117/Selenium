package practise;

public class conditionalstatements {

	public void ifelse() {
		
		String browser="chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome browser opened");
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.out.println("firefox browser opened");
		}
		else if(browser.equalsIgnoreCase("internetexp")) {
			System.out.println("internetexp is opened");
		}
		else {
			System.out.println("no brower is opened");
		}
	}
	public void switchcase() {
	
		String browser="fix";
		
		switch(browser) {
		
		case "chrome": System.out.println("chrome browser opened");
		break;
		case "firefox": System.out.println("firefox is opened");
		break;
		case "ie": System.out.println("ie is opened");
		break;
		default : System.out.println("no browser is entered");
		
		}
	}
	public static void main(String[] args) {
		conditionalstatements obj = new conditionalstatements();
		obj.switchcase();
	}
	
}
