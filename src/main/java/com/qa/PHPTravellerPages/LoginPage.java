package com.qa.PHPTravellerPages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.phptravellerBaseTest.BaseTest;

public class LoginPage extends BaseTest {

	//Page factory or Object repository
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement submit;
	
	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
		}
	//Actions on different features
	public String validateTitle(){
		return driver.getTitle();		
	}
	public void login(String un, String pass){
		emailid.sendKeys(un);
		password.sendKeys(pass);
		submit.click();
		
		
		
	}
	}
