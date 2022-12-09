package practise;

import java.util.HashMap;
import java.util.Map;

public class mapandhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String>obj = new HashMap<String,String>();
		obj.put("100", "mahesh");
		obj.put("101", "hitesh");
		obj.put("102", "suresh");
		obj.put("103", "karthik");
		obj.put("104", "pashabhai");
		obj.put("105", "lingareddy");
		obj.put("106", "ramana");
	
		
		System.out.println(obj.get("105"));
		// to print all the elements in a map or hashmap we have to use this iterator
		for (Map.Entry<String, String> entry : obj.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
			
		}
		
		
		
		
	}

}
