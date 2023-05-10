package Pratice;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EmptyBrowser {

	

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
        
	/*	driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		//driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String data = driver.getPageSource();
		System.out.println(data);
		
	//	driver.close();
		driver.quit();*/
		

		
		driver.get("https://demo.actitime.com/login.do");
	
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File dest = new File("Failed.png");
       
		
		
		
		
		
		
		
		
	}

}
