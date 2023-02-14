package java_programs;

public class even_odd_numbers_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {1,2,3,4,7,8,9,10};
		int even=0;
		int odd=0;
		for(int i=0;i<number.length;i++) {
			if(number[i]%2==0) {
				even=number[i];
				System.out.println(even+"is even number ");
			}
			else {
				odd=number[i];
				System.out.println(odd+"is odd number ");
			}
		}
		
	}

}
