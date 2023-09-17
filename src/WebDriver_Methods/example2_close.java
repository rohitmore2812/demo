package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class example2_close 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
				ChromeDriver driver=new ChromeDriver();
				
				Thread.sleep(7000);
				
				driver.get("https://www.amazon.in/");
				
				Thread.sleep(7000);
				
				 driver.get("https://www.facebook.com/");
				
				driver.quit();
				
		
	}

}