package com.StringclassExample;

public class TestString {
public static void main(String[] args) {
	
	
	
	StringBuffer str2=new StringBuffer("hi");
	StringBuffer str1=new StringBuffer("hi hello");
	StringBuffer str3=str1.append(str2);
	System.out.println(" haschcode of str1"+" " +str1.hashCode());
	System.out.println(" hascode of string str2"+" "+str2.hashCode());
	System.out.println(" concation output :::"+str3+" "+str3.hashCode());
}
	
	
}
