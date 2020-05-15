package com.practice.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAMES {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://m.cricbuzz.com/cricket-commentary/27403/krk-vs-qtg-30th-match-pakistan-super-league-2020");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://chercher.tech/practice/frames");
	driver.switchTo().frame("frame1");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ramesh Trying");
}

}
