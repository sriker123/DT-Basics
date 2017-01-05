package com.SingleTon;

public class STDemo2
{
	private static STDemo2 obj; //no comment
	int add;
	private STDemo2()
	{}
	
	public static STDemo2 getSTDemo2()   //no comments from here 
	{
		  if (obj == null)
		  {  
		      synchronized(STDemo2.class) //here
		      {  
		        if (obj == null)
		        {  
		            obj = new STDemo2();//instance will be created at request time  
		        }  
		      }              
		    }
		  return obj;
	}
	public void Add(int a, int b)
	{
		add = a+b;
		System.out.println("The result of addition = "+add);
	}

}   //http://www.javatpoint.com/singleton-design-pattern-in-java
