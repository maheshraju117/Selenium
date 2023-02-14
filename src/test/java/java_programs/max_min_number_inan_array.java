package java_programs;

public class max_min_number_inan_array {

	public static void main(String[] args) {
		max_min_number_inan_array obj = new max_min_number_inan_array();
		obj.smallest_number();
	}
	
	void largest_number() {
		int number[]= {10,20,30,80,45,10};
		int max=number[0];
		for(int i=0;i<number.length;i++) {
			if(number[i]>max) {
				max = number[i];
			}
		}
		System.out.println("largest number is "+max);
	}
	
	void smallest_number() {
		int number[]= {10,20,1,80,45,100};
		int min=number[0];
		for(int i=1;i<number.length;i++) {
			if(number[i]<min) {
				min=number[i];
			}
		}
		System.out.println("smallest number is "+min);
	}
}
