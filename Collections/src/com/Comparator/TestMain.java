package com.Comparator;
import java.util.*;
import com.Comparator.*;
import java.io.*;
public class TestMain 
{
	public static void main(String args[])
	{
		ArrayList<ComparatorDemo> list = new ArrayList<ComparatorDemo>();
		ComparatorDemo obj=new ComparatorDemo(10, "bbc", 25);
		ComparatorDemo obj1=new ComparatorDemo(56, "ajj", 49);
		ComparatorDemo obj2=new ComparatorDemo(23, "all", 58);
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		System.out.println(" before sorting ");
		for(ComparatorDemo c:list)
		{
			System.out.println(c.toString());
		}
		Collections.sort(list,new SortByName());
		
		System.out.println(" after sorting age and name wise");
		for(ComparatorDemo c:list)
		{
			System.out.println(c.toString());
		}
	}

}
