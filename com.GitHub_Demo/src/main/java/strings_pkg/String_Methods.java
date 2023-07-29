package strings_pkg;

public class String_Methods 
{
	 public static void main(String[] args) 
     {
    	 
    	 String str="Meera";
    	 //length();
    	// System.out.println("no.of character are : "+str.length());
    	
    	 
    	 System.out.println("String = "+str);
    	
         int length= str.length();
    	 System.out.println("no.of character are : "+length);
    	 System.out.println();
    	 
    	 //char at();
    	 System.out.println("char at words : "+str.charAt(4));
    	 System.out.println();
    	 
    	 //indexof();   
    	//System.out.println("index value : +str.indexOf('s'));
    	 
//    	 int index_value= str.indexOf('h');
//    	 System.out.println("index value : "+index_value);
//    	  System.out.println();
    	 //UpperCase
    	 
    	// System.out.println("UpperCase words : "+str.toUpperCase());
    	 String upperCase =str.toUpperCase();
    	 System.out.println("UpperCase words : "+upperCase); 
    	 
    	 String str1="ZTOH";
    	 System.out.println("UpperCase words : "+str1.toLowerCase());
    	 
    	 
	
    }
}
