package com.herokuapp.testcases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.herokaupp.flows.InfiniteScroll;
import com.herokaupp.flows.KeypressesFlow;
import com.herokaupp.flows.LoginFlow;
import com.herokuapp.basedriver.BaseClass;
import com.herokuapp.utility.Constant;
import com.herokuapp.utility.Utils;

public class Testcase1 extends BaseClass {

	@BeforeTest
	public void setup() throws Exception {
		Utils.openBrowser(Constant.URL);
	}

	@Test
	public void TC1() throws Throwable {
		LoginFlow obj = new LoginFlow(driver);
		obj.loginWithWrongUsername();
		obj.loginWithWrongPassWord();
		obj.validLogin();
		obj.validLogOut();

	}

	@Test
	public void TC2() throws Throwable {

		InfiniteScroll ls = new InfiniteScroll();
		ls.clickInfiniteFlow();
		ls.verifymessage();
		ls.scrollDownTwice();
		ls.scrollUpTwice();
		ls.verifymessage();
	}

	@Test
	public void TC3() throws Throwable {

		KeypressesFlow kp = new KeypressesFlow();
		kp.clickKeypress();
		kp.tabKeyOperation();
		kp.escapeKeyOperation();
		kp.backspaceKeyOperation();
		kp.enterKeyOperation();
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
