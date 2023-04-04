package java_programs;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="www.mahesh.com";
		String first = name.substring(0,4);
		String last = name.substring(name.length()-4, name.length());
		String middle = name.substring(4,name.length()-4);
		System.out.println(first);
		System.out.println(middle);
		System.out.println(last);
		
	}

}
