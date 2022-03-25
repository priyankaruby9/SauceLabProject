package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SauceLabsLoginPage;

public class SauceLoginTest extends SauceLabsBaseClass {
	
	@Test
	public void LoginFailureTest () {
		
		SauceLabsLoginPage login = new SauceLabsLoginPage();
		
		login.LoginFunction("Xyz@abc.com", "Abc@12345" );
					
		WebElement ErrorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActualMsg = ErrorMsg.getText();//used to store the txt on screen
		String ExpMsg = "Epic sadface: Username and password do not match any user in this service";
		
		Assert.assertEquals(ActualMsg, ExpMsg);		
	}
	
	@Test
	public void LoginSuccessTest() throws InterruptedException {
		
		SauceLabsLoginPage login = new SauceLabsLoginPage();
		Thread.sleep(3000);
		login.LoginFunction("standard_user", "secret_sauce");
		//System.out.println("inside successfull");					
	}

}
