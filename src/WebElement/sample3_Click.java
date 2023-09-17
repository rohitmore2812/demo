package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_Click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	   //click on create new acc link
	   driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	   
	   Thread.sleep(3000);
	   
	   //click on female radio button
	   driver.findElement(By.xpath("//input[@class='_8esa']")).click();
	   
	}   

}
