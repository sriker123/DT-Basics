package com.Enum;

import com.Enum.Enum.Mycolor;

public class TestDemo 
{
	public static void main(String args[])
	{
		System.out.println(Mycolor.Red);//TO print the constant of Enumeration
		Mycolor ob = Mycolor.Green ;//Create an Object
		System.out.println("The output when created an object is::"+ob);//prints the constant specified in the object
		
		System.out.println("Member of ordinal values::"+ob.ordinal());//gives number to constant in enumerator 
		
		
		for(Mycolor ob1:Mycolor.values())//Print all the members of the enumeration
		{
			System.out.println("Enumeration Mumber:"+ob1+" "+"Ordinal value::"+ob1.ordinal());
		}
}
}
