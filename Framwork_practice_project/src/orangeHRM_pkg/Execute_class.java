package orangeHRM_pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Execute_class extends WebDriver_class
{
public static void main(String[] args) throws InterruptedException 
{
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	OrangeHRM_LoginPage.enter_userName("Admin");
	OrangeHRM_LoginPage.enter_possward("admin123");
	OrangeHRM_LoginPage.click_login_button();
	
	Thread.sleep(3000);
	
	Logout_page.profil_Click();
	
	Thread.sleep(3000);
	
	Logout_page.logout_page();
	
	
}
}
