package sikuliodemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Authentication {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","../test1/Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		driver.get("https://www.engprod-charter.net/");
		driver.manage().window().maximize();
		
		
		Screen screen=new Screen();
		
		Pattern user_name= new Pattern("C:\\Users\\SAMAR_PC\\Pictures\\username.png");
		Pattern password= new Pattern("C:\\Users\\SAMAR_PC\\Pictures\\pass.png");
		Pattern ok= new Pattern("C:\\Users\\SAMAR_PC\\Pictures\\logbutton.png");
		
		
		screen.wait(user_name,10);
		screen.type(user_name,"SAMAJAJAM");
		
		screen.wait(password,10);
		screen.type(password,"SAJKJLKJLJLKJ");
		
		screen.wait(ok,10);
	    screen.click(ok);
		
		
		
		
		
		
	}

}
