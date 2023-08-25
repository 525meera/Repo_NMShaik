package selenium_Waits;

public class Demo_cyclos_Excute extends Demo_cyclos_Based
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		Demo_cyclos_Based.browser_Launch();
		
//		Demo_cyclos_Based.implicitywait();
//		Demo_Implicity_Wait.enterUserName();
		
		//Demo_cyclos_Based.explicitiwait();
		Demo_cyclos_Based.explicitiwait(Demo_Explicity_Wait.ele_userName(),20);
		
//		Demo_cyclos_Based.fleuntwait();
//		Demo_Fleunt_Wait.fleuntwait();
	}
}
