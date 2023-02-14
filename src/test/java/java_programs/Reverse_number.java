package java_programs;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_number obj=new Reverse_number();
		obj.reverse_number2();
		
	}
	//method 1
	void reverse_number() {
		int number = 54321;
		StringBuilder sb = new StringBuilder();
		StringBuilder rev = sb.append(number).reverse();
		System.out.println(rev);
	}
	//reverse a number methos2
	void reverse_number2() {
		int number=12345;
		int rev=0;
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;
		}
		System.out.println("the reversed number is "+rev);
	}
	
}
