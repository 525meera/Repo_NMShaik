package loops_pkg;

import java.util.Scanner;

public class Table_pro 
{
	static void table_method() 
	{
		int table;
		int temp=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table Number");
		int n=sc.nextInt();
		System.out.println("Tabale Formating");
		for(int i=1;i<=temp;i++	) {
			table=n*i;
			System.out.println(n+"*"+i+"="+table);
		}
		sc.close();
	}
	public static void main(String[] args) 
	{
		table_method();
	}
}
