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
		
		By by_User_Emial=By.xpath("//input[@id='ap_email']");
		WebElement ele_user_Emial=driver.findElement(by_User_Emial);
		ele_user_Emial.sendKeys("8500271044");
		
		Thread.sleep(3000);
		
		By by_Continues_button=By.xpath("//input[@id='continue']");
		WebElement ele_Continues_button=driver.findElement(by_Continues_button);
		ele_Continues_button.click();
		
		Thread.sleep(3000);

		By by_passward=By.xpath("//input[@id='ap_password']");
		WebElement ele_passward=driver.findElement(by_passward);
		ele_passward.sendKeys("N@gul700");
		
		Thread.sleep(3000);
		
		By by_sign_in=By.xpath("//input[@id='signInSubmit']");
		WebElement ele_sign_in=driver.findElement(by_sign_in);
		ele_sign_in.click();
							
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
