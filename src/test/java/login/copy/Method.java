package login.copy;

public class Method {
	
	public void add() {
		int a = 10;
		int b=20;
		System.out.println(a+b);
	}

	public static void mul() {
		int x=30;
		int y=40;
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Method obj=new Method();
		obj.add();
		obj.mul();
		
	}
}
