package practise;

public class localandglobalvariable 
{
	int x=10;//global or instance variable
	int z;
	public void add() {
		int a=20; //local variable
		int b=19; // local variable
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		localandglobalvariable obj = new localandglobalvariable();
		obj.add();
		localandglobalvariable a= new localandglobalvariable();
		
		System.out.println(a.x);
	}
}
