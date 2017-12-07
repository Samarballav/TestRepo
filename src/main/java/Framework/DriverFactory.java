package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver driver;

	public static WebDriver getDriver(String Broser) {
		switch (Broser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"../test1/Resource/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"../test1/Resource/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver",
					"../test1/Resource/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		return driver;
	}
	
	public static void quit(){
		driver.quit();
		
	}

}
