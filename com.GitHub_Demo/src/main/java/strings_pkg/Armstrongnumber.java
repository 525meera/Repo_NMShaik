package strings_pkg;

public class Armstrongnumber 
{
public static void main(String[] args) {
	int i=1,a,arm,n, temp;
	System.out.println("armstrong number");
	while(i<500)
	{
		n=i;
		arm=0;
		while(n>0)
		{
			a=n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(arm==i)
		{
			System.out.println(n);
			i++;
		}
	}
}
}
