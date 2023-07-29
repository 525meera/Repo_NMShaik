package loops_pkg;

public class Demo 
{
	public static void main(String[] args) 
	{
		int x=1;
		int sum=0;
		while(x<=10) 
		{
			//sum of x
			sum=sum+x;
			// Next iteration
			x++;
			//System.out.println(x);
		}
		System.out.println(sum);
	}
}
