package main.java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.AShot;
import javax.imageio.ImageIO;

public class screen {
	
	public void screenshot1(WebDriver driver,WebElement z) throws IOException {
		screen obj=new screen();
		System.out.println("Enter the file name");
		Scanner myObj = new Scanner(System.in);
		String name = myObj.nextLine();
		  TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 File DestFile=new File("G:\\"+name+".jpg");
		 FileUtils.copyFile(SrcFile, DestFile);
		
//		System.out.println("Enter the file name");
//		Scanner myObj = new Scanner(System.in);
//		String name = myObj.nextLine();
//		Screenshot Screenshot = new AShot().takeScreenshot(driver);
//		//File file = new File("G:\\"+name+".jpg");
//		
//		ImageIO.write(Screenshot.getImage(), "jpg", new File("G:\\"+name+".jpg"));
	}

}
