package com.Demo1;

public class Demo1
{
	public static void main(String arg[])
	{
	
	String str="Hello";//str is an object by literal

	System.out.println(str);
	System.out.println("The length of Hello is:::"+str.length());
	//str.concat(" "+"Sriker");
	String str1 = str.concat(" "+"Sriker");//if this line is not included we cannot concatenate because of its immutable
	System.out.println("The String Before conatenation is "+str);
	System.out.println("The new String after concatenation is "+str1);//Delete comment labeling to print the concatenated value

	}


}
