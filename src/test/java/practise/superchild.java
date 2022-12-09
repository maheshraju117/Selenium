package practise;

public class superchild extends superbass{
	int x=111;
	public void mul() {
		super.add();
		// by using super keyword we can access variable from a parent class by using "super".
		System.out.println("this is from child class "+super.x);
	}
	public void add() {
		
		System.out.println("i'm from child class "+super.x);
	}
	public static void main(String[] args) {
	
	superchild obj = new superchild();
	obj.mul();
		
}
}