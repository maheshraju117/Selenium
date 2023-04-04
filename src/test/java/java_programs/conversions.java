package java_programs;

public class conversions {
 
	public static void main(String[] args) {
		String_into_integer();
		number_into_string();
		chararray_into_String();
		string_into_chararray();
		
		
	}
	public static void String_into_integer() {
			String name="12345";
			System.out.println(Integer.parseInt(name));	
	}
	
	public static void number_into_string() {
		int number=54321;
		System.out.println(Integer.toString(number));
	}
	
	public static void boolen_into_string() {
		boolean b=true;
		System.out.println(Boolean.toString(b));	
	}
	
	public static void String_into_boolean() {
		String b="true";
		System.out.println(Boolean.parseBoolean(b));	
	}
	
	public static void char_into_string() {
		char c='m';
		System.out.println(String.valueOf(c));
	}
	
	public static void chararray_into_String() {
		char ch[]= {'m','a','h','e','s','h'};
		System.out.println(String.valueOf(ch));
	}
	
	public static void string_into_chararray() {
		String name="mahesh";
		char ch[] = name.toCharArray();
		System.out.println(ch);
	}
		
}
