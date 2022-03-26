package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestCases.SauceLabsBaseClass;


public class SauceLabsLoginPage {
	
WebDriver driver = SauceLabsBaseClass.driver;
	
	/*********Web Elements**********/
		
	@FindBy(id = "user-name")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "login-button")
	WebElement LoginBtn;
	
	public SauceLabsLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	/************function**************/
	public void LoginFunction ( String UserNameVal, String PasswordVal) {
		UserName.sendKeys(UserNameVal);
		//test.log(LogStatus.PASS, "Click on username ", "username clicked successfully");
		Password.sendKeys(PasswordVal);
		//.log(LogStatus.PASS, "Click on password", "password clicked successfully");
		//Rememberme.click();
		//test.log(LogStatus.PASS, "Click on rememberme", "rememberme clicked successfully");
		LoginBtn.click();
		//test.log(LogStatus.PASS, "Click on loginbutton", "Loginbutton clicked successfully");
	}	
	

}
