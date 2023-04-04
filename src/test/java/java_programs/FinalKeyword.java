package java_programs;

public  class FinalKeyword {
	
	final int x=20;
	

	public static void main(String[] args) {
		
		FinalKeyword obj=new FinalKeyword();
		System.out.println(obj.x);
		//obj.x=30;
		System.out.println(obj.x);
		obj.man();
		
	}
public final  void man() {
	int x=10;
	System.out.println(x);
}
	
}
