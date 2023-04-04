package java_programs;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List list=new ArrayList<>();
	list.add(123);
	list.add("mahesh");	
	list.add(true);
	
	// methos 1
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	
	//method 2
	
	for(Object obj:list) {
		System.out.println(obj);
	}
	
	//method 3
	
	java.util.Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
		
	}

}
