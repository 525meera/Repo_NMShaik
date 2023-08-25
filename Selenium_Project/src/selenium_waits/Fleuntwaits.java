package selenium_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fleuntwaits 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FluentWait<WebDriver> 	wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html#");
		driver.manage().window().maximize();
		
		By by_button1=By.xpath("//button[@id='btn1']");

		WebElement ele_button1=driver.findElement(by_button1);
		ele_button1.click();
		
		driver.close();
		
	}
}
