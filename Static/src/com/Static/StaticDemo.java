package com.Static;

public class StaticDemo
{
	int roll_no;
	String name;
	static String college="JAIN";

StaticDemo(int r,String n)
{
	   roll_no = r;  
	   name    = n; 
}

public void Display() {
	// TODO Auto-generated method stub
	System.out.println(roll_no+" "+name+" "+college);
}




}
