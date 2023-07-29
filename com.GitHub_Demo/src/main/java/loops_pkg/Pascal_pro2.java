package loops_pkg;

public class Pascal_pro2 
{
	public static void main(String[] args) 
	{
		int n=5;
		int temp;
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			temp=1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(temp+" ");
				temp=temp*(i-k)/k;
				
				
			}
			System.out.println();
		}
		
	}
}
