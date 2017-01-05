package com.One;

import java.util.Scanner;

class Demo implements One
{
public void Display()
{
	System.out.println("Enter the choice to initiate the device");
	System.out.println("1.Computer");
	System.out.println("2.Smart phone");

	Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	int ch=a;
	
	
	switch(ch)
	{
		case 1:		
		System.out.println("application initiated on computer");
		//System.out.println("Do yo want to continue press "+ch1); 
		break;
		
		case 2:		
		System.out.println("application initiated on Android mobile");
		//System.out.println("Do yo want to continue press "+ch1); 
		break;
		
		default:
			System.out.println("Devices are not available and try again with  ");
		break;
	}
	//for(int i=0;i<ch;i++)
	System.out.println("the before choice is "+ch);
	System.out.println("Press Yes to Continue");
	System.out.println("press no to terminate");
	Scanner scan1 = new Scanner(System.in);
	String b = scan1.next();
	
	
	if(b.equalsIgnoreCase("Yes"))
	{	
		System.out.println("1.Computer");
		System.out.println("2.Smart phone");	
		int c = scan1.nextInt();
		if(ch!=c)
		{
			Display();
		}
		if(ch==c)
		{
			System.out.println("Device is already initiated");
			//System.out.println("Select other device to continue");
			if(ch==1)
			{
				ch++;
				System.out.println("Select "+ch+" to initiate");
				Display();
			}
			else
			{
				ch--;
				System.out.println("Select"+ch+" to initiate");
				Display();
			}
		}
		
	}
	 if(b.equalsIgnoreCase("No"))
	{
		System.out.println("Thank you");
	}
	}
	

}

