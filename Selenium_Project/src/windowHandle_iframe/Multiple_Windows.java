package windowHandle_iframe;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(4000);
		By by_open_new_Window=By.xpath("//button[@id='newWindowBtn']");
		WebElement ele_open_new_Window= driver.findElement(by_open_new_Window);
		ele_open_new_Window.click();

		//		String parent_window=driver.getWindowHandle();
		//		Set<String> handles=driver.getWindowHandles();
		//		for(String child_window:handles)
		//		{
		//			if(!(parent_window.equals(child_window)))
		//			{
		//				driver.switchTo().window(child_window);
		//				driver.close();
		//			}
		//		}
		//		driver.switchTo().window(parent_window);		

	}
}
