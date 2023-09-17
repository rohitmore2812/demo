package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample8_navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
				ChromeDriver driver=new ChromeDriver();
				
				
				driver.navigate().to("https://www.amazon.in/");
				
				driver.navigate().to("https://www.google.com/");
				
				driver.navigate().back();
				
				Thread.sleep(5000);
				
				driver.navigate().forward();
				
				Thread.sleep(5000);
				
				driver.navigate().refresh();
				
				driver.navigate().to("https://www.myntra.com/");
				
				Thread.sleep(5000);
				
				driver.quit();

				
				
	}			

}
