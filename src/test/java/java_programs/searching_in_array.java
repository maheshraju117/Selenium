package java_programs;

public class searching_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {10,20,30,40,50};
		int num=30;
		boolean flag=false;
		for(int i=0;i<number.length;i++) {
			if(number[i]==num) {
				System.out.println("we have the matching number "+number[i]);
				flag=true;
			}		
		}if(flag==false) {
			System.out.println("no matches found");
		}
		
	}
}

