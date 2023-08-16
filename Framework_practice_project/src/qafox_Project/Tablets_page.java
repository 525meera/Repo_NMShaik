package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tablets_page extends Based_class_Qafox
{
//Xpaths
	public static By by_tablets=By.xpath("//a[text()='Tablets']");
	public static By by_addCard=By.xpath("//span[text()='Add to Cart']");
	
	////WebElemets
	static WebElement ele_tablets()
	{
		return driver.findElement(by_tablets);
	}
	static WebElement ele_addcard()
	{
		return driver.findElement(by_tablets);
	}
	////Action
	public static void tablets()
	{
		ele_tablets().click();
	}
	public static void addcard()
	{
		ele_addcard().click();
	}
	
	
}
