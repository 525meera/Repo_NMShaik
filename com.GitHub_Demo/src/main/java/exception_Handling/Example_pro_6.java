package exception_Handling;

public class Example_pro_6 
{
	//Methods Static int values to return 
		static int method1()
		{
			try
			{
				
				return 10;
			}
			catch (Exception e) 
			{
				return 20;
			}
			finally
			{
				
				return 30;
			}
		}
		
		//Method2  Static int values to return
		 static int method2()
		    {
		        int i = 1;
		         
		        try
		        {
		            i = i/0;
		             
		            return i++;
		        }
		        catch (Exception e) 
		        {
		            return i++;
		        }
		        finally
		        {
		            return i++;
		        }
		    }
		 
		 //static String anyMethod()
		 static String method3()
		    {
		        String s = "ZERO";
		         
		        try
		        {
		            s = s + "ONE";
		             
		            return s;
		        }
		        catch (Exception e) 
		        {
		            s = s + "TWO";
		             
		            return s;
		        }
		        finally
		        {
		            s = s + "THREE";
		             
		            return s;
		        }
		    }
		//static String anyMethod()
		 static String method4()
		    {
		        String s = "ONE";
		         
		        try
		        {
		            s = s + "TWO";
		             
		            return s;
		        }
		        catch (Exception e) 
		        {
		            s = s + "THREE";
		             
		            return s;
		        }
		        finally
		        {
		            s = s + "FOUR";
		             
		            return s;
		        }
		    }
		public static void main(String[] args) 
		{   
//			System.out.println(method1());
//			System.out.println(method2());
//			System.out.println(method3());
			System.out.println(method4());
		}
}
