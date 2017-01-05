package com.database;
import java.sql.*;
/*import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;*/

public class ShowTable 
{
	public static void main(String[] args) {
		try
		{
			Class.forName("org.h2.Driver");//load and register
			Connection conn =DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","qwerty@123");//error is here fill the quoted
			Statement stmt = conn.createStatement();//
			ResultSet rs = stmt.executeQuery("select * from student");//fetches the data from the table
			while(rs.next())//to read the data row by row
			{
				System.out.print(rs.getInt(1)+"     ");
				System.out.print(rs.getNString(2)+"     ");
				System.out.println(rs.getNString(3)+"     ");
			}
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Araised"+e);
		}
	}

}
