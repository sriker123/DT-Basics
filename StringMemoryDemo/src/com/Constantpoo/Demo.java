package com.Constantpoo;

public class Demo 
{
	public static void main(String[] args) 
	{
		String str2="hi";
		String str1=new String("hi");//to Understand the concept of memory allocation between literal and tradition creation of Object
		System.out.println(" haschcode of string str1"+" " +str1.hashCode());
		System.out.println(" hascode of string str2"+" "+str2.hashCode());
	}
}
