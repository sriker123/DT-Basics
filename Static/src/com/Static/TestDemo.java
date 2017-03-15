package com.Static;
import com.Static.TestDemo;
public class TestDemo
{
 public static void main(String args[])
 {
	 StaticDemo s1 = new StaticDemo(123,"SRIKER");
	 StaticDemo s2 = new StaticDemo(456,"JYO RAM");
	 System.out.println(s1.toString());
	 System.out.println(s2.toString());
	 s1.Display();
	 s2.Display();
 }
}