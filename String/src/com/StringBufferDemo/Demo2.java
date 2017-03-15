package com.StringBufferDemo;

public class Demo2 
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Sriker ");
		sb.append("(Buffer) is from AP");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Sriker ");
		sb1.append("(Builder)is from AP");
		System.out.println(sb1);
		//http://www.javatpoint.com/difference-between-stringbuffer-and-stringbuilder
		//for efficiency check visit the URL provide @ Line 14  
	}
}

