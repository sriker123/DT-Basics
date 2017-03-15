package com.InputStream;
import java.io.*;

public class InputDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis = new FileInputStream("c://FileDemo.txt");//creating the file object 
			int avl = fis.available();//checking for the number of bytes the file occupied
			System.out.println("Number of bytes are "+avl);
			byte buff[] = new byte[avl];
			fis.read(buff,0,avl);//read the file from 0 to available 
			String str = new String(buff);
			System.out.println("The content of file "+str);
			fis.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception araised"+e);
		}
	}

}
