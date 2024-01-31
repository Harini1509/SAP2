package main.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Question3 {
	WebDriver driver;
//	public void Go() throws InterruptedException {
//	       driver = new ChromeDriver();
//			
//			driver.get("https://mockexam2cpsat.agiletestingalliance.org/");
//			Thread.sleep(2000);
//			
//		}
	

	
	
	public Question3(WebDriver driver) {
		
		this.driver=driver;
		
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//*[@id=\"menu-main-1\"]/li[2]/a")
    WebElement about;
	@FindBy(xpath="(//h2[@class='elementor-heading-title elementor-size-default'])[1]")
    WebElement scroll;
	@FindBy(css="input[placeholder='Search']")
    WebElement search;
	@FindBy(xpath="//*[starts-with(@class,'ninja_table_row')]")
	List<WebElement> table;
	
	
	public void List(String year) throws InterruptedException {
        
      
		
		driver.get("https://mockexam2cpsat.agiletestingalliance.org/");
		
		
		
		
		Thread.sleep(2000);
         about.click();
         Thread.sleep(2000);
        
         
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scroll);
        driver.manage().window().maximize();
    	Thread.sleep(2000); 
    	
    	
    	
    	search.sendKeys(year);
    	Thread.sleep(3000); 

   	    
   	    for(WebElement i:table) {
   		System.out.println(i.getText());
   	    }


    
    	
    	
    	
	}
	
}
