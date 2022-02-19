package steps;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage;
	
	@Step("performing login")
	
	public void doLogin(String username)
	{
		loginPage.doNavigate();
		loginPage.doEnterUserEmail(username);
		loginPage.doClickNextBtn();
		System.out.println("test");
		System.out.println("test1");
		
		
	}
	
	@Step("Entering password and logging in")
	
	public void doEnterPasswordAndLogin(String pass)
	{
		
		loginPage.doEnterPassword(pass);
		loginPage.doClickOnLogInBtn();
		
	}

}
