package java_programs;

public class sum_ofelements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		int total = 0;
		
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		System.out.println(total);
	}

}
