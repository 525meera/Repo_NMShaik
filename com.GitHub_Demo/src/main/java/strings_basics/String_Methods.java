package strings_basics;

public class String_Methods 
{
	public static void main(String[] args) 
	{
		/*String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println("Returns the char value at the 4th index:- "+ch);  

		String length="java";
		System.out.println("Total Length :- "+length.length());

		String s1="javatpoint";  
		System.out.println("Return Substring Start and End :-  "+s1.substring(2,5));//returns va  
		System.out.println("Return Substring Start:- "+s1.substring(2));//returns vatpoint 

		String contains="what do you know about me";  
		System.out.println("True or false after matching the sequence of char value :- "+contains.contains("do you know"));  
		System.out.println("True or false after matching the sequence of char value :- "+contains.contains("about"));  
		System.out.println("True or false after matching the sequence of char value :- "+contains.contains("hello"));  */
		
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println("content and case :- "+s1.equals(s2));//true because content and case is same  
		System.out.println("content and case :- "+s1.equals(s3));//false because case is not same  
		System.out.println("content and case :- "+s1.equals(s4));//false because content is not same 
		
		String isEmpty="";  
		String isData="javatpoint";  
		System.out.println("It checks if string is empty:- "+isEmpty.isEmpty());  
		System.out.println("It checks if string is empty:- "+isData.isEmpty());  

	}

}
