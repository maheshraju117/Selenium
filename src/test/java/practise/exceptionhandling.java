package practise;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("execution is started");
		try {
			int i=10/0;
			System.out.println("your result is "+i);
		} catch (ArithmeticException e) {
			System.out.println("execution problem is "+e.getMessage());
		}
		
	}

}
