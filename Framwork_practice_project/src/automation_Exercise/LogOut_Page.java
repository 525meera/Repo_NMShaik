package automation_Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogOut_Page extends Base_class
{
	////xpath
	static By by_Logout=By.xpath("//i[@class='fa fa-lock']");
	
	////webElement
	static WebElement ele_logout=driver.findElement(by_Logout);
	
	////Actions
	public static void logout_Button()
	{
		ele_logout.click();
	}
}
