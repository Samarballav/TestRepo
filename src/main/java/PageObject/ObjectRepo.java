package PageObject;

import org.openqa.selenium.By;

public class ObjectRepo {
	
	public static class Login
	{
		public static By email=By.id("email");
		public static By Pass=By.id("pass");
	}
    public static class CreateAccount
    {
        public static By firstname=By.id("u_0_g");
        public static By lastname=By.id("u_0_i");
        public static By mobilenumber=By.id("u_0_l");
        public static By newpassword=By.id("u_0_s");
        
     }
}
