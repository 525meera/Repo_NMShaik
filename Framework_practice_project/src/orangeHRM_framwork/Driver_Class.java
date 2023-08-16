package orangeHRM_framwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Class 
{
	public static WebDriver driver;

	public static void driver_method() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jarfiles\\chromedriver-win32\\chromedriver-win32");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	static void browser_close()
	{
		driver.close();
	}
}
