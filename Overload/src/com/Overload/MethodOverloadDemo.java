package com.Overload;

public class MethodOverloadDemo {
	int add;
	void sum(int a,int b)
	{
		add = a+b;
		System.out.println("The sum of two parameters is:"+add);		 
	}
	void sum(int a,int b,int c)
	{
		add = a+b+c;
		System.out.println("The sum of two parameters is:"+add);		 
	}
	public static void main(String args[])
	{
		MethodOverloadDemo obj = new MethodOverloadDemo();
		obj.sum(10,10);
		obj.sum(10,10,10);
	}
}
