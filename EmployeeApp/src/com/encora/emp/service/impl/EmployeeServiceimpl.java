package com.encora.emp.service.impl;
import com.encora.emp.service.*;
import com.encora.emp.dto.EmployeeDTO;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.encora.emp.dto.*;

public class EmployeeServiceimpl implements EmployeeService {

	@Override
	public void saveEmployee(EmployeeDTO empDTO) {
		// TODO Auto-generated method stub
		
		try {
			DriverManager.registerDriver(new Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","root");
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO emp_db.employee_info\n"
					+"(employee_name, gender, pf, graduity, meal_card, nps, mediclaim, office_location)"
					+"VALUES(?, ?, ?, ?, ?, ?, ?, ?);");	
			
			ps.setString(1, empDTO.getEmployeeName());
			ps.setString(2, empDTO.getGender());
			ps.setBoolean(3, empDTO.isPf());
			ps.setBoolean(4, empDTO.isGratutity());
			ps.setBoolean(5, empDTO.isMealcard());
			ps.setBoolean(6, empDTO.isNps());
			ps.setBoolean(7, empDTO.isMediclaim());
			ps.setString(8, empDTO.getOfficelocation());
			ps.execute();
			ps.close();
				
			
//			THIS IS NORMAL STATEMENT
//			java.sql.Statement stmt = con.createStatement();
//			String query = "INSERT INTO emp_db.employee_info\n"
//					+ "(employee_name, gender, pf, graduity, meal_card, nps, mediclaim, office_location)\n" + "VALUES('"
//					+ empDTO.getEmployeeName() + "', '" + empDTO.getGender() + "', " + empDTO.isPf()
//					+ ", " + empDTO.isGratutity() + ", " + empDTO.isMealcard() + ", "+empDTO.isNps()+", "+empDTO.isMediclaim()+"," + "'"
//					+ empDTO.getOfficelocation() + "')";
//			stmt.execute(query);
//			stmt.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
	}

		

	

