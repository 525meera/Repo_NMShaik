package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_page extends Based_class_Qafox
{
	////xpaths
	static By by_myAccount_click=By.xpath("//li[@class='dropdown']//span[@class='hidden-xs hidden-sm hidden-md']");
	static By by_Logout_click=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Logout']");
	
	//// WebElements
	static WebElement ele_myAccount_click=driver.findElement(by_myAccount_click);
	static WebElement ele_Logout_click=driver.findElement(by_Logout_click);
	
	////Action
	public static void my_Account_click()
	{
		ele_myAccount_click.click();
		
	}
	public static void click_Logout()
	{
		ele_Logout_click.click();
		
	}
	
}
