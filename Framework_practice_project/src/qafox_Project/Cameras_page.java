package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cameras_page extends Based_class_Qafox
{
//xpaths
	public static By by_Cameras_page=By.xpath("//a[text()='Cameras']");
	public static By by_imageclick=By.xpath("//img[@alt='Nikon D300']");
	public static By by_Addcard_button=By.xpath("//button[@id='button-cart']");
	
	///WebElemets
	
	static WebElement ele_cameras_click()
	{
		return driver.findElement(by_Cameras_page);
	}
	static WebElement ele_imageclick()
	{
		return driver.findElement(by_imageclick);
	}
	static WebElement ele_addcard_button()
	{
		return driver.findElement(by_Addcard_button);
	}
	
	///Action
	
	public static void cameras_page()
	{
		ele_cameras_click().click();
	}
	
	public static void image_click()
	{
		ele_imageclick().click();
	}
	
	public static void addcard_button()
	{
		ele_addcard_button().click();
		
	}
}
