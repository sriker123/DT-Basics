package com.Demo1;

public class Demo1 
{
	public static void main(String a[])
	{	
		int a1[] = {1,2,3,4,5};
		/*for(int i=0;i<a1.length;i++)
		{
			System.out.println("The elements in the array are"+" "+a1[i]);
		}*/
		for(int str: a1)
		{
			System.out.println(str);
		}
	}
}
