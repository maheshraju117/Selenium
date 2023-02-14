package java_programs;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=12321;
		int num=number;
		int rev=0;
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;
		}
		System.out.println("original number is "+num+"reversed number is "+rev);
		if(rev==num) {
			System.out.println("the entered number is a palindrome number");
		}
		else {
			System.out.println("this is not a palindrome number");
		}
	}

}
