package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7_ID
{
	public static void main(String[] args) 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("file:///C:/Users/CHETAN/Desktop/ROHIT.HTML/id.html");
	   
	   //enter FN
	   driver.findElement(By.id("12345")).sendKeys("abc");
	   
	   //enter LN
	   //driver.findElement(By.id("67890")).sendKeys("xyz");
	   driver.findElement(By.id("12345")).sendKeys("xyz");
	}
}
