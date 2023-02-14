package java_programs;

public class swaping_of_2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;

		
		//1st method (with using third variable)
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a value is "+a+" "+"b value is "+b);
		
		
		//2nd method (with out using third variable)

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value is "+a+" "+"b value is "+b);
		
		
		
		
	}

}
