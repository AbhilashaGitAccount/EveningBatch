package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsEx {

	public static void main(String[] args) throws Throwable {

   WebDriver driver=new EdgeDriver();
   driver.get("https://demo.actitime.com/login.do");
   driver.manage().window().maximize();
   //Example for id()
   //driver.findElement(By.id("username")).sendKeys("shobha");
   driver.findElement(By.id("username")).sendKeys("admin");
   
   //Example for name()
   driver.findElement(By.name("pwd")).sendKeys("manager");
   
   Thread.sleep(2000);
     driver.findElement(By.id("loginButton")).click();
   
   //Example for Classname()
   //driver.findElement(By.className("initial")).click();
   
     Thread.sleep(2000);
     //example for linktext()
    // driver.findElement(By.linkText("Lock Time-Track")).click();
    // driver.findElement(By.linkText("View Time-Track")).click();
     
     //Example for Partiallinktext()
    // driver.findElement(By.partialLinkText("View Ti")).click();
     driver.findElement(By.partialLinkText("Approve Time-")).click();
   
/*   driver.get("https://www.amazon.in/");
  // driver.findElement(By.linkText("Mobiles")).click();
   //driver.findElement(By.linkText("Customer Service")).click();
   
   driver.findElement(By.partialLinkText("Customer S")).click();*/
   
   
   
	}

}
