package loops_pkg;

public class Even_numbers_1
{
	public static void main(String[] args) {
		int n = 10;
		int x = 0;

		System.out.println("Using while loop statement");
		System.out.println("Print first 10 even Numbers: ");
		
		while(x<=10) 
		{
			System.out.println("  "+x);
			x= x+2;
		}

		System.out.println("Using for loop statement");
		System.out.println("Print second 10 Even Number:");
		
		for(int i=1;i<=n;i++) 
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}

		}
	}
}
