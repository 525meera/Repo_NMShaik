package selenium_Waits;

public class Execute_class extends Base_Class
{
	public static void main(String[] args) throws InterruptedException 
	{


		Base_Class.	browser_Launch();
		//Base_Class.implicitywait();
		//Impilciti_wait.impliciti_wait();

		Base_Class.explicitiwait();
		Expliciti_wait.expliciti_wait();

		//Base_Class.fleuntwait();
		//Fleunt_wait.fleunt_wait();
	}
}
