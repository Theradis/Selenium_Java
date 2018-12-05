//Author: Steven Turner
//Date: 12/5/2018
// The FirstSeleniumTest.java will make use Selenium to open Firefox browser for functional testing.

package test;

//import
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	//Public Global Variables
	static String browser;
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		runTest();
		
		
	}
	
	public static void setBrowser() {
		browser ="Firefox";
	}
	
	public static void setBrowserConfig() {
		//[SET BROWSER]
		String projectLocation = System.getProperty("user.dir");

		//[SET BROWSER CONFIGURATION]
		
		if(browser.contains("Firefox")){
		//Code for GeckoDriver used for Firefox:  Let application know its using geckodriver and where its located
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\doc\\geckoDriver\\geckodriver.exe");
		//Code to specify the browser to be used and where the browser is located.
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		driver = new FirefoxDriver();
		}
		
		if(browser.contains("Chrome")) {
		//Configuration for Chrome
		//WebDriver driver = new MarionettDriver();
		
		System.setProperty("webdriver.chrome.driver", projectLocation+"lib\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
				
	}
	
	public static void runTest() {
		//[RUN TEST]
		driver.get("http://seleniumhq.org/");

		driver.quit();
	}

}//END OF CLASS
