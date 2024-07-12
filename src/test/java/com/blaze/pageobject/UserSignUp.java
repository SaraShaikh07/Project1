package com.blaze.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserSignUp {
	
	WebDriver ldriver;
	
 public UserSignUp(WebDriver rdriver)
 
 {
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	  
 }
 @FindBy(how = How.ID, using="signin2")
	 WebElement signUpbutton;
     
  public void clickOnSignUpbutton()
  {
	  signUpbutton.click();  
	  
  }
	
	

}
