package com.encora.emp;
import java.sql.*;
public class jdbcfst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/firstdb";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url,username,password);
			
			if(con.isClosed()) {
				System.out.println("Connection is closed");
			}
			else {
				System.out.println("connection is created");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
