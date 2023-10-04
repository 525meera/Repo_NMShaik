package qafox_login;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Execute_Class extends Base_Class
{
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Home_page.continue_button();
		Home_page.my_Account();
		Home_page.click_login();
		Login_page.userName("sonusallu143@gmail.com");
		Login_page.possward("N@gul786");
		Login_page.login_button();

	}
}
