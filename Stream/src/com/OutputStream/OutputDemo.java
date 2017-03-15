package com.OutputStream;

import java.io.FileOutputStream;

public class OutputDemo
{	public static void main(String[] args) 
	{
	try
	{
		FileOutputStream fos = new FileOutputStream("c:\\OutputDemo.txt");
		String str = "Hi this is my content";
		for(int i=0;i<str.length();i++)
		{
		fos.write(str.charAt(i));
		}
		System.out.println("content is written to the file");
		fos.close();
	}
		catch(Exception e)
		{
			System.out.println("Exception araised"+e);
		}
	
	}
}


