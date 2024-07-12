package com.blaze.testcase;

import org.testng.annotations.Test;

import com.blaze.pageobject.UserSignUp;

public class UserLogin extends BaseClass  {
	@Test
	public void UserLogin() {
		driver.get(url);
		UserSignUp abc = new UserSignUp(driver);
		abc.clickOnSignUpbutton();
	}
	
	
	
	

}
