
	package com.inetbanking.pageObjects;

	import org.openqa.selenium.WebDriver; 
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {

		WebDriver ldriver;
		
		
		//This Method is used to intialize the findby methods of this page as FindBy annothation is the part of PageFactory 
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
			
		}
		
		
		//Identify the WebElements 
		@FindBy(name="uid")
		WebElement txtUserName;
		
		@FindBy(name="password")
		WebElement txtPassword;
		
		@FindBy(name="btnLogin")
		WebElement btnLogin;
		
		//Actions
		
		public void setUserName(String Uname)
		{
			txtUserName.sendKeys(Uname);
		}
		
		
		public void setPassword(String password)
		{
			txtPassword.sendKeys(password);
		}
		
		public void clickButton()
		{
			btnLogin.click();
		}
		
		
	}


