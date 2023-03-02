package java_programs;

public class dummy2 extends dummy{

   dummy2(int x){
	   super(111);
	   System.out.println("this is from subclass"+x);
   }
	
	

	public static void main(String[] args) {
		dummy2 obj=new dummy2(999);
		
	}
}
