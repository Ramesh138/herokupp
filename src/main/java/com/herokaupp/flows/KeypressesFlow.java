package com.herokaupp.flows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.herokuapp.basedriver.BaseClass;
import com.herokuapp.pages.InfinitePage;
import com.herokuapp.pages.LoginPage;
import com.herokuapp.utility.Constant;
import com.herokuapp.utility.Utils;

public class KeypressesFlow extends BaseClass {

	LoginPage login = new LoginPage(driver);
	InfinitePage infinite = new InfinitePage(driver);

	public void clickKeypress() throws Throwable {
		driver.navigate().to(Constant.URL);
		Utils.scrollDown(driver);
		Thread.sleep(1000);
		login.clickOnKeypresspage();
		Utils.verifyMessage(infinite.getErrorMsglabel().trim(), "Key Presses");
		System.out.println("Click on the key  press menu and verify the key presses page.");
	}

	public void tabKeyOperation() throws Throwable {
		Actions action= new Actions(driver); 
		action.contextClick(driver.findElement(By.id("target")))
			.sendKeys(Keys.TAB)
			.build()
			.perform();
		Utils.verifyMessage(infinite.getErrorMsglabel().trim(), "You entered: TAB");
	}
	
	
	public void enterKeyOperation() throws Throwable {
		Actions action= new Actions(driver); 
		action.contextClick(driver.findElement(By.id("target")))
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
		Utils.verifyMessage(infinite.getErrorMsglabel().trim(), "You entered: ENTER");
	}
	
	public void escapeKeyOperation() throws Throwable {
		Actions action= new Actions(driver); 
		action.contextClick(driver.findElement(By.id("target")))
			.sendKeys(Keys.ESCAPE)
			.build()
			.perform();
		Utils.verifyMessage(infinite.getErrorMsglabel().trim(), "You entered: ESCAPE");
	}
	
	public void backspaceKeyOperation() throws Throwable {
		Actions action= new Actions(driver); 
		action.contextClick(driver.findElement(By.id("target")))
			.sendKeys(Keys.BACK_SPACE)
			.build()
			.perform();
		Utils.verifyMessage(infinite.getErrorMsglabel().trim(), "You entered: BACK_SPACE");
	}


}
