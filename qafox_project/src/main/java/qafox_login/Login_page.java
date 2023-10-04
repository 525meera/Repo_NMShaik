package qafox_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_page extends Base_Class
{
////xpaths

	static By by_UserName=By.xpath("//input[@id='input-email']");
	static By by_possward=By.xpath("//input[@id='input-password']");
	static By by_login_Button=By.xpath("//input[@type='submit']");
	
	////WebElements

	static WebElement ele_UserName=driver.findElement(by_UserName);
	static WebElement ele_possward=driver.findElement(by_possward);
	static WebElement ele_login_Button=driver.findElement(by_login_Button);
	
	////Actions

	public static void userName(String UserName)
	{
		ele_UserName.click();
		ele_UserName.sendKeys(UserName);
	}

	public static void possward(String userPossward)
	{
		ele_possward.click();
		ele_possward.sendKeys(userPossward);
	}

	public static void login_button()
	{
		ele_login_Button.click();
	}
}
