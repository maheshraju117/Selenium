package practise;

public class childclass extends baseclass{

	public void add(int a, int b) {
	System.out.println("this is multiplication of child class"+(a*b));
	}

	public  static void main(String[] args) {	
	baseclass obj = new childclass();
	obj.add(10, 20);
	
}
}