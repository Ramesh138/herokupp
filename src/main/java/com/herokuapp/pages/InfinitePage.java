package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.basedriver.BaseClass;

public class InfinitePage extends BaseClass {

	@FindBy(xpath  = "//*[@id='content']/div/h3")
	WebElement lbl_infiniteScroll;
	
	public InfinitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getErrorMsglabel() throws Throwable {
		Thread.sleep(2000);
		return this.lbl_infiniteScroll.getText();
	}

}
