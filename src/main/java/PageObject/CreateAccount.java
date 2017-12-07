package PageObject;

import org.openqa.selenium.WebDriver;

public class CreateAccount extends BasePage{
	 public CreateAccount( WebDriver driver){
		 super(driver);
	 }
     public void AccountText(String fn,String ln,String mn,String pw ){
    	
    	 driver.findElement(ObjectRepo.CreateAccount.firstname).sendKeys(fn);
    	 driver.findElement(ObjectRepo.CreateAccount.lastname).sendKeys(ln);
    	 driver.findElement(ObjectRepo.CreateAccount.mobilenumber).sendKeys(mn);
    	 driver.findElement(ObjectRepo.CreateAccount.newpassword).sendKeys(pw);
     }
}
