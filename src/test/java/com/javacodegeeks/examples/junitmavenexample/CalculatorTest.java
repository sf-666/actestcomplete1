package com.javacodegeeks.examples.junitmavenexample;

import java.util.List;

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
	 //Create a new instance of Firefox Browse
	 
	 driver.get("http://localhost/testweb1/");
	// System.out.println("Test");
	 
     //Maximize the Browser window
     driver.manage().window().maximize();

     try {
    	    Thread.sleep(1000);                 //1000 milliseconds is one second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
     
     
     //Get the current page URL and store the value in variable 'str'
     String str = driver.getCurrentUrl();
   
     //Print the value of variable in the console
     System.out.println("The current URL is 1 " + str);
     
      /*
     List<WebElement> elements = driver.findElements(By.tagName("input"));
     for(WebElement e : elements) {
    	  System.out.println(e.getAttribute("spellcheck"));
    }
     */
     
     WebElement element = driver.findElement(By.cssSelector("h1[id='changeme']"));
     
     System.out.println( element.getText() );
     
     if (element.isDisplayed())
    	 System.out.println( "Input field found  and is visible" );
     else
    	 System.out.println("Input field is NOT visible");
     
     element.sendKeys("Put some Text into the Inputfield");
     
	 try {
		 driver.close();
		 Thread.sleep(1000);                 //1000 milliseconds
	 } catch(InterruptedException ex) {
		 Thread.currentThread().interrupt();
	 }
	 
	 driver.quit();
     
	 }
	 
	 @Test
	 public void check() {
		 
		 System.out.println("Test function call....ok");
		 
	 }
	 
}
