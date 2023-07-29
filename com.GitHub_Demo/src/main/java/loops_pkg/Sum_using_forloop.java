package loops_pkg;

import java.util.Scanner;

public class Sum_using_forloop 
{
	public static void main(String[] args) {
		/*int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
			//System.out.println(sum);
		}
		System.out.println("Sum of Value = "+sum);*/
		
		int sum1=0,add;
		  Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers Addition");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		System.out.println("Enter the Number");
		add=sc.nextInt();
			sum1=sum1+add;
			//System.out.println(sum1);
		}
		System.out.println("All addition numbers is equls to "+sum1);
		sc.close();
	}
}
