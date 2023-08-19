package com.encora.emp.dto;

public class EmployeeDTO {
	private int empID;
	
	private String employeeName;
	
	private String gender;
	
	private boolean pf;
	
	private boolean gratutity;
	
	private boolean mealcard;
	
	private boolean nps;
	
	private boolean mediclaim;
	
	private String officelocation;

	
		
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isPf() {
		return pf;
	}
	public void setPf(boolean pf) {
		this.pf = pf;
	}
	public boolean isGratutity() {
		return gratutity;
	}
	public void setGratutity(boolean gratutity) {
		this.gratutity = gratutity;
	}
	public boolean isMealcard() {
		return mealcard;
	}
	public void setMealcard(boolean mealcard) {
		this.mealcard = mealcard;
	}
	public boolean isNps() {
		return nps;
	}
	public void setNps(boolean nps) {
		this.nps = nps;
	}
	public boolean isMediclaim() {
		return mediclaim;
	}
	public void setMediclaim(boolean mediclaim) {
		this.mediclaim = mediclaim;
	}
	public String getOfficelocation() {
		return officelocation;
	}
	public void setOfficelocation(String officelocation) {
		this.officelocation = officelocation;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empID=" + empID + ", employeeName=" + employeeName + ", gender=" + gender + ", pf=" + pf
				+ ", gratutity=" + gratutity + ", mealcard=" + mealcard + ", nps=" + nps + ", mediclaim=" + mediclaim
				+ ", officelocation=" + officelocation + "]";
	}
	
	
	

}
