package array_pkg;

public class Duplicate_Numbers 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,2,4,5,4,7};
		System.out.println("Duplicate Numbers");
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
				{
					//System.out.println("Duplicate Values "+arr[i]);
					System.out.println(arr[i]);
				}
				//System.out.println(arr[i]);
			}
		}
		
	}
}
