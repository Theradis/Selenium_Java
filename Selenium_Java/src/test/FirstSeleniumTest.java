//Author: Steven Turner
//Date: 12/5/2018
// The FirstSeleniumTest.java will make use Selenium to open Firefox browser for functional testing.

package test;

//import
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Code for GeckoDriver used for Firefox:  Let application know its using geckodriver and where its located
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\GIT REPOSITORY\\Selenium_Java\\Selenium_Java\\doc\\geckoDriver\\geckodriver.exe");
		//Code to specify the browser to be used and where the browser is located.
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumhq.org/");
		
		driver.quit();
		
	}

}
