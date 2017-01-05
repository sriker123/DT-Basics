package com.CA1;
import com.CA1.TestMain;

import java.util.Scanner;

public class TestMain
{	
	public static void main(String args[])
	{
		Demo s = new Demo();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int ch=scan.nextInt();
		System.out.println("Enter the choice to initiate the device");
		System.out.println("1.Computer /n 2. Smart phone");
		switch(ch)
		{
		case 1:
			s.Computer();
			//System.out.println("application initiated on computer");
			break;
		case 2:
			s.Android();
			//System.out.println("application initiated on Android mobile");
			break;
		default :
			System.out.println("No devices available or try with correct choice");
			break;
		}	
		System.out.println("Initiation Succesfull check the device");
	}
}
