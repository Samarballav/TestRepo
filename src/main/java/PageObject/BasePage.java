package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	 WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void EnterText(By Locator, String text) {
		driver.findElement(Locator).clear();
		driver.findElement(Locator).sendKeys(text);
	}
}
