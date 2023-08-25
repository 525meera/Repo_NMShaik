package selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Impilciti_wait extends Base_Class
{
//xpath
	public static By by_button1=By.xpath("//button[@id='btn1']");
	
	////Webelements
	public static WebElement ele_button1()
	{
		return driver.findElement(by_button1);
	}
	///Action
	public static void impliciti_wait()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		implicitywait();
		ele_button1().click();
		
	}
}
