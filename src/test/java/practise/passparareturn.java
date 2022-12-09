package practise;

public class passparareturn {
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		passparareturn obj = new passparareturn();
		int x =  obj.add(10, 11);
		int z=x+21;
		System.out.println(z);
		
	}
	
	
	
	
}
