package practise;

import java.util.ArrayList;
import java.util.HashSet;

public class set {

	private static final String Set = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String>obj = new HashSet<String>();
		obj.add("abcde");
		obj.add("qwerty");
		obj.add("mahesh");
		obj.add("ijkl");
		obj.add("mnop");
		// by using set values we have to convert set into string
		ArrayList<String>obj1 = new ArrayList<String>(obj);
		System.out.println(obj1.get(2));
		
	}

}
