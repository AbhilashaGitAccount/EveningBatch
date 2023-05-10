package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws Throwable {


		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.id("day"));

		Select sel=new Select(date);
		sel.selectByIndex(26);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		
		Select sele=new Select(monthlist);
		sele.selectByValue("6");
		
		WebElement yearlist = driver.findElement(By.id("year"));
		
		Select selec=new Select(yearlist);
		selec.selectByVisibleText("2020");
	}

}
