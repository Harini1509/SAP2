package main.java;

import java.util.ArrayList;
import static org.testng.Assert.assertTrue;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class question1 {
	
	public static void main(String[] args) throws InterruptedException  {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://mockexam2cpsat.agiletestingalliance.org/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		 Thread.sleep(2000);
		 List<WebElement> social= driver.findElements(By.xpath("//span[@class='elementor-grid-item']/a"));
		 for(WebElement i :social) {
		    System.out.println(i.getAttribute("href"));
		 }
		 for(WebElement i :social) {
			    i.click();
			    
			    
			 }
		 String parent=driver.getWindowHandle();

		 Set<String>s=driver.getWindowHandles();

		
		 Iterator<String> I1= s.iterator();

		 while(I1.hasNext())
		 {

		 String child_window=I1.next();


		 if(!parent.equals(child_window))
		 {
		 driver.switchTo().window(child_window);

		 System.out.println(driver.switchTo().window(child_window).getTitle());
		 driver.close();

		 
		 }
		 }
		 driver.switchTo().window(parent);
		 WebElement b=driver.findElement(By.xpath("//h2[@class='elementor-heading-title elementor-size-default']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", b);
		 js.executeScript("window.scrollBy(0,-350)");
		 List<WebElement> c=driver.findElements(By.xpath("//div[@class='elementor-countdown-item']"));
		 List<Integer> l=new ArrayList<Integer>();
		 for(WebElement k :c) {
			 String s1=k.getText();
			String a[]=s1. split("\\s+");
			 int v=Integer.parseInt(a[0]);  
			 
			 System.out.println(v);
			 System.out.println(v);
			 l.add(v);
			 
			    
			    
			 }
		 if(l.get(1)<24 || l.get(2)<60 || l.get(3)<60) {
			 Boolean value=true;
			 assertTrue(value);
			 
			 
		 }
		 
		 driver.close();
		
		 
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
	       
	    
		
	}
	

}
