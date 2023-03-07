package java_programs;

import java.util.HashSet;
import java.util.Set;

import practise.set;

public class delete_duplicates_in_array_and_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[]= {1,2,3,4,5,3,2};
		Set<Integer>sets =new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			sets.add(arr[i]);
		}
		System.out.println(sets);
		
		
	}

}
