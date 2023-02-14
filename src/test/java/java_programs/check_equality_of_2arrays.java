package java_programs;

public class check_equality_of_2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[]= {1,2,3,4,5};
		int number2[]= {1,2,3,4,5};
		if(number.length==number2.length) {
			System.out.println("both arrays are equel");
			for(int i=0;i<number.length;i++) {
				if(number[i]==number2[i]) {
					System.out.println("both numbers are same");
					break;
				}
				else {
					System.out.println("both numbers are not same");
				}
			}
		}else {
			System.out.println("both arrays are not equel");
		}
	}

}
