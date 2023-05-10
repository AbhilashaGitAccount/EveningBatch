package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {

		WebDriver driver=new EdgeDriver();
		/*driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement data = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(data).perform();
		
		act.contextClick(data).perform();*/
		
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();*/
		
	/*	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement value = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(value).perform();*/
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement data = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.id("loginButton"));
		
		Actions act=new Actions(driver);
	//	act.sendKeys(data,"admin").perform();
		//act.sendKeys(pass,"manager").perform();
		
	act.sendKeys(data,"admin").sendKeys(pass,"manager").sendKeys(login).build().perform();
		
		
	}

}
