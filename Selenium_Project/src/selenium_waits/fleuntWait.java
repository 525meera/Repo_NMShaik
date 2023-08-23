package selenium_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class fleuntWait 
{
	//base of interface
	static WebDriver driver;
	//Browser_launch
	public static void Browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
	}
	//xpath
	static By by_username=By.xpath("//input[@type='text']");
	//webelement
	public static WebElement ele_userName()
	{
		return driver.findElement(by_username);
	}
	//action
	public static void userName(String userName) throws InterruptedException
	{
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));
		//	Thread.sleep(3000);
		ele_userName().sendKeys(userName);
	}
	//Execution
	public static void main(String[] args) throws InterruptedException 
	{
		fleuntWait.Browser();
		fleuntWait.userName("NM Shaik");

	}
}
