package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SvgHandling {

	public static void main(String[] args) {

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		
		//     svg syntax----> //*[name()='svg']
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_Ae']")).click();
		
	}

}
