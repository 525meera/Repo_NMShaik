package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Mp3players extends Based_class_Qafox
{
	////xpaths
	public static By by_mp3plyers=By.xpath("//a[text()='MP3 Players']");
	public static By by_showalllist=By.xpath("//a[text()='Show AllMP3 Players']");
	public static By by_listOfrows=By.xpath("//div[@id='content']//div[@class='row'][2]");
	public static By by_image=By.xpath("//img[@alt='iPod Classic']");
	public static By by_addCard_btn=By.xpath("//button[@id='button-cart']");

	////WebElements

	static WebElement ele_mp3players()
	{
		return driver.findElement(by_mp3plyers);
	}

	static WebElement ele_showalllist()
	{
		return driver.findElement(by_showalllist);
	}

	static WebElement ele_listOfrows()
	{
		return driver.findElement(by_listOfrows);
	}

	static WebElement ele_image()
	{
		return driver.findElement(by_image);
	}
	static WebElement ele_addcard()
	{
		return driver.findElement(by_addCard_btn);
	}

	///Action

	public static void mp3players()
	{
		ele_mp3players().click();
	}
	
	public static void showallList()
	{
		ele_showalllist().click();	
	}
	
	public static void listOfrows()
	{
		System.out.println(ele_listOfrows().getText());
	}
	public static void click_image()
	{
		ele_image().click();	
	}
	
	public static void addcart()
	{
		ele_addcard().click();
	}
}
