package com.Set;

import java.util.*;

public class HashSetDemo
{
	public static void main(String args[])
	{
	//HashSet list = new HashSet();//order is not maintained
	//LinkedHashSet list = new LinkedHashSet();//insertion is important
	/* TreeSet<String> list = new TreeSet<String>();
	
	list.add("SRIKER");
	list.add("HARI");
	list.add("SRIKER");
	list.add("MANU");*/
	TreeSet<Integer> list1 = new TreeSet<Integer>();
	list1.add(200);
	list1.add(100);//the output will sort randomly and exclude repeated string

	
	Iterator itr = list1.iterator();
	//Iterator itr = list.iterator();
	//System.out.println(list1);
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	/*System.out.println("traversing in backward");
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}*/
	//System.out.println("The List size is::"+list.size());
	System.out.println("The List size is::"+list1.size());
}
}