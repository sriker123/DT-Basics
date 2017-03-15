package com.Iterator;

import java.util.*;

public class IteratorDemo
{
	public static void main(String[] args) 
	{
		
		//Collection object using Arraylist
		ArrayList list=new ArrayList();
		
		//Here we can save the string values with in Collection.
		list.add("SRIKER");
		list.add("HARI");
		list.add("MANU");
		
		//Adding Integer object
		list.add(10);
		list.add(20);
		System.out.println("List Size :"+list.size());
		
		System.out.println("Displaying Collection");
		
		Iterator itr=list.iterator();
		/*while(itr.hasNext())    //other way to print the next elements in iteration
		{
			System.out.println(itr.next());
		}	*/	
		
		while(itr.hasNext())//hasNext() is a method which returns a boolean values true or false
							//This method will tell us whether element is available in that current index
		{			
			Object o=itr.next(); //next() method will return an object in the current index
			
			if(o instanceof String)
			{
				
				String str=(String)o;//Converting from Object to String.
				System.out.println(str);//printing the Strings
				
				if(str.equals("HARI"))
				{
					itr.remove();
				}
				if(str.equals("MANU"))
				{
					itr.remove();
				}
				
			}
			if(o instanceof Integer)
			{
				Integer intr=(Integer)o;
				System.out.println(intr);//Printing the Integers
				if(intr.equals(10))
				{
					itr.remove();
				}
			}
			
		}
	
		System.out.println("List Size after Iteration:"+list.size());
		System.out.println("After Iterator:"+list);
		
	}

}

