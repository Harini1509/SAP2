package main.java;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dev.failsafe.internal.util.Assert;

public class ExcelReading extends SheetsQuickstart {
//	ExcelReading b=new ExcelReading();
	public int i=0;
	WebDriver driver;
	
	
	@AfterTest
	
	   public void writesheet(String str,String a) throws IOException {
		FileWriter writer = new FileWriter("G:\\Documents\\a.txt", true);
		
        writer.write("\n"+str+" "+a+"\n");
       
        writer.close();
		
	}
	
	
	
	
	
	
	
	
	@BeforeTest                                             // annotated method placed in the beginning.  
	  public void before_test() throws InterruptedException  
	  {  
		driver=new ChromeDriver();
    	driver.get("https://mockexam2cpsat.agiletestingalliance.org/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"menu-main-1\"]/li[2]/a")).click();
    	
    	Thread.sleep(2000);
    	
    	
    	
	  }  
	
	@Test(dataProvider="empLogin")
	public void VerifyInvalidLogin(Object x) throws IOException {
		
		//System.out.println(x);
		boolean a= false;
		String str=x.toString();
		
		 str = str.substring(1, str.length() - 1);
		 
		 str = str.replaceAll(",", "");
		 System.out.println(str);
		
	   // Arrays.asList(x);
		
     
       
        
      
//       System.out.println(k[0]);
        
	   
		//x.toString();
		List<WebElement> table=driver.findElements(By.xpath("//*[starts-with(@class,'ninja_table_row')]"));
	//	System.out.println(x);
		
    	
      
        //System.out.println(s);
        for(int j=0;j<table.size();j++) {
        	  String s=table.get(j).getText();
        	  if(str.equals(s)) {
              	a= true;
              	
              	break;
              }
        	  
              
        }
        if(a==true) {
        	System.out.println("Passed");
        	 
        	writesheet(str,"Passed");
        	
        }
        else {
        	System.out.println("Failed");
        	
        	writesheet(str,"Failed");
        	AssertJUnit.assertTrue(a); 
        	
        }
          
        
        
                	
    		
    		
    
		
		
		
	}
	
	@DataProvider(name="empLogin")
	public Object[] loginData() throws IOException, GeneralSecurityException {
		List<List<Object>> a=SheetsQuickstart.readdata("1pcisMu_Pdzjllfd0eBmHRew6G3PJWSfKPMEXzgS8V7k", "Class Data!A2:E");
		
		
		
		//System.out.println(a.size());
		//System.out.println(a.get(0));
		Object[] x=a.toArray();
		//=new Object[5];
		
//		for(int i=0;i<a.size();i++) {
//			//Object[] x=a.get(i);
//			x[i]=a.get(i);
//		}
		//System.out.println(x[0]);
		return x;
		
		
	}
	
	
	
	
	
	
	
	
	

}
