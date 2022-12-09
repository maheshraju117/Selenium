package practise;

public class loop {
	public void whileloop() {
		int i=2;
		while (i<10)
		{
		System.out.println("your current number for while loop is "+i);
		i++;
		}
		}
	public void forloop() {
		for (int i = 0; i < 10; i++) {
			System.out.println("your current number for forloop is "+i);
		}

	}
	public static void main(String[] args) {
		loop obj = new loop();
		obj.forloop();
		obj.whileloop();
		
		
	}

}
