package java_programs;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class random_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random2();
	}
	//approach1
	static void random1() {
		Random rand = new Random();
		int number = rand.nextInt(150);
		System.out.println(number);
		
	}
	
	//approach2
	static void random2() {
		String number = RandomStringUtils.randomNumeric(5);
		String alpha = RandomStringUtils.randomAlphabetic(5);
		System.out.println("number is "+number);
		System.out.println("alphabetic is "+alpha);
	}
	
}
