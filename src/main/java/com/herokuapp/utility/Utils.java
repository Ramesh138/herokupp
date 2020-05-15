package com.herokuapp.utility;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.herokuapp.basedriver.BaseClass;

public class Utils extends BaseClass {
	

	public static void openBrowser(String url) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		Thread.sleep(10000);
		driver.switchTo().alert().sendKeys("z011615" + Keys.TAB + "Z011615");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		
	}

	public static void waitForElement(WebElement ele) {
		
		Wait<WebDriver> wait  = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public static void closeBrowser() {
		driver.close();
		driver.quit();
		
	}

	
	public static void scrollDown(WebDriver driver) throws Throwable {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public static void scrollUp(WebDriver driver) throws Throwable {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500,0)");
	}
	public static void verifyMessage(String actualValue, String expectedValue) {

		if (actualValue.equalsIgnoreCase(expectedValue)) {
			assertEquals(expectedValue, actualValue);
			Reporter.log(actualValue.trim() + " is succesfully verified  with " + expectedValue.trim());
		} else {
			Reporter.log(actualValue + " is not matched with " + expectedValue);
		}

	}

}
