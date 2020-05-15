package com.herokaupp.flows;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.herokuapp.basedriver.BaseClass;
import com.herokuapp.pages.InfinitePage;
import com.herokuapp.pages.LoginPage;
import com.herokuapp.utility.Constant;
import com.herokuapp.utility.Utils;

public class InfiniteScroll extends BaseClass {

	

	LoginPage login = new LoginPage(driver);
	InfinitePage infinite = new InfinitePage(driver);

	public void clickInfiniteFlow() throws Throwable {
		driver.navigate().to(Constant.URL);
		Utils.scrollDown(driver);
		Thread.sleep(1000);
		login.clickOnInfiniteFlowpage();
		//Utils.verifyMessage(infinite.getErrorMsglabel().trim(), "Infinite Scroll");
	}

	public void scrollDownTwice() throws Throwable {
		Thread.sleep(1000);
		Utils.scrollDown(driver);
		Utils.scrollDown(driver);
		Reporter.log("Scroll down successfully twice");
	}

	public void scrollUpTwice() throws Throwable {
		Utils.scrollUp(driver);
		Utils.scrollUp(driver);
		Reporter.log("Scroll up successfully twice");
	}
	
	public void verifymessage() throws Throwable {
		Utils.verifyMessage(infinite.getErrorMsglabel().trim(), "Infinite Scroll");
	}

}
