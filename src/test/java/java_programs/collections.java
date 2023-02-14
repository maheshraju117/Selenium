package java_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.collections4.iterators.ListIteratorWrapper;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list = new ArrayList<>();
		// to add elements in list		
		list.add("mahesh");
		list.add("ramesh");
		list.add("suresh");
		list.add("satish");
		// to remove elements is list
		list.remove(1);
		//to modify data
		list.set(1, "rrraaammm");
		// approach -1- to print all elements in list
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(" ");
		// approach -2- to print all elements in iterator
		Iterator<String>it =  list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
