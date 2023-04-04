package java_programs;

import java.util.HashMap;
import java.util.Map;

public class charecter_occurence_in_string {

	public static void main(String[] args) {
		String name="mahesh";
		char ch[] = name.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				int value = map.get(c);
				map.put(c,value+1);
			}
		}
		System.out.println(map);
	}
}
