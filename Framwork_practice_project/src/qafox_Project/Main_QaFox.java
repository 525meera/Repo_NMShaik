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

		////Home Page
		Home_page_QaFox.continue_button();

		Thread.sleep(3000);

		Home_page_QaFox.my_Account();

		Thread.sleep(3000);

		Home_page_QaFox.click_login();

		Thread.sleep(3000);
		
		////Login_Page
		Login_page_Qafox.userName("sonusallu143@gmail.com");

		Thread.sleep(3000);

		Login_page_Qafox.possward("N@gul786");

		Thread.sleep(3000);

		Login_page_Qafox.login_button();

		Thread.sleep(3000);

		///Desktop_page

		Desktop_Page.select_navbar_Desktop();

		Thread.sleep(3000);

		Desktop_Page.seeAll_desktop_click();

		Thread.sleep(3000);

		Desktop_Page.list_group();

		Thread.sleep(3000);

		Desktop_Page.click_laptop_product();

		Thread.sleep(3000);

		Desktop_Page.click_components_product();

		Thread.sleep(3000);

		Desktop_Page.click_tablets_product();

		Thread.sleep(3000);

		Desktop_Page.click_software_products();

		Thread.sleep(3000);

		Desktop_Page.click_phones_products();

		Thread.sleep(3000);

		Desktop_Page.click_cameras_products();

		Thread.sleep(3000);

		Desktop_Page.click_mp3_playes();

		Thread.sleep(3000); 

		//Laptop&noteBook_Page

		Laptops_NoteBook_Navbar.laptap_NoteBooks();

		Thread.sleep(3000); 

		Laptops_NoteBook_Navbar.showallLaptops();

		Thread.sleep(3000); 

		Laptops_NoteBook_Navbar.click_Image();

		Thread.sleep(3000); 

		Laptops_NoteBook_Navbar.addtoCard();

		Thread.sleep(3000); 

		////Components _Page

		Components_page.components_page();

		Thread.sleep(3000); 

		Components_page.all_components();

		Thread.sleep(3000);
		
		////Tablets
		Tablets_page.tablets();
		
		Thread.sleep(3000);
		
		Tablets_page.addcard();
		
		Thread.sleep(3000);
		
		///Software_page
		
		Software_page.saftware();
		
		Thread.sleep(3000);
		
		Software_page.continues();
		
		Thread.sleep(3000);

		////logout_page
		Logout_page.my_Account_click();

		Thread.sleep(3000);

		Logout_page.click_Logout();

		driver.close();

	}

}
