package com.practice.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWait {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		//WebDriver driver;
		try {
			// Create FF instance
			System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			// Launch the url
			driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='start']/button")).click();
			// Webdriverwait
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement authError = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='finish']/h4")));
			System.out.println(authError.getText());
		} finally {
			driver.close();
		}

	}

}
