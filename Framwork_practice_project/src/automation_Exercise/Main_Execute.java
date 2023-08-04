package automation_Exercise;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Execute extends Base_class
{
	public static void main(String[] args) throws InterruptedException 
	{
		driver= new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Login_Page.ele_UserName("sonusallu143@gmail.com");
		Login_Page.ele_possward("N@gul786");
		Login_Page.ele_Login_button();
		
		Thread.sleep(3000);
		
		LogOut_Page.logout_Button();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
