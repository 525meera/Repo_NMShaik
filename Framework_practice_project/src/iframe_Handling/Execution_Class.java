package iframe_Handling;



public class Execution_Class extends Based_Class
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Based Class
		Based_Class.driver_method();
		
		NSE_TabPage.NSE_method();
		
		Based_Class.browser_close();
	}
}
