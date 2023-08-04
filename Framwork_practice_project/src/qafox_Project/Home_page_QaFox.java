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



	public static WebElement getele_Continue_Button()
	{
		return driver.findElement(by_Continue_Button);
	}
	static WebElement getele_My_Account()
	{
		return driver.findElement(by_My_Account);
	}
	static WebElement getele_Click_login()
	{
		return driver.findElement(by_Click_login);
	
	}

	////Actions

	public static void continue_button()
	{
		getele_Continue_Button().click();
	}
	public static void my_Account()
	{
		getele_My_Account().click();
	}
	public static void click_login()
	{
		getele_Click_login().click();
		//		String get_currentUrl=driver.getCurrentUrl();
		//		System.out.println(get_currentUrl);
	}


}
