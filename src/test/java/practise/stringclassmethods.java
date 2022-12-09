package practise;

public class stringclassmethods {
  public static void main(String[] args) {
	    //starts-with
		String name = "mahesh raju rudraraju";
		boolean sw = name.startsWith("mah");
		System.out.println(sw);
		//ends-with
		String name2 = "mahesh raju rudraraju";
		boolean ew = name2.endsWith("raju");
		System.out.println(ew);
		//equals
		String name3 = "mahesh raju rudraraju";
		boolean eq = name3.equalsIgnoreCase("mahesh raju");
		System.out.println(eq);
		//contains
		String name4 = "mahesh raju rudraraju";
		boolean cnts = name4.contains("mahesh raju");
		System.out.println(cnts);
		//split
		String name5 = "mahesh raju rudraraju";
		String arr[] = name5.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//trim
		String name6 = "  mahesh raju rudraraju   ";
		String trm = name6.trim();
		System.out.println(trm);

  }
}
