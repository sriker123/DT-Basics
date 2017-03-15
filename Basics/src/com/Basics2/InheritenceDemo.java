package com.Basics2;

public class InheritenceDemo 
{
	public InheritenceDemo()
	{
		//super(); called default or implicitly
		//IIB;called default or implicitly
	}
	public InheritenceDemo(int a)
	{
		
	}
	//IIB
	{
		System.out.println("IIB_1 is being called******");
	}
	//IIB
		{
			System.out.println("IIB_2 is being called******");
		}
	public static void main(String[] args)
	{
		InheritenceDemo p1 = new InheritenceDemo();
		System.out.println("======================");
		InheritenceDemo p2 = new InheritenceDemo(25);
	}
}
