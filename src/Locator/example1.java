package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{

	public static void main(String[] args) 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	   WebDriver driver=new ChromeDriver();
	   
	
	   driver.get("https://www.facebook.com/");
	   
	   //enter UN
	   //driver.findElement(locater type);
	   //driver.findElement(By.xpath(""String xpathExpression))
	   
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("999999999");
	   
	   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
	   
	   driver.findElement(By.xpath("//button[@name='login']")).click();
	   
	   
}
}
