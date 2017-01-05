package com.ListDemo;
import java.util.*;

public class ArraylistDemo 
{
	public static void main(String args[])
	{
		ArrayList<String>list = new ArrayList <String>();//ArrayList is the Pre-defined class name in "java.util". "<String>" it is the generic way of creating an object.
		list.add("SRIKER");//add is a keyword to add the elements to the collection in java.util package
		list.add("HARI");
		list.add("MANU");
		list.add(3,"hi");
		String str=(String)list.get(1);
		list.add(2,"BHASKAR");
		System.out.println("Second Index Object:"+str);
		
		
		/*list.addAll(90,list);
		list.addAll(20,list);
		System.out.println("List Size :"+list.size());// To see the size of the Collection
		
		String str1=(String)list.get(1);		//To get the Specific object from an index.
		System.out.println("Second Index Object:"+str1);*/
		//System.out.println(list);
		System.out.println(list.size());
		ListIterator litr = list.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
			}

}
