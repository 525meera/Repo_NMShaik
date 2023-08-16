package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Desktop_Page extends Based_class_Qafox
{
	//Xpaths

	public static By by_Desktop=By.xpath("//a[text()='Desktops']");
	public static By by_seeAll_Desktop=By.xpath("//a[text()='Show AllDesktops']");
	public static By by_desktops_list=By.xpath("//div[@class='list-group']");
	public static By by_laptop_product=By.xpath("//a[text()='Laptops & Notebooks (5)']");
	public static By by_components=By.xpath("//a[text()='Components (2)']");
	public static By by_Tablets=By.xpath("//a[text()='Tablets (1)']");
	public static By by_software=By.xpath("//a[text()='Software (0)']");
	public static By by_phones=By.xpath("//a[text()='Phones & PDAs (3)']");
	public static By by_cameras=By.xpath("//a[text()='Cameras (2)']");
	public static By by_Mp3Player=By.xpath("//a[text()='MP3 Players (4)']");

	// WebElemets

	public static WebElement ele_navbar_Desktop()
	{
		return driver.findElement(by_Desktop);
	}
	static WebElement ele_seeAll_navbar_Desktop()
	{
		return driver.findElement(by_seeAll_Desktop);
	}
	
	static WebElement ele_desktop_list() 
	{
		return driver.findElement(by_desktops_list);
		
	}
	
	static  WebElement ele_laptops_Products()
	{
		return driver.findElement(by_laptop_product);
		
	}
	
	static WebElement ele_components()
	{
		return driver.findElement(by_components);
		
	}
	
	static WebElement ele_tablets()
	{
		return driver.findElement(by_Tablets);
		
	}
	
	static WebElement ele_software()
	{
		return driver.findElement(by_software);
	}
	
	static WebElement ele_phones()
	{
		return driver.findElement(by_phones);
	}
	static WebElement ele_cameras()
	{
		return driver.findElement(by_cameras);
	}
	static WebElement ele_mp3_players()
	{
		return driver.findElement(by_Mp3Player);
	}
	
	
	////Actions
	
	public static void select_navbar_Desktop()
	{
		ele_navbar_Desktop().click();
	}
	public static void seeAll_desktop_click()
	{
		ele_seeAll_navbar_Desktop().click();	
	}
	
	public static void  list_group()
	{
	System.out.println(ele_desktop_list().getText());
		
	}
	
	public static void click_laptop_product()
	{
		ele_laptops_Products().click();
	
		
	}
	
	public static void click_components_product()
	{
		ele_components().click();
	}
	
	public static void click_tablets_product()
	{
		ele_tablets().click();
	}
	
	public static void click_software_products()
	{
		ele_software().click();
	}
	public static void click_phones_products()
	{
		ele_phones().click();
	}
	
	public static void click_cameras_products()
	{
		ele_cameras().click();
	}
	
	public static void click_mp3_playes()
	{
		ele_mp3_players().click();
	}
	
}
