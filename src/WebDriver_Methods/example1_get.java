package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class example1_get 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
           System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32.zip\\chromedriver.exe");
		
		
		   ChromeDriver driver=new ChromeDriver();
		   
		   Thread.sleep(5000);
		   
		   driver.get("https://www.facebook.com/");   //diffClassName.methodname();
		   
		   Thread.sleep(5000);
		   
		   driver.close();
		   
		   
		
	}

}
