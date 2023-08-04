package orangeHRM_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_page extends WebDriver_class
{
	////xpath
	public static By by_profil_Click=By.xpath("//p[@class='oxd-userdropdown-name']");
	public static By by_Logout_button=By.xpath("//a[text()='Logout']");

	////webelement
	public static WebElement ele_profil_Click=driver.findElement(by_profil_Click);
	public static WebElement ele_by_Logout=driver.findElement(by_Logout_button);

	///actions
	public static void profil_Click()
	{
		ele_profil_Click.click();
	}
	
	public static void logout_page()
	{
		ele_by_Logout.click();
	}
}
