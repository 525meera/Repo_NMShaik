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
	/*	Admin_page.admin_tab();
		Thread.sleep(3000);
		Admin_page.Click_addButton();
		Thread.sleep(3000);
		
		////PIM_Page
		PIM_Page.PIM_page();
		Thread.sleep(3000);
		PIM_Page.AddButton();
		Thread.sleep(3000);
		PIM_Page.FristName("Nagul");
		Thread.sleep(3000);
		PIM_Page.MiddleName("Meera");
		Thread.sleep(3000);
		PIM_Page.LastName("Shaik");
		Thread.sleep(3000);
		PIM_Page.Emp_Id("0123");
		Thread.sleep(3000);
		PIM_Page.SaveButton();
		Thread.sleep(10000);
		
		///My Info
		My_Info.MyInfo();
		Thread.sleep(5000);
		My_Info.FristName("Nagul");
		Thread.sleep(5000);
		My_Info.MiddleName("Nagul");
		Thread.sleep(5000);
		My_Info.LastName("Nagul");
		Thread.sleep(5000);
		My_Info.Save_Button();
		Thread.sleep(5000);*/
		
		////Performance_Page
		Performance_Page.Performance();
		Thread.sleep(5000);
		
		////Buzz_Page
		Buzz_Page.Buzz();
		Thread.sleep(3000);
		Buzz_Page.post_textbox("happy");
		Thread.sleep(3000);
		Buzz_Page.PostButton();
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
