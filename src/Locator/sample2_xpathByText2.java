  package Locator;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class sample2_xpathByText2
	{
		public static void main(String[] args) 
		{
			
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Manual and automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		   WebDriver driver=new ChromeDriver();
		   
		
		   driver.get("https://www.facebook.com/");
		   
		   //click on create new acc link 
		   driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		   
		
	}


}
