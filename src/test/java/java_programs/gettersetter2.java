package java_programs;

public class gettersetter2 {

	public static void main(String[] args) {
		gettersetter1 obj=new gettersetter1();
		int x =obj.setHeight(10);
		int y = obj.setWidth(20);
		int z = obj.setLength(30);
		
		obj.setget(x, y, z);
	}

}
