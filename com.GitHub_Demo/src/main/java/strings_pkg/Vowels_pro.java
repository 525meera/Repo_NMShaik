package strings_pkg;

public class Vowels_pro 
{
	public static void main(String[] args) 
	{
		String str="Shaik Nagul Meera";
		char[] ch=str.toCharArray();
		int length=str.length();
		System.out.println("All Vowels Letters");
		for(int i=0;i<length;i++) 
		{
			if(ch[i]=='a') {
				System.out.print(ch[i]+" ");
			}
			else if(ch[i]=='i') {
				System.out.print(ch[i]+" ");

			}
			else if(ch[i]=='e') {
				System.out.print(ch[i]+" ");

			}
			else if(ch[i]=='o') {
				System.out.print(ch[i]+" ");

			}
			else if(ch[i]=='u') {
				System.out.print(ch[i]+" ");
			}
		}
	}

}
