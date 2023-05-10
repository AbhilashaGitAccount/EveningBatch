package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new EdgeDriver();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.manage().window().maximize();
		   
		   //xpath by Attribute
		   //htmltag[@AttributeName='AttributeValue']
		  // driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
       //  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
         
         //xpath by visibleText
         //htmltag[text()='AttributeValue']
        // driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
         //xpath by contains Attribute
         //htmltag[contains(@AttributeName,'AttributeValue')]
        // driver.findElement(By.xpath("//input[contains(@class,'textField p')]")).sendKeys("manager");
         
        // driver.findElement(By.xpath("//div[text()='Login ']")).click();
	      Thread.sleep(2000);
         //xpath by contains visibleText
         //htmltag[contains(text(),'AttributeValue')]
        // driver.findElement(By.xpath("//a[contains(text(),'Vie')]")).click();
	      
	      driver.findElement(By.xpath("//input[@id='username' or @name='username']")).sendKeys("admin");
	}

}
