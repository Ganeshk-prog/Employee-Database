package com.encora.emp.controller;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.encora.emp.dto.EmployeeDTO;
import com.encora.emp.service.EmployeeService;
import com.encora.emp.service.impl.EmployeeServiceimpl;
import com.encora.emp.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {
	
	EmployeeFrame ef;
	EmployeeService employeeService;
	public EmployeeHandler(EmployeeFrame employeeFrame) {
		ef = employeeFrame;
		employeeService = new EmployeeServiceimpl();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand().toLowerCase();
		EmployeeDTO dto =  getEmployeeData(ef);
		
		switch (action) {
		case "save": 
			employeeService.saveEmployee(dto);
			System.out.println("Save clicked");
			saveOrUdate(dto);
			break;
		
		case "update":
			System.out.println("Update clicked");
			saveOrUdate(dto);
			break;
			
		case "search":
			System.out.println("Search clicked");
			
			break;
			
		case "delete":
			System.out.println("Delete clicked");
			break;
		
		}

	}
	
	private void saveOrUdate(EmployeeDTO dto) {
		// 	THIS WILL SAVE OR UPDATE IN DB
		
	}

	public EmployeeDTO getEmployeeData(EmployeeFrame ef) {
	
		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setEmpID(Integer.parseInt(ef.getEmployeeIdTxt().getText()));
		empDTO.setEmployeeName(ef.getEmployeeNameTxt().getText());
		empDTO.setGender( ef.getGenderGroup().getSelectedCheckbox().getLabel());
		empDTO.setPf(ef.getPfOption().getState());
		empDTO.setGratutity(ef.getGratuatyOption().getState());
		empDTO.setMealcard(ef.getMealcardOption().getState());
		empDTO.setNps(ef.getNpsOption().getState());
		empDTO.setMediclaim(ef.getMediclaimOption().getState());
		empDTO.setOfficelocation(ef.getofficeLocation().getSelectedItem());
		
		System.out.println(empDTO);
		return empDTO;
		
		
//		System.out.println(empID + "NAME: "+ employeeName+"-"+ pf+"-"+ gratutity+"-"+mealcard+"-"+nps+"-"+mediclaim+"-"+officelocation);
		
	}

}
