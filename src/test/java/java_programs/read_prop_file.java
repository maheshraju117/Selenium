package java_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class read_prop_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src\\test\\resources\\file.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		
	}

}
