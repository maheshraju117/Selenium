package java_programs;

import java.util.Arrays;

public class swapping_of_strings {

	public static void main(String[] args) {
		
		String husband="mahesh";
		String wife="ramya";
		
		husband=husband+wife;
		wife=husband.substring(0, 6);
		husband=husband.substring(husband.length()-5, husband.length());
		
		
		System.out.println("wife is "+wife);
		System.out.println("husband is "+husband);
	}

}
