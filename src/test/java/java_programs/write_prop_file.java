package java_programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class write_prop_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fis = new FileOutputStream("src\\\\test\\\\resources\\\\file.properties");
		Properties prop = new Properties();
		prop.setProperty("village", "matlapalem");
		prop.store(fis, "commit");
		
		
		
	}

}
