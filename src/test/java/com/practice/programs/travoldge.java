package com.practice.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class travoldge {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.travelodge.co.uk/");
			driver.findElement(By.id("triggerLoginPopOver")).click();
			Thread.sleep(5000);
			driver.manage().window().setSize(new Dimension(1552, 840));
		    {
		      WebElement element = driver.findElement(By.id("triggerLoginPopOver"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).clickAndHold().perform();
		    }
		   
		   // driver.findElement(By.cssSelector(".quick-search-links")).click();
		    driver.findElement(By.id("triggerLoginPopOver")).click();
		    
			/*
			 * { WebElement element =
			 * driver.findElement(By.cssSelector(".c-login-form:nth-child(4) .u-text-white")
			 * ); Actions builder = new Actions(driver);
			 * builder.moveToElement(element).perform(); }
			 */
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@class='c-login-form__button c-btn-primary btnSubmit js-login-popover-submit']/following::button[1]/span[@class='u-text-white js-login-popover-submit-text']")).click();
		   
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} finally {
			// TODO: handle finally clause
			
		//	driver.quit();
		}
	}

	public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);

	}

	public static void clickOn(WebDriver driver1, WebElement element, int timeout) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
