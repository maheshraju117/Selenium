package java_programs;

public class Abstract2 extends Abstract {

	@Override
	public void naresh() {
		System.out.println("this is naresh from un implemented method from abstract");
		
	}

	public void suresh() {
		System.out.println("this is suresh from abstract2");
	}
		
	public static void main(String[] args) {
		Abstract2 obj=new Abstract2();
		obj.mahesh();
		obj.naresh();
		obj.suresh();
		
		
	}	
	
	

}
