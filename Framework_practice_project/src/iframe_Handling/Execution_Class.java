package iframe_Handling;


public class Execution_Class extends Based_Class
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		// Based Class
		Based_Class.driver_method();
		
		// NSE_WindowHandling
		NSE_WindowHandling.NSE_method();
		
		// NSE_iframe
		NSE_iframe.NSE_Iframe();
		NSE_iframe.Nse_element_Id();
		
		NSE_iframe.parent_cantent();
		NSE_iframe.sports_tab();
		
		Based_Class.browser_close();
	}
}
