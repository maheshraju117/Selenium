package java_programs;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
public class sorting_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorting_an_array obj = new sorting_an_array();
		obj.sortingarray();
		
	}

	public void sortingarray() {
		int arr[]= {1,6,3,8,9,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
