package com.Enum;

public class Enum 
{
public enum Mycolor{Red,Green,Blue,White}
public static void main(String args[])
{
	System.out.println(Mycolor.Red);
	Mycolor ob = Mycolor.Blue;
	System.out.println(ob);
	System.out.println("Member of ordinal values::"+ob.ordinal());
	for(Mycolor ob1:Mycolor.values())
	{
		System.out.println("Enumeration number:"+ob1+" "+"Ordinal value::"+ob1.ordinal());
	}
}
}
