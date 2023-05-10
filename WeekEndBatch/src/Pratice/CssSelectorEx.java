package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	
		//cssSelector() using id()
		//     [Attributename='AttributeValue']
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
	
		//     htmltag[Attributename='AttributeValue']
	//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
		//      htmltag#AttributeValue  
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
	
	//cssSelector() using class()
	//       [Attributename='AttributeValue']
	//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		
	//	htmltag[Attributename='AttributeValue']
		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		
		//       htmltag.AttributeValue
	//driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
	}
	}
