package com.practice.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // pageload timeout
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit Wait for 20 seconds
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();// click on sign in
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("gmail.com");
		driver.findElement(By.cssSelector(".RveJvd")).click();

	}
}
