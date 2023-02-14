package java_programs;

public class count_digits_in_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=123456789;
		int count =0;
		while(number!=0) {
			number = number/10;
			count++;
		}
		System.out.println(count);
	}

}
