package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Phones_PDAs_page extends Based_class_Qafox
{
////xpaths
	public static By by_phones_Page=By.xpath("//a[text()='Phones & PDAs']");
	public static By by_Image_Link=By.xpath("//div[@id='content']//img[@title='HTC Touch HD']");
	public static By by_textBox=By.xpath("//input[@id='input-quantity']");
	public static By by_addcard_button=By.xpath("//button[@id='button-cart']");
	
	////Webelements
	
	static WebElement ele_Phones_page()
	{
		return driver.findElement(by_phones_Page);
	}
	static WebElement ele_image_link()
	{
		return driver.findElement(by_Image_Link);
	}
	static WebElement ele_textBox()
	{
		return driver.findElement(by_textBox);
	}
	static WebElement ele_addcard_buuton()
	{
		return driver.findElement(by_addcard_button);
	}
	
	////Action
	
	public static void phones_page_tab()
	{
		ele_Phones_page().click();
	}
	public static void image_Click()
	{
		ele_image_link().click();
	}
	public static void quantity_Box(String quantity_No)
	{
		ele_textBox().clear();
		ele_textBox().sendKeys(quantity_No);
	}
	public static void addcard()
	{
		ele_addcard_buuton().click();
	}
}
