package com.Demo1;

import java.util.*;

public class Demo1 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Enter the Second number number");
		int num2 = scan.nextInt();
		int res=num1+num2;
		System.out.println(res);*/
		System.out.println("Enter the student name to fetch details");
		String s = scan.next();
		if(s.equalsIgnoreCase("SRIKER"))
		{	
			System.out.println("Fetch Successful and Details found");
			System.out.println("SRIKER");
			System.out.println("12BE6EC067");
			System.out.println("JAIN University");
			System.out.println("Bangalore");
		}
		else if(s.equalsIgnoreCase("JYO"))
		{
			System.out.println("Fetch Successful");
			System.out.println("12BE6EC052");
			System.out.println("JAIN University");
			System.out.println("Bangalore");
		}
		else if(s.equalsIgnoreCase("HARI"))
		{
			System.out.println("Fetch Successful");
			System.out.println("1VI12CS118");
			System.out.println("VTU");
			System.out.println("Bangalore");
		}
		else
		{
			System.out.println("Fetch UnSuccessful, try again with proper name");			
		}
		
	}

	
		
	}