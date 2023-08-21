package iframe_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NSE_TabPage extends Based_Class
{
	//// xpaths 
	public static By by_Nse_tabClick=By.xpath("//iframe[@id='moneyiframe']");

	//// Webelements
	public static WebElement ele_Nse_tabClick()
	{
		return driver.findElement(by_Nse_tabClick);
	}

	//// Action
	public static void NSE_method() throws InterruptedException
	{
		ele_Nse_tabClick().click();

		Thread.sleep(3000);
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

	}

}

