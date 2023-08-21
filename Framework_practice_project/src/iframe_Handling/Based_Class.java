package iframe_Handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Based_Class 
{
	public static WebDriver driver;

	public static void driver_method() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	static void browser_close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
