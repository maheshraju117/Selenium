package practise;

public class constructor {
	//constructor is also a method overloading
	public constructor() {
		System.out.println("it is a default constructor");
	}
	
	public  constructor(int a) {
		System.out.println("it is a perameterized constructor"+a);
	}
	public constructor(String name ) {
		System.out.println("it is a perameterized constructor"+ name);
		
	}

	public static void main(String[] args) {
	
		constructor obj=new constructor(10);

	}

}
