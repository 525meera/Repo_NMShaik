package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Created 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		By by_create_Account=By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
		WebElement ele_create_Account=driver.findElement(by_create_Account);
		ele_create_Account.click();
		
		Thread.sleep(3000);
		
		By by_first_name=By.xpath("//input[@name='firstname']");
		WebElement ele_first_name=driver.findElement(by_first_name);
		ele_first_name.sendKeys("NM");
		
		Thread.sleep(3000);
		
		By by_last_name=By.xpath("//input[@name='lastname']");
		WebElement ele_last_name=driver.findElement(by_last_name);
		ele_last_name.sendKeys("Shaik");
		
		Thread.sleep(3000);
		
		By by_email=By.xpath("//input[@name='reg_email__']");
		WebElement ele_emial=driver.findElement(by_email);
		ele_emial.sendKeys("sonusallu143@gmail.com");
		
		Thread.sleep(3000);

		By by_passward=By.xpath("//input[@id='password_step_input']");
		WebElement ele_passward=driver.findElement(by_passward);
		ele_passward.sendKeys("Sallu143");
		
		Thread.sleep(3000);
		
		
		By by_day=By.xpath("//select[@name='birthday_day']");
		WebElement ele_Day=driver.findElement(by_day);
		ele_Day.click();
		
		Thread.sleep(3000);
		
		ele_Day.isSelected();
		
		Thread.sleep(3000);
		
		By by_select_Day=By.xpath("//option[text()='1']");
		WebElement ele_Select_Day=driver.findElement(by_select_Day);
		ele_Select_Day.click();
		
		Thread.sleep(3000);
		
		By by_Month=By.xpath("//select[@id='month']");
		WebElement ele_Month=driver.findElement(by_Month);
		ele_Month.click();
		
		Thread.sleep(3000);
		
		ele_Month.isSelected();
		
		Thread.sleep(3000);
		
		By by_select_Month=By.xpath("//option[text()='Jan']");
		WebElement ele_Select_Month=driver.findElement(by_select_Month);
		ele_Select_Month.click();
		
		Thread.sleep(3000);
		
		By by_year=By.xpath("//select[@id='year']");
		WebElement ele_year=driver.findElement(by_year);
		ele_year.click();
		
		Thread.sleep(3000);
		
		ele_year.isSelected();
		
		Thread.sleep(3000);
		
		By by_Select_year=By.xpath("//option[text()='2022']");
		WebElement ele_Select_year=driver.findElement(by_Select_year);
		ele_Select_year.click();
		
		Thread.sleep(3000);
		
		By by_gender=By.xpath("//label[text()='Male']");
		WebElement ele_gender=driver.findElement(by_gender);
		ele_gender.click();
		
		Thread.sleep(3000);
		
		By by_Click_sign_in=By.xpath("//button[@name='websubmit']");
		WebElement ele_singin_button=driver.findElement(by_Click_sign_in);
		ele_singin_button.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}
}
