package com.herokuapp.basedriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver=null;	
	public static WebDriverWait wait=null;
	
	/*
	 * BaseClass(WebDriver driver){ BaseClass.driver=driver; }
	 */

	public void startApp(String url) {
	
			try {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.navigate().to(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}


}
