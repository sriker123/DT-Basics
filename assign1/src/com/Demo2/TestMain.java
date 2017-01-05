package com.Demo2;

import java.util.Scanner;
import com.Demo2.TestMain;

public class TestMain 
{
	{
		Demo3 s = new Demo3();
		System.out.println("Enter the choice to initiate the device");
		System.out.println("1.Computer");
		System.out.println("2. Smart phone");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int ch=scan.nextInt();
		
		switch(ch)
		{
		case 1:
			s.computers();
			//System.out.println("application initiated on computer");
			break;
		case 2:
			s.android();
			//System.out.println("application initiated on Android mobile");
			break;
		default :
			System.out.println("No devices available or try with correct choice");
			break;
		}	
		System.out.println("Initiation Succesfull check the device");
	}

}
