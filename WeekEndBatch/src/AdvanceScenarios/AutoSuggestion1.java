package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws Throwable {

WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(2000);
List<WebElement> list = driver.findElements(By.tagName("li"));

for(WebElement wb:list)
{
	if(wb.getText().contains(" interview questions"))
	{
		System.out.println(wb.getText());
		Thread.sleep(1000);
		wb.click();
		break;
	}
}
	}	
}

