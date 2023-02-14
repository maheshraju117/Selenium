package java_programs;

public class duplicate_element_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"mahesh","naresh","suresh","naresh"};
		boolean flag=false;
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==name[j]) {
					System.out.println("The duplicate value is "+name[i]);
					flag=true;
				}	
			}
		}
	}
}
