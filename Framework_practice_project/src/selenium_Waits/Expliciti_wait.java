package selenium_Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Expliciti_wait extends Base_Class
{
	
	//xpath
		public static By by_button1=By.xpath("//button[@id='btn1']");
		
		////Webelements
		public static WebElement ele_button1()
		{
			explicitiwait();
			return driver.findElement(by_button1);
		}
	//Action
	public static void expliciti_wait() throws InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOfAllElements(ele_button1()));
		ele_button1().click();
	}	
}
