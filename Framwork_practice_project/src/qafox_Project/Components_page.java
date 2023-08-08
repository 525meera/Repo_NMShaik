package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Components_page extends Based_class_Qafox
{
	////Xpaths
	public static By by_Components=By.xpath("//a[text()='Components']");
	public static By by_Sell_Components=By.xpath("//a[text()='Show AllComponents']");
	
	////webElements
	static WebElement ele_components()
	{
		return driver.findElement(by_Components);
	}
	static WebElement ele_sellallcomponents()
	{
		return driver.findElement(by_Sell_Components);
	}
	
	///Actions
	public static void components_page()
	{
		ele_components().click();
	}
	
	public static void all_components()
	{
		ele_sellallcomponents().click();
	}
}
