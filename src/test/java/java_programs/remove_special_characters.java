package java_programs;

public class remove_special_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="maheshraju117.!@#$%^&";
		
		String s = name.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
		
	}

}
