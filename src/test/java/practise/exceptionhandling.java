package practise;
public class exceptionhandling {
	public static void main(String[] args) {
	
		int number1=10;
		int number2=0;
		int result=0;;
		try {
			result=number1/number2;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			System.out.println("you have got an exception");
			throw ae;
		}
		finally {
			System.out.println("this is a finally block");
		}
		System.out.println("result is  "+result);
		System.out.println("the program has ended");
		
		
		
		
	}
}
