package com.practice.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Dbconnection {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url="";
		String user="";
		String password="";
		Class.forName("");
		Connection con=DriverManager.getConnection(url, user, password);
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("");
		
		PreparedStatement pstmt= con.prepareStatement("");
		
		pstmt.setString(1, "");
		
		ResultSet rs1= pstmt.executeQuery();
		
		
		while (rs1.next()) {
			int id = rs1.getInt("id");
	        String firstName = rs1.getString("first_name");
	        String lastName = rs1.getString("last_name");
	        Date dateCreated = rs1.getDate("date_created");
	        boolean isAdmin = rs1.getBoolean("is_admin");
	        int numPoints = rs1.getInt("num_points");
			
		}
		
		stmt.close();
	}

}
