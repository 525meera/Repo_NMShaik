package strings_pkg;

public class Palindrome_string 
{
	public static void main(String[] args) {
		// length(),charAt(),equals()

		String str="madam";
		String rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) 
		{
			System.out.println("Palindrome String");

		}
		else 
		{
			System.out.println("Not A Palindrome String");
		}
	}
}
