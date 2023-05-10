package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.makemytrip.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//span[text()='Departure']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
//		
//	driver.findElement(By.xpath("//div[text()='April 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='5']")).click();
	
	/*driver.get("https://www.redbus.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()=' date']")).click();
	driver.findElement(By.xpath("//div[text()='April']"
			+ "/ancestor::div[contains(@class,'DatePicker__MainBlock-sc-')]"
			+ "/descendant::span[text()='20']")).click();*/
		
	/*	driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("View Time-Track"));
		
		driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();*/
		
	/*	driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		WebElement data = driver.findElement(By.id("file-upload"));
		data.sendKeys("C:\\Users\\Shobha\\Desktop\\PopupNotes.txt");
		System.out.println("file uploaded");*/
		
	/*	driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.cssSelector("div#container_tasks")).click();
		
		driver.findElement(By.xpath("//div[@class='checkbox inactive']")).click();
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();*/
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> allId = driver.getWindowHandles();//frames   //Selenium
		for(String wb:allId)//frames   //selenium
		{
			driver.switchTo().window(wb);//frames   //selenium
			String title = driver.getTitle();//frames   //selenium
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Get Tickets']")).click();
		
		Set<String> allIds = driver.getWindowHandles();//frames   //Selenium
		for(String wb1:allIds)//frames   //selenium
		{
			driver.switchTo().window(wb1);//frames   //selenium
			String title = driver.getTitle();//frames   //selenium
			System.out.println(title);
			if(title.contains("Frames"))
			{
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
