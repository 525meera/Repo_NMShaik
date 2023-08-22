package iframe_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NSE_iframe extends Based_Class
{
	//// xpaths 
	public static By by_Nse=By.xpath("//iframe[@id='moneyiframe']");
	public static By by_NSE_Frame=By.xpath("//span[@id='nseindex']");
	public static By by_sportstabclick=By.xpath("//a[text()='SPORTS']");
	

	//// Webelements
	public static WebElement ele_Nse_iframe()
	{
		return driver.findElement(by_Nse);
	}

	public static WebElement ele_NseiframeTitle()
	{
		return driver.findElement(by_NSE_Frame);
	}
	public static WebElement ele_iframeout()
	{
		return driver.findElement(by_sportstabclick);
	}

	//// Action
	public static void NSE_Iframe() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().frame(ele_Nse_iframe());
	}

	public static void Nse_element_Id()
	{
		System.out.println(ele_NseiframeTitle().getText());
	}
	
	public static void parent_cantent()
	{
		driver.switchTo().defaultContent();
	}
	
	public static void sports_tab()
	{
		ele_iframeout().click();
		
	}
	
}
