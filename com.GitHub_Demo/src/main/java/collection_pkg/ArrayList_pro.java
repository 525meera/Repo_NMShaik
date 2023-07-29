package collection_pkg;

import java.util.ArrayList;

public class ArrayList_pro 
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//System.out.println(list);
		list.add("shaik");
		list.add("meera");
		System.out.println("Stating String List Name:");
		System.out.println(list);
		list.add(1, "Nagul");
		System.out.println();
		System.out.println("Adding String List Name");
		System.out.println(list);
		
		ArrayList<String>list1=new ArrayList<String>();
		list.add("Saleem");
		list.addAll(list1);
		System.out.println(list);
	}
}
