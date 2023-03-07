package java_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collections2.list();
		collections2.set();
		collections2.map();
	}
	
	static void list() {
		List<String>list=new ArrayList<>();
		
		//To add elements in list
		list.add("mahesh");
		list.add("naresh");
		list.add("suresh");
		list.add("pavan");
		
		//To remove an element
		list.remove(1);
		
		//To change value of an element
		list.set(2, "sureshhh");
		System.out.println("list values are "+list.get(1));
	}
	
	static void set() {
		Set<String>set=new HashSet<>();
		
		//To add in a set
		set.add("mahesh");
		set.add("naresh");
		set.add("ramesh");
		set.add("mahesh");
		
		//To remove in set
		set.remove("ramesh");
		
		System.out.println("st values are "+set);
		
		
	}
	
	static void map() {
		Map<Integer, String>map=new HashMap<>();
		map.put(1,"mahesh");
		map.put(2,"naresh");
		map.put(3, "ramesh");
		map.put(4, "naresh");
		
		//To delete values
		map.remove(3);
		
		//To update map
		map.replace(1, "maheshraju");
		
		System.out.println("map values are "+map);
		
		
	}
	
	
	

}
