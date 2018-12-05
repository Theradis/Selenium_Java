package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	//Global Class Variable
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
	
	}

	//How to Get Data from Properties File
	public static void readPropertiesFile() {
		//Create Properties Object to make available to project
		//Create InputStream Object to read config data
		
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\Administrator\\GIT REPOSITORY\\Selenium_Java\\Selenium_Java\\src\\config\\config.properties");
			prop.load(input);
		//Test to show that data is being read...
			System.out.println(prop.getProperty("browser"));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//How to Set Data to Properties File
	public static void writePropertiesFile() {
		
		try {
			
			OutputStream output = new FileOutputStream("C:\\\\Users\\\\Administrator\\\\GIT REPOSITORY\\\\Selenium_Java\\\\Selenium_Java\\\\src\\\\config\\\\config.properties");
			prop.setProperty("browser","Chrome");
			prop.store(output, "changed browser");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
