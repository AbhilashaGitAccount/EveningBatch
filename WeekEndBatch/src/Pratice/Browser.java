package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Browser {

	public static void main(String[] args) {
		
		//launching empty browser
WebDriver driver=new ChromeDriver();
	//WebDriver driver=new EdgeDriver();

//get("url")--->launch the application
	driver.get("https://www.flipkart.com/");
	
	//max nd min Screen
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	
	//fetches the title of the page
	String data = driver.getTitle();
	System.out.println(data);
	
	//fetches Url of the application
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	//prints source code of the page
	String source = driver.getPageSource();
	System.out.println(source);
	
	//driver.close();---->// focused window
	
	//driver.quit();//--->closes browser

	}

}
