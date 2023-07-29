package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Login_Page 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		By by_userName=By.xpath("//input[@name='username']");
		WebElement ele_userName=driver.findElement(by_userName);
		ele_userName.sendKeys("Admin");
		Thread.sleep(3000);
		
		By by_Passward=By.xpath("//input[@name='password']");
		WebElement ele_passward=driver.findElement(by_Passward);
		ele_passward.sendKeys("admin123");
		Thread.sleep(3000);
		
		By by_Login_Button=By.xpath("//button[@type='submit']");
		WebElement ele_Login_Button=driver.findElement(by_Login_Button);
		ele_Login_Button.click();
		Thread.sleep(3000);
		
		
		driver.close();
		
		
	}
}
