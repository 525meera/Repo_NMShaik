package iframe_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NSE_iframe extends Based_Class
{
	//// xpaths 
	public static By by_Nse=By.xpath("//iframe[@id='moneyiframe']");

	//// Webelements
	public static WebElement ele_Nse_iframe()
	{
		return driver.findElement(by_Nse);
	}

	//// Action
	public static void NSE_Iframe() throws InterruptedException
	{
		String NSE=	ele_Nse_iframe().getText();
		System.out.println(NSE);
	}
}
