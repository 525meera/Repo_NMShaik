package automation_Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Page extends Base_class
{
///Xpaths
	static By by_UserName=By.xpath("//input[@data-qa='login-email']");
	static By by_possward=By.xpath("//input[@data-qa='login-password']");
	static By by_login_Button=By.xpath("//button[@data-qa='login-button']");
	////WebElements
	
	static WebElement ele_UserName=driver.findElement(by_UserName);
	static WebElement ele_possward=driver.findElement(by_possward);
	static WebElement ele_login_Button=driver.findElement(by_login_Button);
	////Actions
	
	public static void ele_UserName(String UserName)
	{
		ele_UserName.click();
		ele_UserName.sendKeys(UserName);
	}
	
	public static void ele_possward(String userPossward)
	{
		ele_possward.click();
		ele_possward.sendKeys(userPossward);
	}
	
	public static void ele_Login_button()
	{
		ele_login_Button.click();
		
	}
	
}
