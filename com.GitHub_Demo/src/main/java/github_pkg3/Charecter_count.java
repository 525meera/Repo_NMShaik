package github_pkg3;

import java.util.Scanner;

public class Charecter_count 
{
	public static void main(String[] args) {
		Scanner
		sc =new Scanner(System.in);
		System.out.println("Enter The String Charecter");
		int count=0;
		String str ="";
		//str=sc.next();//space as not count in this method
		str=sc.nextLine();// Space as count in this method
		//System.out.println(ch);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>0) {
				count++;
			}
		}
		System.out.println("Total Charecter Numbers "+count);
		sc.close();
	}

}

