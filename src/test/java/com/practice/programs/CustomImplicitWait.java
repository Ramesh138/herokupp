package com.practice.programs;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
public class CustomImplicitWait {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// set chrome driver exe path
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.cricbuzz.com/cricket-commentary/27403/krk-vs-qtg-30th-match-pakistan-super-league-2020");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// create object for FluentWait class
		FluentWait fw = new FluentWait(driver);
		// max time limit is 30 seconds
		fw.withTimeout(60, TimeUnit.SECONDS);
		// polls once in every 5 seconds
		fw.pollingEvery(5, TimeUnit.SECONDS);
		// ignore the Exception
		fw.ignoring(NoSuchElementException.class);

		// custom message to show if exception occurs
		fw.withMessage("THIS IS EXCEPTION MESSAGE");

		// create a the function which finds the element and returns
		WebElement feelingLuckyButton = (WebElement) fw.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				System.out.println("Polling for feeling Lucky Button");
				// return the button as webelement
				return driver.findElement(By.xpath(""));
			}
		});
		System.out.println("clicking feeling lucky button");
		// click feeling lucky button
		feelingLuckyButton.click();
	}
}