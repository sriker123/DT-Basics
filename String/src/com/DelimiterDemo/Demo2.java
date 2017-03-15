package com.DelimiterDemo;
import java.util.*;

public class Demo2 
{
	public static void main(String args[])
	{  
	     String input = "10 CCD 10 MC'D 20 DOMINOS";  

	     Scanner s = new Scanner(input).useDelimiter("\\s");  

	     System.out.println(s.nextInt());	//10
	  
	     System.out.println(s.next());  	//CCD

	     System.out.println(s.nextInt());  	//10

	     System.out.println(s.next());  	//MC'D

	     s.close();   //to end the connection between input and scanner
	}

}
