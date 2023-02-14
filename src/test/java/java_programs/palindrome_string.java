package java_programs;

public class palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="madam";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev+"  "+name);
		if(rev.equals(name)) {
			System.out.println("this string is apalindrome");
		}
		else {
			System.out.println("this is not apalindrome");
		}
	}

}
