package selenium_waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Waits 
{
	static WebDriver driver;
	
	public static void browser_lunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html#");
		driver.manage().window().maximize();
		
	}
	public static void implicitiWait() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		By by_Button1=By.xpath("//button[@id='btn1']");
		WebElement ele_Button1=driver.findElement(by_Button1);
		ele_Button1.click();
		//Thread.sleep(3000);
		By by_Button2=By.xpath("//button[@id='btn2']");
		WebElement ele_Button2=driver.findElement(by_Button2);
		ele_Button2.click();
	}
	
	public static void explicitiWaits()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		By by_Button1=By.xpath("//button[@id='btn1']");
		WebElement ele_Button1=driver.findElement(by_Button1);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele_Button1));
		ele_Button1.click();
	}
	
	public static void fluent_Waits()
	{
		By by_Button1=By.xpath("//button[@id='btn1']");
		WebElement ele_Button1=driver.findElement(by_Button1);
		FluentWait wait=new FluentWait (driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(5));
		ele_Button1.click();
	}
	
	public static void browser_close()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Selenium_Waits.browser_lunch();
		
		Selenium_Waits.implicitiWait();
//		Selenium_Waits.explicitiWaits();
//		Selenium_Waits.fluent_Waits();
		Selenium_Waits.browser_close();

	}
}
