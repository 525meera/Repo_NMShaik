package strings_pkg;

public class Space_remove 
{
	public static void main(String[] args) {
		String str="The Best world";
		String space_rem = "";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch!=' ') 
			{
				space_rem=space_rem+ch;
			}
		}
		System.out.println(space_rem);


		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Charecters");
		/*String space_rem="";
		char ch;
		String	str=sc.nextLine();
		for(int i=0;i<str.length();i++) 
		{

			ch=str.charAt(i);

			//System.out.print(ch);

			if(ch!=' ') 
			{
				space_rem=space_rem+ch;

			}
		}
		System.out.println(space_rem);*/



		/*	String str=sc.nextLine();
		char arr [] = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				System.out.print(arr[i]);

			}

		}*/


	}
}
