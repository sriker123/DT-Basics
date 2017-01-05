package com.Inheritance;
import com.Inheritance.TestDemo;

public class TestDemo 
{
	public static void main(String args[])
	{
		InheritanceDemo o = new InheritanceDemo();
		InheritanceDemo o1 = new St2();
		InheritanceDemo o2 = new Student();
		InheritanceDemo o3 = new St3();
		System.out.println(o.stname());			
		System.out.println(o1.stname());			
		System.out.println(o2.stname());			
		System.out.println(o3.stname());			
	}

}
