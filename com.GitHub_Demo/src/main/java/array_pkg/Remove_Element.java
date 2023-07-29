package array_pkg;

public class Remove_Element 
{
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int del_Ele=20;
		for(int i=0;i<a.length;i++) //Search the index number
		{
			if(del_Ele==a[i]) //Check the value and search the index number equals or not
			{
				
				for(int j=i;j<a.length-1;j++) //This loop is the shift the value for remove the number
				{
					a[j]=a[j+1];//shift the numbers and index 
					
					//System.out.println(a[j]);
				}
			}	
		}
		for (int i=0;i<a.length-1;i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		/**/
		
	}

}
