package orangeHRM_framwork;

public class Main_Execute_pro 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// driver_class 
		Driver_Class.driver_method();
		
		//Login_Page
		Login_page.enter_userName("Admin");
		Login_page.enter_possward("admin123");
		Login_page.click_login_button();
		Thread.sleep(3000);
		
		////addmin_page
		Admin_page.admin_tab();
		Thread.sleep(3000);
		Admin_page.Click_addButton();
		Thread.sleep(3000);
		
		//Logout_page
		Logout_page.profil_Click();
		Thread.sleep(3000);
		Logout_page.logout_page();
		
		
		//Browser_Close
		Thread.sleep(3000);
		Driver_Class.browser_close();
	}
}
