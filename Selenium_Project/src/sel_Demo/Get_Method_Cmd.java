package sel_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Get_Method_Cmd
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String get_Title=driver.getTitle();
		System.out.println(get_Title);
		Thread.sleep(2000);
		
		String get_currentUrl=driver.getCurrentUrl();
		System.out.println(get_currentUrl);
		Thread.sleep(2000);
		
		String get_pageSource=driver.getPageSource();
		System.out.println(get_pageSource);
		Thread.sleep(2000);
		

	}
}
