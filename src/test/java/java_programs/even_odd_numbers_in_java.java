package java_programs;

public class even_odd_numbers_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345;
		int even=0;
		int odd=0;
		while(number!=0) {
			int x= number%10;
			if(x%2==0) {
				even++;
			}
			else {
				odd++;
			}
			number=number/10;
			
		}
		System.out.println("even numbers are "+even);
		System.out.println("odd numbers are "+odd);
	}
}
