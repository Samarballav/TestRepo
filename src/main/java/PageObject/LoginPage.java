package PageObject;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public void doLogin(String userId, String Pass)
	{
		EnterText(ObjectRepo.Login.email, userId);
		driver.findElement(ObjectRepo.Login.email).sendKeys(userId);
		driver.findElement(ObjectRepo.Login.Pass).sendKeys(Pass);
	}

}
