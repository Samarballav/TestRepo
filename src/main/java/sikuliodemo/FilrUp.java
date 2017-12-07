package sikuliodemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FilrUp {

	public static void main(String[] args) throws Exception  {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMAR_PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//*[@id='photo']")).click();
		Thread.sleep(2000);
	
		Screen screen =new Screen();
		
		Pattern image1=new Pattern("C:\\Screenshot\\fileup.png");
		Pattern image2=new Pattern("C:\\Screenshot\\openbutton.png");
		screen.wait(image1,10);
		screen.type(image1,"C:\\Screenshot\\openbutton.png");
		screen.wait(image2,10);
		screen.click(image2);
	}
	}


