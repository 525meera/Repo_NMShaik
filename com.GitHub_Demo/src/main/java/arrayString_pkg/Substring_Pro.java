package arrayString_pkg;

public class Substring_Pro 
{
	public static void main(String[] args) 
	{
		String str="admin";
		char arr[]=str.toCharArray();
		String str1="in";
		int count=0;
		char arr2[]=str1.toCharArray();
	
		for(int i=0;i<arr.length;i++)
		{
			//count = 0;
			for(int j=i;j<arr2.length;j++)
			{
				if(arr[i+j]==arr2[j])
				{
					count++;
				}
				//System.out.println(count);
			}
		}
		if(count==arr2.length)
		{
			System.out.println("SubString");
		}
		else
		{
			System.out.println("Not a subString");
		}
	}
}
