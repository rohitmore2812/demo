package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class withoutDDF
{
   
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/");  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("(//input[@id=\"central-login-module-sign-mobile\"])[2]")).sendKeys("8421130016");
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sayali@123");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(2000);
		
		WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myAcc).perform();
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		Set<String> id = driver.getWindowHandles();
	    ArrayList<String> al=new ArrayList<String>(id);
	    driver.switchTo().window(al.get(1));
	    
	     String actPN = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	     String expPN="sayali suryawanshi";
	     
	     if(actPN.equals(expPN))
	     {
	   	 System.out.println("pass");
	    }
	    else
	    {
	   	System.out.println("fail"); 
	    }
	    
	}
}
