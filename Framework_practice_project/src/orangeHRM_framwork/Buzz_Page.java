package orangeHRM_framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Buzz_Page extends Driver_Class
{
//// xpath
	static By by_buzz_Page=By.xpath("//span[text()='Buzz']");
	static By by_post_textbox=By.xpath("//textarea[@class='oxd-buzz-post-input']");
	static By by_postButton=By.xpath("//button[@type='submit']");
	
	////WebElements
	public static WebElement ele_Buzz_Page()
	{
		return driver.findElement(by_buzz_Page);
	}
	public static WebElement ele_posttext()
	{
		return driver.findElement(by_post_textbox);
	}
	public static WebElement ele_postButton()
	{
		return driver.findElement(by_postButton);
	}
	
	////Action
	public static void Buzz()
	{
		ele_Buzz_Page().click();
	}
	public static void post_textbox(String texttype)
	{
		 ele_posttext().click();
		 ele_posttext().sendKeys(texttype);
	}
	public static void PostButton()
	{
		ele_postButton().click();
	}
}
