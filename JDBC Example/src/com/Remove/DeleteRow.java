package com.Remove;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRow 
{

	public static void main(String[] args) {
		
	
	try
	{
	Class.forName("org.h2.Driver");
	Connection conn =DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","qwerty@123");//error is here fill the quoted
	PreparedStatement psmt = conn.prepareStatement("Delete from student values(???)");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the StudentID");
	int sid = scan.nextInt();
	
	psmt.setInt(1,sid);
	
	int row_eff = psmt.executeUpdate();
	System.out.println(row_eff+"row effected");
	}
	catch(Exception e)
	{
		System.out.println("Exception Araised"+e);
	}
}
}


//Update Student set Column_name = value where Column_name=value
//Update Stuent set stname = 'SRIDHAR' Where stid=1001