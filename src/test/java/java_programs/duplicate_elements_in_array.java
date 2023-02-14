package java_programs;

public class duplicate_elements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {1,2,3,4,5,6,6,1,2};
		int dup=number[0];
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					System.out.println("duplicate numbers are "+number[i]);
				}
			}
		}
	}

}
