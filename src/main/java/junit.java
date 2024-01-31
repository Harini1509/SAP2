package main.java;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;





@RunWith(Parameterized.class)
public class junit {
	WebDriver driver;
	public String inputNumber;
	   public Boolean expectedResult;
	   public Question3 obj1;
	   
	  

	   @Before
	   public void initialize() {
		   driver = new ChromeDriver();
	       obj1=new Question3(driver);
	   }

	   
	 
//	   public junit(WebDriver driver) {
//		  
//			 
//			 this.driver=driver;
//			
//				
//		   
//		  
//			
//	      
//	   }

	//String year;
	public junit(String inputNumber) {
		  	      this.inputNumber = inputNumber;
	     
	      
	   }
	
	@Parameterized.Parameters
	public static Object[] primeNumbers() {
	      return  new Object[] {"199","200","198"};
	         
	      
	   }

	

	  
	
	@Test
	public void Tablelist() throws InterruptedException {

			System.out.println(inputNumber);
//		
   	         obj1.List(inputNumber);
   
	

			
			
		
			
		
		
		
		
	}
	

}
