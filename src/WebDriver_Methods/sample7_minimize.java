package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample7_minimize 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
				ChromeDriver driver=new ChromeDriver();
				
				
				driver.get("https://www.amazon.in/");
				
				driver.get("https://www.google.com/");
				
				Thread.sleep(5000);
				
				driver.manage().window().minimize();
				
				
				
	}
}
