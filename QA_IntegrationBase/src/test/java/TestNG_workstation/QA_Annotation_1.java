package TestNG_workstation;


import org.testng.annotations.*;

public class QA_Annotation_1 {
	
	
	
  @Test
  public void Message1() {
	  
	  System.out.println("This is the Test Mehtod");
  }
  
  @BeforeTest
  public void Message2() {
	  
	  System.out.println("This is the BeforeTest Mehtod");
  }
  
  @AfterTest
  public void Message3() {
	  
	  System.out.println("This is the AfterTest Mehtod");
  }
  
  @BeforeMethod
  public void Message4() {
	  
	  System.out.println("This is the Before Mehtod");
  }
  
  @AfterMethod
  public void Message5() {
	  
	  System.out.println("This is the AfterMethod Mehtod");
  }
  

}
