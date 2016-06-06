package com.webdriver.maventest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
	
	public WebDriver driver;  
	
  @Test(priority=0)
  public void calculateValue() throws Exception {
	  
	  System.out.println("This is Test Method1");
	  Thread.sleep(2000);
  }
  
  @Test(priority=1)
  public void assertValue() throws Exception {
	  
	  System.out.println("This is Test Method2");
	  Thread.sleep(2000);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
	  driver.get("https://purebenefits.offshoresoftwaresolutions.net/");
  }

@AfterTest
  public void afterTest() {
	
	System.out.println("This is After Test Method");
	driver.quit();
  }

}
