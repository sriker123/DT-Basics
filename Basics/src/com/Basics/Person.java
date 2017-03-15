package com.Basics;

public class Person
{
	int age;//instance
	public Person(int age)
	{
		//age=age;//at this line JVM doesn't know which side operand is local and instance, for better understanding see basics2 3rd point 
		this.age=age;// for better understanding of working of "this" see image this in basics folder 
	}
	public static void main(String[] args) 
	{
		Person obj = new Person(22);
		
		System.out.println(obj.age);
	}
}
