package loops_pkg;

public class Pascal_pro 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}
