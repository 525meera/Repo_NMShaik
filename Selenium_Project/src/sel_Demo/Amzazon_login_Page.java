package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzazon_login_Page 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b?node=8872558031");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		By by_signin_Account=By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
		WebElement ele_signin_Account=driver.findElement(by_signin_Account);
		ele_signin_Account.click();
		
	}
}
