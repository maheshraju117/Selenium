package java_programs;

public class Reverse_astring_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "hello my name is mahesh";
		String aftersplit[] = name.split(" ");
		for(int i=aftersplit.length-1;i>=0;i--) {
			System.out.print(aftersplit[i]+" ");
		}
		
		
	}

}
