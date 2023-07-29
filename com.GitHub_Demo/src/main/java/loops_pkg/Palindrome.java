package loops_pkg;

public class Palindrome 
{
	void polindrome()
	{
		int rev,sum=0,temp;
		int n=121;
		temp=n;
		while(temp>0) {
			rev=temp%10;
			sum=(sum*10)+rev;
			temp=temp/10;
			//System.out.print(sum);
		}
		if(n==sum) {
			System.out.print("The given numbers = "+ n + "  is palindrome number");	
		}
		else
		{
			System.out.print("The given numbers = "+ n + "  is not palindrome number");
		}
	}
	public static void main(String[] args) 
	{
		Palindrome p=new Palindrome();
		p.polindrome();
	}
}
