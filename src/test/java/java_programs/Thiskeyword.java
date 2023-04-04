package java_programs;

public class Thiskeyword {

	int x=22;
	int y=33;
	
	public void man() {
		int x=200;
		int y=300;
		System.out.println(x+y);
		
		System.out.println(this.x+this.y);
		
		this.women();
	}
	
	public void women() {
		int x=222;
		int y=333;
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		Thiskeyword obj=new Thiskeyword();
		obj.man();
		
	}

}
