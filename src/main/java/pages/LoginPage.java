package pages;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{

	public void doNavigate()
	{
		open();
		System.out.println("opening URL");
		
	}
	public void doEnterUserEmail(String username)
	{
		$("//input[@id='login-username']").type(username);
		
	}
	public void doClickNextBtn()
	{
		$("//input[@id='login-signin']").click();
	}
	public void doEnterPassword(String pass)
	{
		$("//input[@id='login-passwd']").type(pass);
		
		
	}
	public void doClickOnLogInBtn()
	{
		$("//button[@id='login-signin']").click();
	}
}
