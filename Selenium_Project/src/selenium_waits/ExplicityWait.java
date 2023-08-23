package selenium_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html#");
		
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		By by_Button1=By.xpath("//button[@id='btn1']");
		
		WebElement ele_Button1=driver.findElement(by_Button1);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele_Button1));
		ele_Button1.click();
		//driver.close();
	}
}
