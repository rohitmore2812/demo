package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_Clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	  // driver.findElement(By.xpath("//input[@name='email']")).sendkeys("abc");
	   
	  // driver.findElement(By.xpath("//input[@name='email']")).cear();
	   
	  // driver.findElement(By.xpath("//input[@name='email']")).sendkeys("xyz");
	   
	   WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
	   
	   UN.sendKeys("abc");
	   Thread.sleep(2000);
	   UN.clear();
	   Thread.sleep(2000);
	   UN.sendKeys("xyz");
	}   

}
