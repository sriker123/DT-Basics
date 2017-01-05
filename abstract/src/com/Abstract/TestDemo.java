package com.Abstract;

import com.Abstract.TestDemo;

public class TestDemo 
{
	public static void main (String args[])
	{
		AbstractDemo obj = new Sbi();
		AbstractDemo obj1 = new Icici();
		obj.Rateofinterest();
		obj1.Rateofinterest();
	}
}
