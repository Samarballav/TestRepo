package Framework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject.BasePage;
import PageObject.CreateAccount;
import PageObject.LoginPage;
import PageObject.Testlistener;

 public class test {
	
	 @Test
	public void testHello() {
		String url = "https://www.facebook.com/";
		WebDriver dr = DriverFactory.getDriver("chrome");
		dr.get(url);
		LoginPage lp = new LoginPage(dr);
		lp.doLogin("Pjsajkdh", "sdsdsad");
		CreateAccount ca= new CreateAccount(dr);
		ca.AccountText("samar","das","2365689","bhbjjdk");
		Assert.assertTrue(false);
	}
 
	
	@Test
   public void secondtest(){
	   
	  String url="https:rediff.com";
	  WebDriver dr=DriverFactory.getDriver("chrome");
	  dr.get(url);
	  
	  
   }
  
  
}
