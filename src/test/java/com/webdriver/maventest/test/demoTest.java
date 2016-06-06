package com.webdriver.maventest.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class demoTest {
  @Test
  public void f() {
	  
	  System.out.println(" Test Method Running");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test Method Running");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After Test Method Running");
  }

}
