package com.ASS;

public class A 
{
	public void display() { 
		System.out.println("A"); 
		} 
		} 
		class B extends A { 
		public void display() { 
		System.out.println("B"); 
		} 
		} 
		class Dynamic_dispatch { 
		public static void main(String args[]) 
		{ 
		A obj1 = new A(); 
		B obj2 = new B(); 
		A r; 
		r = obj1; 
		r.display(); 
		r = obj2; 
		r.display(); 
		}
} 
