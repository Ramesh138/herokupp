package com.practice.programs;

import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitTest {

	private WebDriver driver;
	private String baseUrl;
	private WebElement element;
	
	   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	   

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		baseUrl = "http://www.google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
		driver.get(baseUrl);
		System.out.println(formatter.format(date));  
		try {
			element = driver.findElement(By.id("lst-ib"));
		} catch (Exception e) {
			System.out.println(formatter.format(date)); 
			e.printStackTrace();
		}
		  
		element.sendKeys("Selenium WebDriver Interview questions");
		element.sendKeys(Keys.RETURN);
		List<WebElement> list = driver.findElements(By.className("_Rm"));
		System.out.println(list.size());

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}
