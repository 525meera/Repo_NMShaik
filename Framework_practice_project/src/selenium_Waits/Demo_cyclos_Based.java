package selenium_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_cyclos_Based 
{
	static WebDriver driver;
	static WebDriverWait wait;
	static FluentWait<WebDriver> fleuntwait;

	public static void browser_Launch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://demo.cyclos.org/ui/login");
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		driver.manage().window().maximize();
	}

	public static void implicitywait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void explicitiwait()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}


	public static void explicitiwait(WebElement ele, int time)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}

	public static void explicitiwait(By by_userName, int time)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by_userName));
	}

	public static void fleuntwait(By by_userName,int time,int sec)
	{
		fleuntwait=new FluentWait<WebDriver>(driver);
		fleuntwait.withTimeout(Duration.ofSeconds(time));
		fleuntwait.pollingEvery(Duration.ofSeconds(sec));
	}

	public static void fleuntwait()
	{
		fleuntwait=new FluentWait<WebDriver>(driver);
		fleuntwait.withTimeout(Duration.ofSeconds(20));
		fleuntwait.pollingEvery(Duration.ofSeconds(5));
	}
}
