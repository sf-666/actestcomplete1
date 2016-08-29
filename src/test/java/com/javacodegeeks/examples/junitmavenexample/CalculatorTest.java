package com.javacodegeeks.examples.junitmavenexample;

import org.apache.http.auth.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorTest {
	 private WebDriver driver;		
	 
	 @Test
	 public void test() {
		 
	 System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Firefox driver\\geckodriver.exe");
	
	  driver = new FirefoxDriver();
	 //Create a new instance of Firefox Browser
	  
     System.out.println("1");
	 
	 driver.get("https://www.google.com/");
	// System.out.println("2");
	 
     //Maximize the Browser window
     driver.manage().window().maximize();
   //  System.out.println("3");

     try {
    	    Thread.sleep(1000);                 //1000 milliseconds is one second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
     
     
     //Get the current page URL and store the value in variable 'str'
     String str = driver.getCurrentUrl();
     //System.out.println("4");
   
     //Print the value of variable in the console
     System.out.println("The current URL is " + str);
     
     WebElement element = driver.findElement(By.id("sb_ifc0"));
     
     element.sendKeys("This is a Text i wrote as a test");
     
     try {
    	 driver.close();
 	    Thread.sleep(3000);                 //1000 milliseconds is one second.
 	} catch(InterruptedException ex) {
 	    Thread.currentThread().interrupt();
 	}
     driver.quit();
     
	 }
	 
	 @Test
	 public void check() {
		 
		 System.out.println("Test function call...ok");
		 
	 }
	 
}
