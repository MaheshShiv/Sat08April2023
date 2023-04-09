package com.PageLayer;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;



public class LoginPage extends BaseClass {
	
	// with Page Factory

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
// Constructor and initilize page
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
// Action associated method	
	public void enterUsername(String uname) {

		if(username.isDisplayed() && (username.isEnabled())){ 
			
			username.sendKeys(uname);
		} }
	
    public void enterPassword(String pass) {
		
		if(pwd.isDisplayed() && (pwd.isEnabled())){
			
			pwd.sendKeys(pass);
		} }
		
	
		public void clickOnElement() {
			
			if(loginBtn.isDisplayed() && (loginBtn.isEnabled())){
				
				loginBtn.click();	
		
	}

} }
