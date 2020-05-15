package com.herokaupp.flows;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.herokuapp.basedriver.BaseClass;
import com.herokuapp.pages.LoginPage;
import com.herokuapp.utility.Utils;

public class LoginFlow extends BaseClass{


	public LoginFlow(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	LoginPage login = new LoginPage(driver);

	public void loginWithWrongUsername() throws Throwable {
		Reporter.log("Scenerio1 : Login with correct user name and wrong password");
		login.clickOnAuthenticationpage();
		Reporter.log("");
		login.fillUsername("TOMSMITH");
		login.fillPassword("SuperSecretPassword!");
		login.clickOnLogin();
		Reporter.log("messsages : "+login.getErrorMsglabel().replace("\n×", ""));
		Utils.verifyMessage(login.getErrorMsglabel().replace("\n×", ""), "Your username is invalid!");
	}

	public void loginWithWrongPassWord() throws Throwable {
		Reporter.log("Scenerio2 :Login with incorrect user name and wrong password");

		login.fillUsername("tomsmith");
		login.fillPassword("SuperSecretPassw");
		login.clickOnLogin();
		Utils.verifyMessage(login.getErrorMsglabel().replace("\n×", ""), "Your password is invalid!");
	}

	public void validLogin() throws Throwable {

		Reporter.log("Scenerio3 :Login with correct user name and correct password");

		login.fillUsername("tomsmith");
		login.fillPassword("SuperSecretPassword!");
		login.clickOnLogin();
		Utils.verifyMessage(login.getErrorMsglabel().replace("\n×", ""), "You logged into a secure area!");
	}

	public void validLogOut() throws Throwable {
		Reporter.log("Scenerio4 : Succesfull logout from the login page");
		login.clickOnLogout();
		Utils.verifyMessage(login.getErrorMsglabel().replace("\n×", ""), "You logged out of the secure area!");
	}

}
