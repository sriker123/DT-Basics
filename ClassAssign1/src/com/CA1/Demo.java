package com.CA1;

import java.util.Scanner;

public class Demo implements Devices
{	
	public void Android() 
	{
		public void Display()
		{
			Scanner scan = new Scanner(System.in);
			int a=scan.nextInt();
			int ch;
			System.out.println("Enter the choice to initiate the device");
			System.out.println("1.Computer /n 2. Smart phone");
			switch(a)
			{
			case 1:
				
				System.out.println("application initiated on computer");
				break;
			case 2:
				
				System.out.println("application initiated on Android mobile");
				break;
			default :
				System.out.println("No devices available or try with correct choice");
				break;
			}
		
		}	
	}




}
