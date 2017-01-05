package com.Comparable;

public class Student implements Comparable <Student>   //comaparable is an inbuit interface
{
	int Sid;
	int S_age;
	String S_name;
	 Student (int Sid, int S_age, String S_name)
	{
		this.S_age=S_age;
		this.S_name=S_name;
		this.Sid=Sid;
	}
	
	public int compareTo(Student o)
	{
		if(S_age==o.S_age)
		{
		return 0;
		
		}
		else if(S_age>o.S_age)
		{
		return 1;
		
		}
		else
		{
		return -1;
		
		}
		
	}
	

}
