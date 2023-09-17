package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8_className 
{
	public static void main(String[] args) 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("file:///C:/Users/CHETAN/Desktop/ROHIT.HTML/cassName.html");
	   
	   driver.findElement(By.className("abc123")).sendKeys("abc");
	   driver.findElement(By.className("abc123")).sendKeys("xyz");
	   
	}
}
