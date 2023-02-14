package java_programs;

public class check_missing_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {1,2,3,5};
		int missing_number=0;
		int x=0;
		for(int i=0;i<number.length;i++) {
			x = x+number[i];	
		}
		
		for(int i=1;i<=5;i++) {
			missing_number=missing_number+i;
		}
		int a=missing_number-x;
		System.out.println("missing_number = "+a);
	}

}
