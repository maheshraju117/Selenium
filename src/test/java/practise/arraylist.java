package practise;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
	
public static void main(String[] args) {
	//in this arraylist we can store different values
	//we can store duplicate values alse
	ArrayList a= new ArrayList();
	a.add(100);
	a.add("mahesh");
	a.add("mahesh");
	a.add('c');
	a.add(10.201);
	System.out.println(a.get(2));
	
	// the another method to use all features in alist is
	//in this type we can only store string type of data in ana array
	List<String> obj1=new ArrayList<String>();
	obj1.add("mahesh");
	obj1.add("naresh");
	System.out.println(obj1.get(1));
	
	
	
	
	
	
	
	
	
}

}
