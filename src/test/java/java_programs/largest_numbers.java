package java_programs;

public class largest_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		largest_numbers obj = new largest_numbers();
		obj.largest_number_method2();
		
	}
	void largest_number_method1() {
		int a=10;
		int b=20;
		int c = 3;
		
		if(a>b&&a>c) {
			System.out.println("a is a largest number");
		}
			else if(b>c&&b>a) {
				System.out.println("b is a largest number");
			}
			else {
				System.out.println("c is a largest number");
		}	
	}
	void largest_number_method2() {
		int a=10;
		int b=90;
		int c=18;
		int largest = a>b?a:b;
		int largest2 = c>largest?c:largest;
		System.out.println(largest2);
		
		
		
		
		
	}
		
}

