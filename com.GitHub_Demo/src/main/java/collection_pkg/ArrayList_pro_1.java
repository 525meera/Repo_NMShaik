package collection_pkg;

import java.util.ArrayList;

public class ArrayList_pro_1 
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		System.out.println("Given List "+list);
		
		System.out.println("Returnnig element: "+list.get(0));
		list.set(0, "Orenge");
		String str = " ";
		for(int i=0;i<str.length();i++) {
			System.out.println(list);
			
		}
	}

}
