package windowHandle_iframe;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		By by_Nse_tabClick=By.xpath("//iframe[@id='moneyiframe']");

		WebElement ele_Nse_tabClick=driver.findElement(by_Nse_tabClick);
		ele_Nse_tabClick.click();

		String parent_window=driver.getWindowHandle();

		//	System.out.println("Current ID : "+parent_window);

		Set<String> Windowhandle=driver.getWindowHandles();

		for(String child_window:Windowhandle)
		{
			if(!parent_window.equals(child_window))
			{
				driver.switchTo().window(child_window);			
				System.out.println(driver.switchTo().window(child_window).getTitle());

				By by_get_quote=By.xpath("//input[@id='srchword']");
				WebElement ele_get_quote=driver.findElement(by_get_quote);
				Thread.sleep(3000);
				ele_get_quote.sendKeys("NM Shaik");

				By by_add_Widget=By.xpath("//div[@class='floatR mt2']");
				WebElement ele_add_Widget=driver.findElement(by_add_Widget);
				ele_add_Widget.click();

				child_window=driver.getWindowHandle();
				Set<String> handle=driver.getWindowHandles();
				for(String sub_child:handle)
				{
					if(!(parent_window.equals(sub_child)))
					{
						driver.switchTo().window(sub_child);
						Thread.sleep(3000);
						driver.close();
					}
				}
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent_window);
		System.out.println(driver.switchTo().window(parent_window).getTitle());

	}
}
