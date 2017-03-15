package com.RegexDemo;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Demo 
{
	public static void main(String[] args) {
		//one way
		/*Pattern p = Pattern.compile("SRI");
		Matcher m = p.matcher("SRI");
		Boolean b = m.matches();
		System.out.println(b);*/
		//second way
		//Boolean b = Pattern.compile("SRI").matcher("SR").matches();
		//3rd way
		Boolean b = Pattern.matches("SRI", "SRI");
		if(b==true)
		{
			System.out.println("The full name is SRIKER");
		}
		else {
			System.out.println("the Input is mismatching with the ReGex");
		}
		
				
	}
}
