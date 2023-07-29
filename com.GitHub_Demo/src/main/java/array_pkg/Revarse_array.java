package array_pkg;

public class Revarse_array 
{
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int length=a.length;
		  System.out.println("Before Given  array Numbers"); 
		  //System.out.println(length);
		  for(int i=0;i<length;i++) 
		  { 
		  System.out.print(a[i]+" ");
		  
		  }
		  System.out.println();
		  
		  System.out.println("After given array Numbers");
		for(int j=length-1;j>=0;j--) 
		{
			System.out.print(a[j]+" ");
		}
		
	}
}
