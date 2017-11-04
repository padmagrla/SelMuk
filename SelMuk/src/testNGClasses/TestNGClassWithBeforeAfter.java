package testNGClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGClassWithBeforeAfter {
  @Test
  public void testOne() {
	  System.out.println("1testOne");
  }
  @Test
  public void testTwo() {
	  System.out.println("1testTwo");
  }
 /* @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("1After Method");
  }*/

 @BeforeClass
  public void beforeClass() {
	  System.out.println("1Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("1After class");
  } 

}
