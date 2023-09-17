package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_xpathByContainsUsingAttribute1
{
	public static void main(String[] args) 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	   WebDriver driver=new ChromeDriver();
	   
	
	   driver.get("https://www.facebook.com/");
	   
	   //click on forgotten pwd link
	   driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abcd");
	   driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
	   driver.findElement(By.xpath("//button[contains(@class,'4jy6 _4jy1 selected')]")).click();
	   
	}
}
