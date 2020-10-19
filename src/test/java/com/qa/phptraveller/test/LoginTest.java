package com.qa.phptraveller.test;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.phptravellerBaseTest.BaseTest;

public class LoginTest extends BaseTest {
	
	public LoginTest() throws FileNotFoundException {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		
	}
  @Test
  public void validateTitleTest() {
  }

}