package selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fleunt_wait extends Base_Class
{
	//xpath
			public static By by_button1=By.xpath("//button[@id='btn1']");
			
			////Webelements
			public static WebElement ele_button1()
			{
				return driver.findElement(by_button1);
			}
		//action
		public static void fleunt_wait() throws InterruptedException
		{
			fleuntwait();
			//	Thread.sleep(3000);
			ele_button1().click();
		}
}
