package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit.Selenium\\chromedriver_win32.zip\\chromedriver.exe");
			
            WebDriver driver= new ChromeDriver();
			
			
			 driver.get("https://www.facebook.com/");
			//click on create new acc link 
			 
			 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			 
			 Thread.sleep(5000);
			 
			 //step1
			 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			 
			 //step2
			Select s=new Select(month);
			 
			 //step3
			 s.selectByVisibleText("jan");
			 
	}			 
			 
}



