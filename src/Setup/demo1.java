package Setup;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	
	public static void main(String[] args) 
	{
		//step1:set chromedriver.exe file path
		//parameter1: name of the browser(small letter)
		//parameter2: path of the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit.Selenium\\chromedriver_win32.zip/chromedriver.exe");
		
		//step2:create an object of chromedriver class
		ChromeDriver driver=new ChromeDriver();
	}
	

}
