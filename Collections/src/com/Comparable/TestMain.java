package com.Comparable;
import java.util.*;
import com.Comparable.TestMain;
public class TestMain 
{
	public static void main(String arg[])
	{
		ArrayList <Student> list = new ArrayList<Student>();
		list.add(new Student(101,20,"SRIKER"));
		list.add(new Student(102,19,"HARI"));
		list.add(new Student(103,21,"MANU"));
		Collections.sort(list);
		
		for(Student o:list)
		{
			System.out.println(o.Sid+" "+o.S_age+" "+o.S_name);
		}
	}

}
