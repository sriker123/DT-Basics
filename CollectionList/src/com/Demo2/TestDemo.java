package com.Demo2;
import java.util.*;
import com.Demo2.TestDemo;
public class TestDemo 
{
	public static void main(String args[])
	{
		UserDefined s1 = new UserDefined(100,"SRIEKR",22);
		UserDefined s2 = new UserDefined(101,"HARI",22);
		UserDefined s3 = new UserDefined(102,"MANU",22);
		ArrayList list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		ListIterator litr = list.listIterator();
		System.out.println("Forward traversing");
		while(litr.hasNext())
		{
			
			System.out.println(litr.next());
		}
		
		
	}

}
