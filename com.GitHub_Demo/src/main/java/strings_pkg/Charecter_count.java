package strings_pkg;

import java.util.Scanner;

public class Charecter_count 
{
	public static void main(String[] args) {
		/*String str="The Best World";
		int count=0;
		int length=str.length();
		for(int i=0;i<length;i++) 
		{
			if(str.charAt(i)>0) {
				count++;
				//System.out.println("Total Charecter Values"+count);
			}
			//System.out.println("Total Charecter Values"+count);
		}
		System.out.println("Total Charecter Values  "+count);*/

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The String Charecter");
		int count=0;
		String str ="";
		//str=sc.next();//space as not count in this method
		str=sc.nextLine();// Space as count in this method
		//System.out.println(ch);
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)>0) 
			{
				count++;
			}
		}
		System.out.println("Total Charecter Numbers "+count);
		sc.close();
	}

}
