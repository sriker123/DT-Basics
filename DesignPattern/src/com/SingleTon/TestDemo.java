package com.SingleTon;
import com.SingleTon.TestDemo;

public class TestDemo 
{
	public static void main(String args[])
	{
		STDemo2 obj=STDemo2.getSTDemo2();
		//STDemo obj=STDemo.getSTDemo();
		obj.Add(10,10);
	}

}
