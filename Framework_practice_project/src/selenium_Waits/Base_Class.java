package selenium_Waits;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class 
{
	static WebDriver driver;
	public static WebDriverWait wait;
	static FluentWait<WebDriver> fleuntwait;
	
	public static void browser_Launch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html#");
		driver.manage().window().maximize();
	//	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	}
	public static void implicitywait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public static void explicitiwait()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public static void fleuntwait()
	{
		fleuntwait=new FluentWait<WebDriver>(driver);
		fleuntwait.withTimeout(Duration.ofSeconds(30));
		fleuntwait.pollingEvery(Duration.ofSeconds(5));
	}
	
	
}
