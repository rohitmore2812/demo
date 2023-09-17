package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_maximize
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
				ChromeDriver driver=new ChromeDriver();
				
				
				driver.get("https://www.amazon.in/");
				
				driver.get("https://www.google.com/");
				
				driver.manage().window().maximize();
				
				//Option s1 = driver.manage();
				//Window s2 = s1.window();
				//s2.maximize();
				
				
				
				
				
			
		
	}

}


