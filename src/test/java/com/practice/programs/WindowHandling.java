package com.practice.programs;


import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", ".//driver//geckodriver.exe");
	
		
		WebDriver driver = new FirefoxDriver();

		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
		driver.manage().window().maximize();

	
		driver.get("http://crystalcruises.com");
		 
	
		driver.findElement(By.linkText("GUEST CHECK-IN")).click();

		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("The number of windows are :"+windows.size());
		
	
		for (String win : windows) {
			System.out.println("The window handle is: " + win);
			driver.switchTo().window(win);
		}
		

		driver.findElement(By.linkText("lnkLogin")).click();
		System.out.println(driver.findElement(By.id("lbErrMsg")).getText());
		
		
		driver.findElement(By.linkText("click here")).click();
	
		windows = driver.getWindowHandles();
		System.out.println("The number of windows are :"+windows.size());
		
	
		for (String win : windows) {
			System.out.println("The window handle is: " + win);
			driver.switchTo().window(win);
		}
	
		driver.getTitle();
		
	
		driver.quit();
		

	}

}
