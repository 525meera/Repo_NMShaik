package loops_pkg;

public class Reverse_number 
{
public static void main(String[] args) {
	
		int rev,sum=0,temp;
		int n=2345;
		temp=n;
		while(temp>0) {
			rev=temp%10;
			sum=(sum*10)+rev;
			temp=temp/10; 
			//System.out.print(sum);
		}
		System.out.print("The given number "+ n + " is = " + sum);
	}
}

