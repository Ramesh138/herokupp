package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.herokuapp.basedriver.BaseClass;
import com.herokuapp.utility.Utils;

public class LoginPage extends BaseClass {

	@FindBy(id = "username")
	WebElement tx_username;

	@FindBy(id = "password")
	WebElement tx_password;

	@FindBy(xpath = ".//*[@type='submit']")
	WebElement btn_login;

	@FindBy(xpath = ".//*[@id='flash-messages']")
	WebElement lbl_loginErrorMsg;

	@FindBy(linkText = "Logout")
	WebElement lnk_logout;

	@FindBy(xpath = ".//*[@href='/login']")
	WebElement lnk_authenticationPage;

	@FindBy(xpath = ".//*[@href='/infinite_scroll']")
	WebElement lnk_infiniteflow;
	
	@FindBy(xpath = ".//*[@href='/key_presses']")
	WebElement lnk_keypresses;
	
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillUsername(String value) throws Throwable {
		Thread.sleep(500);
		tx_username.clear();
		tx_username.sendKeys(value);
		Reporter.log(" Username field  entered in the username text box as :" + value);
	}

	public void fillPassword(String value) throws Throwable {
		Thread.sleep(500);
		tx_password.clear();
		tx_password.sendKeys(value);
		Reporter.log(" Password field  entered in the username text box as :" + value);
	}

	public void clickOnLogin() throws Throwable {
		Thread.sleep(500);
		btn_login.click();
		Reporter.log("click on the Login Button ");
	}

	public void clickOnLogout() throws Throwable {
		Thread.sleep(500);
		lnk_logout.click();
		Reporter.log("click on the Logout Button");
	}

	public void clickOnAuthenticationpage() throws Throwable {

		Thread.sleep(500);
		lnk_authenticationPage.click();
		Reporter.log(" click on the  form Authentication page");
	}

	public void clickOnInfiniteFlowpage() throws Throwable {
		Thread.sleep(500);
		lnk_infiniteflow.click();
		Reporter.log(" click on the  form Infinite flow page");
	}
	
	public void clickOnKeypresspage() throws Throwable {
		Thread.sleep(500);
		lnk_keypresses.click();
		Reporter.log(" click on the  form Key press page");
	}

	public String getErrorMsglabel() throws Throwable {
		Thread.sleep(500);
		return this.lbl_loginErrorMsg.getText();
	}
}
