package java_programs;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=8;
		int count=0;
		if(number>1) {
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(number+ " is a prime number");
			}
			else {
				System.out.println(number+" is not a prime number");
			}
		}
		else {
			System.out.println("this is not a palindrome number");
		}
		
	}

}
