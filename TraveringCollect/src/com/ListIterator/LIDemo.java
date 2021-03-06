package com.ListIterator;

import java.util.*;

public class LIDemo
{
	public static void main(String args[])
	{
		ArrayList l = new ArrayList();
		l.add("SRIKER");
		l.add("HARI");
		l.add("MANU");
		l.add("BHASKAR");
		
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println("The List Size before ListIteration is"+" "+l.size());
		System.out.println("element at 2nd position: "+l.get(2));
		System.out.println("Displaying Collection/Traversing collection in Forward");
		ListIterator litr = l.listIterator();
		

		while(litr.hasNext())//hasNext() is a predefined method in java.util which returns boolean value
						  //This method will tell us whether the element is available in current Index or not
		{
			Object o = litr.next();
			if (o instanceof String)//String is a inbuilt class
			{
				String str = (String) o;
				System.out.println(str);
				if(str.equals("BHASKAR"))
				{
					litr.remove();
				}
			}
			if (o instanceof Integer)
			{
				Integer intr = (int) o;
				System.out.println(intr);
				if (intr.equals(10))
				{
					litr.remove();
				}
			}	
		}
		System.out.println("The List Size After ListIteration is"+" "+l.size());
		System.out.println("The List after ListIteration is"+" "+l);	
	
		System.out.println("traversing the collection Backward.....");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}
