package practise;

public final class finalclass1 
// once you create a final class we can't inherit the class
{

	public void add() {
		int a=10;
		a=20;
		final int b=20;
		// once you declare final we chan't change the value of a variable
		System.out.println(a+b);
		System.out.println(b);
	}
	public final void sub()
	//once you create a final method we can't override in a n another class
	{
		System.out.println("this is from finalclass 1 ");
	}
	public static void main(String[] args) {
		finalclass1 obj = new finalclass1();
		obj.add();
	}
	
}
