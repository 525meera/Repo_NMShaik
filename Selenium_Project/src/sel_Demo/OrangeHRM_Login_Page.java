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
		
		By by_PIM =By.xpath("//span[text()='PIM']");
		WebElement ele_PIM=driver.findElement(by_PIM);
		ele_PIM.click();
		
//		By by_add_Employee =By.xpath("//a[text()='Add Employee']");
//		WebElement ele_Add_employee=driver.findElement(by_add_Employee);
//		ele_Add_employee.click();
//		Thread.sleep(5000);
//		
//		By by_Employee_Name =By.xpath("//input[@fdprocessedid='mlsg9a']");
//		WebElement ele_Employee_Name=driver.findElement(by_Employee_Name);
//		ele_Employee_Name.sendKeys("NM Shaik");
//		Thread.sleep(5000);
//		
//		By by_Employee_Id =By.xpath("//input[@fdprocessedid='t5itki']");
//		WebElement ele_Employee_ID=driver.findElement(by_Employee_Id);
//		ele_Employee_ID.sendKeys("123");
//		Thread.sleep(5000);
//		
//		By by_Employee_status =By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
//		WebElement ele_Employee_status=driver.findElement(by_Employee_status);
//		ele_Employee_status.click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
}
