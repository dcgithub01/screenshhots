package testcases;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LogInTest2 {
	
	
	@Managed
	WebDriver driver;
	
	@Steps
	LoginSteps loginSteps; 
	
	
	
	@Title("Performing Login Test")
	@Test
	public void loginTest()
	{
		loginSteps.doLogin("deepak_gju@yahoo.com");
		loginSteps.doEnterPasswordAndLogin("Rajat@9012");
	}

}
