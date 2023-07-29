package loops_pkg;

import java.util.Scanner;

public class Even_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ur number");
		int n=sc.nextInt();	

		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			sc.close();
		}
	}
}
