package com.practice.programs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HandleHiddenElement {
   public static void main(String[] args) throws InterruptedException 
   {
      WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("file:///G:/Testing_Utilities/Selenium_Practice/radiobutton&amp;Hidden.html");
      List<WebElement> li=driver.findElements(By.id("male"));
      System.out.println(li.size());
      for(WebElement el:li)
      {
         Integer x=el.getLocation().getX();
         System.out.println("The Location Of x is : -"+x);
         //Integer y=river.findElement(By.id("male")).getLocation().getY();
         if(x==0)
         {
            System.out.println("Element Is Not Visible Or Hidden");
         }
         else
            el.click();
      }
      Thread.sleep(5000);
      driver.close();
   }
}
