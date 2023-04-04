package java_programs;

public class string_manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="mahesh raju rudraraju";
		
		//length of a string
		System.out.println(name.length());
		
		//index of character
		System.out.println(name.charAt(3));
		
		//character at index
		System.out.println(name.indexOf('h'));
		
		//character at second occurance
		System.out.println(name.indexOf('h',name.indexOf('h')+1));
		
		//string occurance1
		System.out.println(name.indexOf("raju"));
		
		//trim
		System.out.println(name.trim());
		
		//replace
		System.out.println(name.replace(" ", ""));
		
		
		
	}

}
