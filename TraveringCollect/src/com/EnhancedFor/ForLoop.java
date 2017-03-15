package com.EnhancedFor;
import java.util.*;
public class ForLoop 
{
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add("SRIKER");
		list.add("MANU");
		list.add("HARI");
		list.add("BHASKAR");
		
		
		list.add(10);
		list.add(20);
		
		System.out.println("List Size :"+list.size());// To see the size of the Collection		
		
		
		System.out.println("Displaying the collection");
		for(Object o:list)//Enhanced for loop
		{
			if(o instanceof String)
			{
				String str = (String)o;//converting from object to string
				System.out.println("The elements with String DataType are"+" "+str);
			}
			if(o instanceof Integer)
			{
				Integer intr = (int)o;//converting from object to Integer 
				System.out.println("The elements with Interger DataType are"+" "+intr);
			}
		}
	}

}
