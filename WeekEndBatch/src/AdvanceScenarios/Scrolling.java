package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new EdgeDriver();
driver.get("https://www.amazon.in");
		
//JavaScriptExecutor is DownCasted with Selenium Driver
		JavascriptExecutor js=(JavascriptExecutor)driver;
//Writing the Loop for Number of times to Scroll
		for(int i=0;i<3;i++)
		{
//executescript method executes the test script in the context of the currently selected window
			js.executeScript("window.scrollBy(0,900)");
			Thread.sleep(1000);
		}
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,-900)");
			Thread.sleep(1000);
		}
		}	
	}


