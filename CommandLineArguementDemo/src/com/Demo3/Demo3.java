package com.Demo3;

public class Demo3 
{
	public static void main(String a[])
	{
		String s = "300";//first assign the number you want in the form of character
		String s1 = "200";
		String s3 = "500";
		int res;
		int num1 = Integer.parseInt(s);//parseInt() is a method that converts string argument to Integer
		int num2 = Integer.parseInt(s1);
		int num3 = Integer.parseInt(s3);
		res = num1+num2+num3;
		System.out.println("The inputs are as follows:::"+s+","+" "+s1+","+" "+s3);
		System.out.println("The result of input is "+res);
		
		}
}
