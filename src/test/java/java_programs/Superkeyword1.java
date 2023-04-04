package java_programs;

public class Superkeyword1 extends Sperkeyword {
	
	String name="ramya";
	int age=23;
	boolean mindset=true;
	
 
	public void man() {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(mindset);
		
		System.out.println("this is from superkeyword1 man");
		
		System.out.println(super.name);
		super.man();
		
	}

	public static void main(String[] args) {
		
		Superkeyword1 obj = new Superkeyword1();
		obj.man();

	}

}
