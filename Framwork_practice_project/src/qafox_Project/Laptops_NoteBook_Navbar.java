package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Laptops_NoteBook_Navbar extends Based_class_Qafox
{
	///xpaths
	public static By  by_NavBar_page=By.xpath("//a[text()='Laptops & Notebooks']");
	public static By by_show_allLaptops=By.xpath("//a[text()='Show AllLaptops & Notebooks']");
	//public static By by_Click_img=By.xpath("//img[@alt='HP LP3065']");
	public static By by_Click_img=By.xpath("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//img[@alt='HP LP3065']");
	public static By by_AddtoCard=By.xpath("//button[@id='button-cart']");
	
	////webelements
	
	public static WebElement ele_Laptap_page()
	{
		return driver.findElement(by_NavBar_page);
	}
	public static WebElement ele_showallLaptops()
	{
		return driver.findElement(by_show_allLaptops);
	}
	public static WebElement ele_Click_Img()
	{
		return driver.findElement(by_Click_img);
		
	}
	public static WebElement ele_AddToCard()
	{
		return driver.findElement(by_AddtoCard);
	}
	
	//// Actions
	
	public static void laptap_NoteBooks()
	{
		ele_Laptap_page().click();
	}
	public static void showallLaptops()
	{
		ele_showallLaptops().click();
	}
	public static void click_Image()
	{
		ele_Click_Img().click();
	}
	public static void addtoCard()
	{
		ele_AddToCard().click();
	}
}
