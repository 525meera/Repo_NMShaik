package strings_basics;

public class String_Methods 
{
	public static void main(String[] args) 
	{
		String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println("Returns the char value at the 4th index:- "+ch);  

		String length="java";
		System.out.println("Total Length :- "+length.length());

		String s11="javatpoint";  
		System.out.println("Return Substring Start and End :-  "+s11.substring(2,5));//returns va  
		System.out.println("Return Substring Start:- "+s11.substring(2));//returns vatpoint 

		String contains="what do you know about me";  
		System.out.println("True or false after matching the sequence of char value :- "+contains.contains("do you know"));  
		System.out.println("True or false after matching the sequence of char value :- "+contains.contains("about"));  
		System.out.println("True or false after matching the sequence of char value :- "+contains.contains("hello"));  

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

		String str="How are";
		System.out.println(str.concat(" you"));
		str=str.concat(" Am Good");
		System.out.println("Concatenates the specified string :- "+str);

		String replace="javatpoint is a very good website";  
		String replaceString=replace.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println("Replaces all occurrences of :-  "+replaceString);


		String sto="how are you";
		String [] split=sto.split(" ");
		for(String word:split)
		{
			System.out.print(word);
		}
		System.out.println();

		String string="how are you am Good";
		String [] split2=string.split(" ", 2);
		for(String word2:split2)
		{
			System.out.print(word2);
		}
		String string4 = "This is indexOf method";         
		// Passing Substring    
		int index = string4.indexOf("m"); //Returns the index of this substring  
		System.out.println("index of substring :- "+index);      

		String string1 = "This is indexOf method";         
		// Passing substring and index  
		int index1 = string1.indexOf("m", 10); //Returns the index of this substring  
		System.out.println("index of substring :- "+index1);  
		index1 = string1.indexOf("m", 20); // It returns -1 if substring does not found  
		System.out.println("index of substring :-  "+index1);    
		
		String string3 = "This is indexOf method";         
        // Passing char and index from  
        int index2 = string3.indexOf('e', 12); //Returns the index of this char  
        System.out.println("Returns the specified substring index:-  "+index2); 
        
        
        String lower="HOW ARE YOU";
        System.out.println(lower.toLowerCase());
        
        String upper="how are you";
        System.out.println(upper.toUpperCase());
        
        String spaceRemove ="  hello java string     ";    
        System.out.println(spaceRemove.length());    
       
        System.out.println(spaceRemove); //Without trim()    
        
        String tr = spaceRemove.trim();    
        System.out.println(tr.length());    
        System.out.println(tr); //With trim()   
        
        
        String isBlank=" ";
        System.out.println(isBlank.isBlank());

	}

}
