package java_programs;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(10);
		arr.add(2);
		arr.add(5);
		arr.set(1, 22);
		arr.remove(1);
		arr.add(2);
		arr.add(8);
		Collections.sort(arr);
		System.out.println(arr);
		
		
	}

}
