package orangeHRM_framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_page extends Driver_Class
{
	public static By by_profil_Click=By.xpath("//p[@class='oxd-userdropdown-name']");
	public static By by_Logout_button=By.xpath("//a[text()='Logout']");

	////webelement
	public static WebElement ele_profil()
	{
		return driver.findElement(by_profil_Click);
	}
	public static WebElement ele_logout_button()
	{
		return driver.findElement(by_Logout_button);
	}

	///actions
	public static void profil_Click()
	{
		ele_profil().click();
	}

	public static void logout_page()
	{
		ele_logout_button().click();
	}
}
