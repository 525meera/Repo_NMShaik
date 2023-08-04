package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home_page_QaFox extends Based_class_Qafox
{
	////xpaths

	public static By by_Continue_Button =By.xpath("//a[text()='Continue']");
	public static By by_My_Account=By.xpath("//div[@id='top-links']//a[@title='My Account']");
	
	//public static By by_My_Account=By.xpath("//span[text()='My Account']");
	//public static By by_My_Account=By.xpath("//li[@class='dropdown']//span[text()='My Account']");
	//input[@name='search']
	//static By by_My_Account=By.xpath("//li[@class='dropdown']//span[@class='hidden-xs hidden-sm hidden-md']");
	
	public static By by_Click_login=By.xpath("//a[text()='Login']");

	////WebElements

	static WebElement ele_Continue_Button=driver.findElement(by_Continue_Button);
	static WebElement ele_My_Account=driver.findElement(by_My_Account);
	static WebElement ele_Click_login=driver.findElement(by_Click_login);

	////Actions

	public static void continue_button()
	{
		ele_Continue_Button.click();
	}
	public static void my_Account()
	{
		ele_My_Account.click();
	}
	public static void click_login()
	{
		ele_Click_login.click();
		//		String get_currentUrl=driver.getCurrentUrl();
		//		System.out.println(get_currentUrl);
	}


}
