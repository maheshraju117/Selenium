package practise;

public class thiskeyword {
	/*by using this keyword we call multiple constructors at a time 
	 by passing perameters references with different constructors
	 */
	public thiskeyword() {
		this(10);
		System.out.println("this is adefault constructor");
	}
	public thiskeyword(int a) {
		this("maheshraju");
		System.out.println("this is perameterized integer constructor");
	}
	public thiskeyword(String name) {
		System.out.println("this is perameter string constructor");
	}
	public void display() {
		System.out.println("this is a method ");
	}
	public static void main(String[] args) {
		
		thiskeyword obj = new thiskeyword();
		obj.display();
		
		
	}
}
