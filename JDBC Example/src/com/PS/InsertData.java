package com.PS;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData 
{
	public static void main(String[] args) {
		
	
	try
	{
	Class.forName("org.h2.Driver");
	Connection conn =DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","qwerty@123");//error is here
	PreparedStatement psmt = conn.prepareStatement("insert into student values(???)");//query is executed only once
	int sid;
	String sname,course;
	sid=1004;
	sname="SRIKER";
	course = "DT JAVA";
	
	/*Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Student ID");
	int sid = scan.nextInt();
	
	System.out.println("Enter the Student name");
	String sname = scan.next();
	
	System.out.println("Enter the Student course");
	String Course = scan.next();*/
	psmt.setInt(1,sid);
	psmt.setInt(2,sid);
	psmt.setInt(3,sid);
	
	int row_eff=psmt.executeUpdate();//EU returns int,, psmt is the reference to prepared statement
	
	System.out.println(row_eff+"row effected");//"row_eff "shows the changes in number of rows
	psmt.close();
	conn.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception araised"+e);
	}
	}
}

