package login;

import java.util.Iterator;

public class Stringex {
	public static void main(String[] args) {

		String company[] = {"nagendra", "mahesh", "naresh", "suresh", "ramesh", "satish" };
		
		for (int i = 0; i < company.length; i++) {
			if (company[i].startsWith("n")) {
				System.out.println(company[i]);
			} else if (company[i].contains("sh")) {
				System.out.println(company[i]);
			}

		}

	}
}