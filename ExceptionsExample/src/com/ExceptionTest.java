package com;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;

public class ExceptionTest {

	void cal() //throws Exception
	 {
		int c=10/0;
		//throw new Exception();
	 }
 	
  public static void main(String[] args) {
	  
	  ExceptionTest obj=new ExceptionTest();
	  try {
		obj.cal();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	 
}
}
