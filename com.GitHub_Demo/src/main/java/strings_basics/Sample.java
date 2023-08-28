package strings_basics;

public class Sample 
{
	public static void main(String[] args) 
	{

		char ch[]= {'j','a','v','a'};
		String str="java programming Hello";
		String st="Hello";
		String s=new String(ch);
		System.out.println("Object types :-  "+s);

		String s1=new String(s);
		String s2=new String(ch);
		String s3=new String("Single");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("Starts With Boolean type  :- "+s.startsWith("java"));//true
		System.out.println("Ends With Boolean type :- "+str.endsWith("Hello"));//ture
		System.out.println("Total length :- "+s.length());// length
		System.out.println("true or false after matching the sequence of char value:- "+s.contains(str));//false
		System.out.println("Given string:- "+s.toString());// given string
		System.out.println(""+s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.isEmpty());//boolean type false
		System.out.println(s.isBlank());//boolean type false
		System.out.println(s.substring(2));//starting word
		System.out.println(s.substring(1,4));//begin index , endindex
		System.out.println(s.indexOf('a'));// char string
		System.out.println(s.lastIndexOf('a'));//display the last index number
		System.out.println(s.equals(str));//true
		System.out.println(s.concat(" "+str));// adding the two string variables
		System.out.println();

		String sto="how are you";
		String [] split=sto.split(" ");
		for(String word:split)
		{
			System.out.print("Space remove :- "+word);
		}
		System.out.println();

		String string="how are you";
		String [] split2=string.split(" ", 1);
		for(String word2:split2)
		{
			System.out.print(word2);
		}
		System.out.println();
		System.out.println(s.repeat(3));
		System.out.println(str.replace('a', 'k'));
		System.out.println(str.replace(str, st));
		System.out.println(str.replaceFirst(str, st));
		





	}
}
