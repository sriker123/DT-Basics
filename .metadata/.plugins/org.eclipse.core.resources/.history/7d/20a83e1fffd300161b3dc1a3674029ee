package com.LinkedList;
import java.util.*;

public class LLDemo 
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		//1Stack list = new Stack();
		//Vector list = new Vector();
		list.add("SRIKER");
		list.add("HARI");
		list.add("SRIKER");
		list.add("MANU");
		//System.out.println(list);
		list.add(2,"BHASKAR");
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(2,30);
		ListIterator litr = list.listIterator();
		ListIterator litr1 = list1.listIterator();
		System.out.println("traversing in forwrad");
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("traversing in backward");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		while(litr1.hasNext())
		{
			System.out.println(litr1.next());
		}
		System.out.println("traversing in backward");
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
		System.out.println("The List size is::"+list.size());
		System.out.println("The List1 size is::"+list1.size());
		int res=list.size()+list1.size();
		System.out.println("Thr total size of list is"+" "+res);
	}
	
}
