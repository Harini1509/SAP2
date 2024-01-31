package main.java;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;


import org.testng.Assert;
import org.testng.annotations.Test;
public class Question5 extends screen {
	@Test
	public void test() throws InterruptedException, IOException {
	//public static void main(String[] args) throws InterruptedException, IOException {
		 Question5 obj2=new Question5();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://mockexam2cpsat.agiletestingalliance.org/about/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,700)");
		 List<WebElement> a=driver.findElements(By.xpath("//div[@class='eael-accordion-list']"));
		 List<WebElement> f=driver.findElements(By.tagName("figure"));
		 List<WebElement> g=driver.findElements(By.xpath("//div[@class='elementor-image-box-content']//h3"));
		 List<WebElement> h=driver.findElements(By.xpath("//div[@class='elementor-image']//img"));
//		 System.out.println(h.get(0).getAttribute("src"));
//		 WebElement z= h.get(0);
//		 Actions action = new Actions(driver);
//			action.moveToElement(z).perform();
		 int size=a.size();
		 int size2=f.size();
		 int size3=h.size();
		 int i=0,j=0;
		 
		 while(size>0) {
			
			 a.get(i).findElement(By.cssSelector("i[class='fa-accordion-icon fas fa-plus']")).click();
			
			 String b=a.get(i).findElement(By.cssSelector("div[class='eael-accordion-content clearfix']")).getText();
			 
			 
			 Thread.sleep(2000);
	
		 System.out.println(b);
		 size--;
		 i++;
		 }
		// js.executeScript("window.scrollBy(0,900)");
		
		// js.executeScript("arguments[0].scrollIntoView();", h.get(0));
		
		 for(int k=0;k<size3;k++) {
			 
			 
			WebElement z= h.get(k);
			Thread.sleep(5000);
			
		    Actions action = new Actions(driver);
			action.moveToElement(z).perform();
			
			obj2.screenshot1(driver,z);
			
			String str=driver.findElement(By.xpath("//div[@class='tippy-content']")).getText();
			System.out.println(str);
			
			
			
			
			 
			 
		
			
			
		 }
		 js.executeScript("window.scrollBy(0,450)");
		 
		 
		 while(size2>0) {
				
			 String c=g.get(j).getText();
			 System.out.println(c);
			 f.get(j).click();
			 Thread.sleep(1000);
			 String d=driver.findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[2]")).getText();
			 Assert.assertEquals(c, d);
			 
			 
			 driver.navigate().back();
			 Thread.sleep(1000);
			 size2--;
			 j++;
			 
		 }
		 
//		 
//		 
		 
		 
	}
		 

}
