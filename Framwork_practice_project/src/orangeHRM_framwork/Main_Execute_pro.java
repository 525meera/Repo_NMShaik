package orangeHRM_framwork;

public class Main_Execute_pro 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Driver_Class.driver_method();
		Login_page.enter_userName("Admin");
		Login_page.enter_possward("admin123");
		Login_page.click_login_button();
		Thread.sleep(3000);
		Logout_page.profil_Click();
		Thread.sleep(3000);
		Logout_page.logout_page();
	}
}
