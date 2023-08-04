package qafox_Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main_QaFox extends Based_class_Qafox
{
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Home_page_QaFox.continue_button();
		
	//	Thread.sleep(3000);
		
		Home_page_QaFox.my_Account();
		
		Thread.sleep(3000);
		
		Home_page_QaFox.click_login();
		
		Thread.sleep(3000);
		
		Login_page_Qafox.userName("sonusallu143@gmail.com");
		
		Thread.sleep(3000);
		
		Login_page_Qafox.possward("N@gul786");
		
		Thread.sleep(3000);
		
		Login_page_Qafox.login_button();
		
		Thread.sleep(3000);
		
		Logout_page.my_Account_click();
		
		Thread.sleep(3000);
		
		Logout_page.click_Logout();
		
		Thread.sleep(3000); 
		
		driver.close();
		
	}
	
}
