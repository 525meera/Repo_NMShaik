package windowHandle_iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		By by_hotels=By.xpath("//div[text()='Hotels']");

		WebElement ele_Hotels=driver.findElement(by_hotels);
		ele_Hotels.click();

		String parent_window=driver.getWindowHandle();

	//	System.out.println("Current ID : "+parent_window);

		Set<String> Windowhandle=driver.getWindowHandles();

		for(String child_window:Windowhandle)
		{
			if(!parent_window.equals(child_window))
			{
				driver.switchTo().window(child_window);			
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
				//driver.switchTo().window(parent_window);
			}
			//driver.close();
		}
		//	Thread.sleep(3000);
		driver.switchTo().window(parent_window);
		System.out.println(driver.switchTo().window(parent_window).getTitle());

		 driver.close();
	}
}
