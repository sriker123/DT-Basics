package com.MultipleInterface;

public class StName implements MultiInt,MultiInt2
{

	public void St_age(int i)
	{
		System.out.println("The Student Name is :::"+i);
		
	}

	
	@Override
	public void Stname1(String j)
	{
		System.out.println("The Student Name is :::"+j);
	}
	
	public static void main(String args[])  //Remove main in this class and exclude comments in other class
	{
		StName s = new StName();
		s.Stname1("SRIKER");
		s.St_age(21);
		
	}

	

	
	
}
