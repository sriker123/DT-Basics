package com.Demo2;

public class Demo2
{
	public static void main(String a[])
	{
		
		String a1[] = {"SRIKER","HARI","MANU"};
		/*for(String i=0;i<a1.length;i++)
		{
			System.out.println("The elements in the array are"+" "+a1[i]);
		}*/
		for(String str: a1)
		{
			System.out.println("The Names in the array are"+" "+str);
		}

	}

}
