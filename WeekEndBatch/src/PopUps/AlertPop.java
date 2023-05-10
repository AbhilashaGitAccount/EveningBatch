package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPop {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new EdgeDriver();
	/*	driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		
		driver.findElement(By.id("name")).sendKeys("TestYnatra");
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		
		Alert alt = driver.switchTo().alert();
		//alt.accept();
        alt.dismiss();*/
		
		driver.get("https://jqueryui.com/droppable");

		driver.switchTo().frame(0);

	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop).perform();
	
	
	
	
	
	
	
	
	}

}
