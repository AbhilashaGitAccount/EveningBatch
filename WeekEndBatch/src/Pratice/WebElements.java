package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElements {

	public static void main(String[] args) throws Throwable {

WebDriver driver=new EdgeDriver();
/*driver.get("https://wwww.facebook.com/login/");
//getCssValue()
WebElement font = driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
String color = font.getCssValue("color");
System.out.println(color);

WebElement size = driver.findElement(By.name("email"));
String data = size.getCssValue("font-size");
System.out.println(data);

//getLocation()
WebElement value = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
Point location = value.getLocation();
System.out.println(location.getX());
System.out.println(location.getY());
System.out.println(location);

//getSize()
WebElement value1 = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
Dimension data1 = value1.getSize();
System.out.println(data1.getHeight());
System.out.println(data1.getWidth());
System.out.println(data1);

WebElement value2 = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
Rectangle rect = value2.getRect();
System.out.println(rect.getX());
System.out.println(rect.getY());
System.out.println(rect.getHeight());
System.out.println(rect.getWidth());*/


driver.get("https://demo.actitime.com/login.do");
/*WebElement username = driver.findElement(By.id("username"));
username.sendKeys("admin");
Thread.sleep(2000);
username.clear();*/

//isdisplayed()
/*WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
if(logo.isDisplayed())
{
	System.out.println("logo displayed");
}
else
{
	System.out.println("logo not displayed");
}*/

//isEnabled()
/*WebElement data = driver.findElement(By.id("username"));
if(data.isEnabled())
{
	data.sendKeys("admin");
}
else
{
	System.out.println("not enabled");
}

//isSelected()
WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
checkbox.click();
if(checkbox.isSelected())
{
	System.out.println("checkbox is selected");
}
else
{
	System.out.println("not selected");
}*/

//getAttribute()
WebElement value = driver.findElement(By.id("username"));
//String data = value.getAttribute("class");
//System.out.println("Attribute value is:"+data);

//String htmltag = value.getTagName();
//System.out.println(htmltag);

//getTagName()
/*WebElement name = driver.findElement(By.id("loginButton"));
String htmltagg = name.getTagName();
System.out.println(htmltagg);*/


/*WebElement value1 = driver.findElement(By.cssSelector("div.atLogoImg"));
String data = value1.getTagName();
System.out.println(data);*/

WebElement value2 = driver.findElement(By.id("username"));

WebElement name = driver.findElement(By.id("loginButton"));

WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

System.out.println(value2.getAriaRole());
System.out.println(name.getAriaRole());
System.out.println(checkbox.getAriaRole());
	}
	}

