package java_programs;

public class Thiskeyword1 {
	
	int x=11;
	int y=22;;
	
	public Thiskeyword1() {
		System.out.println("this is default constructor");
	}
	
	public Thiskeyword1(int x,int y) {
		System.out.println(x+y);
		
		System.out.println(this.x+this.y);
		
		this.x=x;
		this.y=y;
		System.out.println(this.x+this.y);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword1 obj = new Thiskeyword1();
		Thiskeyword1 obj1 = new Thiskeyword1(10,20);
		

	}

}
