package orangeHRM_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class OrangeHRM_LoginPage extends WebDriver_class
{

	////xpath
	static	By by_userName=By.xpath("//input[@name='username']");
	static By by_possward=By.xpath("//input[@name='password']");
	static By by_click_login=By.xpath("//button[@type='submit']");


	////webelement

	static 	WebElement ele_userName=driver.findElement(by_userName);

	static WebElement ele_possward=driver.findElement(by_possward);

	static WebElement ele_login_Button=driver.findElement(by_click_login);


	///actions
	public static void enter_userName(String userName) 
	{
		ele_userName.click();
		ele_userName.sendKeys(userName);
	}
	public static void enter_possward(String possward) {
		ele_possward.click();
		ele_possward.sendKeys(possward);
	}

	public static void click_login_button() {
		ele_login_Button.click();
	}
}
