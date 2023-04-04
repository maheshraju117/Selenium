package java_programs;

import java.util.Arrays;

public class anagaram_string {

public static void main(String[] args) {	
	

String name="mahe";
String name1="ahem";

char na[] = name.toLowerCase().toCharArray();
char na1[] = name1.toLowerCase().toCharArray();

Arrays.sort(na);
Arrays.sort(na1);

if(Arrays.equals(na, na1)) {
	System.out.println(" given string is anagram");
}else {
	System.out.println(" given name is not anagarm");
}

	}
}


