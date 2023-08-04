package orangeHRM_framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_page  extends Driver_Class
{
	////xpath
	static	By by_userName=By.xpath("//input[@name='username']");
	static By by_possward=By.xpath("//input[@name='password']");
	static By by_click_login=By.xpath("//button[@type='submit']");


	////webelement
	public static WebElement ele_user_Name()
	{
		WebElement ele_userName=driver.findElement(by_userName);
		return ele_userName;
	}
	
	public static WebElement ele_possward()
	{
		WebElement ele_possward=driver.findElement(by_possward);
		return ele_possward;
	}
	
	public static WebElement ele_Login_Button()
	{
		WebElement ele_login_Button=driver.findElement(by_click_login);
		return ele_login_Button;
	}

	///actions
	public static void enter_userName(String userName) 
	
	{
		ele_user_Name().click();
		ele_user_Name().sendKeys(userName);
	}
	public static void enter_possward(String possward) {
		ele_possward().click();
		ele_possward().sendKeys(possward);
	}
	
	public static void click_login_button() {
		ele_Login_Button().click();
	}

}
