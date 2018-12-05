package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	
	public static void main(String[] args) {
		readPropertiesFile();
	}

	public static void readPropertiesFile() {
		//Create Properties Object to make available to project
		//Create InputStream Object to read config data
		Properties prop = new Properties();
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
}
