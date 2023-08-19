package com.encora.emp.view;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.crypto.SealedObject;

import com.encora.emp.controller.EmployeeHandler;

public class EmployeeFrame extends Frame {
	
	
	private Label employeeIdLbl;
	private TextField employeeIdTxt;
	private Label employeeNameLbl;
	private TextField employeeNameTxt;
	private Label employeeGenderLbl;
	private Checkbox maleOption;
	private Checkbox femaleOption;
	private Checkbox otherOption;
	private Label employeeePerkLbl;
	private Checkbox pfOption;
	private Checkbox gratuatyOption;
	private Checkbox mealcardOption;
	private Checkbox npsOption;
	private Checkbox mediclaimOption;
	private CheckboxGroup genderGroup;
	private Label employeeLocation;
	private Choice officelocation;
	private Button saveButton;
	private Button searchButton;
	private Button updateButton;
	private Button deleteButton;
	private Button firstButton;
	private Button nextButton;
	private Button prevButton;
	private Button lastButton;
	
	public EmployeeFrame() {
		setBounds(50,50,700,500);
		setTitle("Employee Information");
		setVisible(true);
		setLayout(null);
		
		
		genderGroup = new CheckboxGroup();
		
		employeeIdLbl = new Label("Employee Id");
		employeeIdLbl.setBounds(20,50,80,20);
		add(employeeIdLbl);
		
		employeeIdTxt = new TextField();
		employeeIdTxt.setBounds(150,50,100,20);
		add(employeeIdTxt);
		
		employeeNameLbl = new Label("Employee Name");
		employeeNameLbl.setBounds(20,100,120,20);
		add(employeeNameLbl);
		
		employeeNameTxt = new TextField();
		employeeNameTxt.setBounds(150,100,100,20);
		add(employeeNameTxt);
		
		employeeGenderLbl = new Label("Employee Gender");
		employeeGenderLbl.setBounds(20,150,120,20);
		add(employeeGenderLbl);
		
		maleOption = new Checkbox("Male",true,genderGroup);
		maleOption.setBounds(150,150,50,20);
		add(maleOption);
		
		femaleOption = new Checkbox("Female",false,genderGroup);
		femaleOption.setBounds(210,150,60,20);
		add(femaleOption);
		
		otherOption = new Checkbox("Other",false,genderGroup);
		otherOption.setBounds(280,150,70,20);
		add(otherOption);
		
		employeeePerkLbl = new Label("Employee Perk");
		employeeePerkLbl.setBounds(20,200,120,20);
		add(employeeePerkLbl);
		
		pfOption = new Checkbox("Pf");
		pfOption.setBounds(150,200,40,20);
		add(pfOption);
		
		gratuatyOption = new Checkbox("Gratutity");
		gratuatyOption.setBounds(200,200,60,20);
		add(gratuatyOption);
		
		mealcardOption = new Checkbox("Mealcard");
		mealcardOption.setBounds(270,200,70,20);
		add(mealcardOption);
		
		npsOption = new Checkbox("NPS");
		npsOption.setBounds(350,200,40,20);
		add(npsOption);
		
		mediclaimOption = new Checkbox("Mediclaim");
		mediclaimOption.setBounds(400,200,80,20);
		add(mediclaimOption);
		
		employeeLocation = new Label("Employee Office Location");
		employeeLocation.setBounds(20,250,150,20);
		add(employeeLocation);
		
		officelocation = new Choice();
		officelocation.setBounds(190,250,100,20);
		officelocation.add("Pune");
		officelocation.add("Mumbai");
		officelocation.add("Hydrabad");
		officelocation.add("Benguluru");
		add(officelocation);		
		
		saveButton = new Button("Save");
		saveButton.setBounds(50,350,50,20);
		add(saveButton);
		saveButton.addActionListener(new EmployeeHandler(this));
		
		searchButton = new Button("Search");
		searchButton.setBounds(120,350,50,20);
		add(searchButton);
		searchButton.addActionListener(new EmployeeHandler(this));
		
		updateButton = new Button("Update");
		updateButton.setBounds(190,350,50,20);
		add(updateButton);
		updateButton.addActionListener(new EmployeeHandler(this));
		
		deleteButton = new Button("Delete");
		deleteButton.setBounds(260,350,50,20);
		add(deleteButton);
		deleteButton.addActionListener(new EmployeeHandler(this));
		
		firstButton = new Button("First");
		firstButton.setBounds(50,400,50,20);
		add(firstButton);
		
		nextButton = new Button("Next");
		nextButton.setBounds(120,400,50,20);
		add(nextButton);
		
		prevButton = new Button("Previous");
		prevButton.setBounds(190,400,50,20);
		add(prevButton);
		
		lastButton = new Button("Last");
		lastButton.setBounds(260,400,50,20);
		add(lastButton);
		
		
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				EmployeeFrame ef = (EmployeeFrame) e.getSource();
				ef.dispose();
			}
		});
		
	}

	public Label getEmployeeIdLbl() {
		return employeeIdLbl;
	}

	public void setEmployeeIdLbl(Label employeeIdLbl) {
		this.employeeIdLbl = employeeIdLbl;
	}

	public TextField getEmployeeIdTxt() {
		return employeeIdTxt;
	}

	public void setEmployeeIdTxt(TextField employeeIdTxt) {
		this.employeeIdTxt = employeeIdTxt;
	}

	public Label getEmployeeNameLbl() {
		return employeeNameLbl;
	}

	public void setEmployeeNameLbl(Label employeeNameLbl) {
		this.employeeNameLbl = employeeNameLbl;
	}

	public TextField getEmployeeNameTxt() {
		return employeeNameTxt;
	}

	public void setEmployeeNameTxt(TextField employeeNameTxt) {
		this.employeeNameTxt = employeeNameTxt;
	}

	public Label getEmployeeGenderLbl() {
		return employeeGenderLbl;
	}

	public void setEmployeeGenderLbl(Label employeeGenderLbl) {
		this.employeeGenderLbl = employeeGenderLbl;
	}

	public Checkbox getMaleOption() {
		return maleOption;
	}

	public void setMaleOption(Checkbox maleOption) {
		this.maleOption = maleOption;
	}

	public Checkbox getFemaleOption() {
		return femaleOption;
	}

	public void setFemaleOption(Checkbox femaleOption) {
		this.femaleOption = femaleOption;
	}

	public Checkbox getOtherOption() {
		return otherOption;
	}

	public void setOtherOption(Checkbox otherOption) {
		this.otherOption = otherOption;
	}

	public Label getEmployeeePerkLbl() {
		return employeeePerkLbl;
	}

	public void setEmployeeePerkLbl(Label employeeePerkLbl) {
		this.employeeePerkLbl = employeeePerkLbl;
	}

	public Checkbox getPfOption() {
		return pfOption;
	}

	public void setPfOption(Checkbox pfOption) {
		this.pfOption = pfOption;
	}

	public Checkbox getGratuatyOption() {
		return gratuatyOption;
	}

	public void setGratuatyOption(Checkbox gratuatyOption) {
		this.gratuatyOption = gratuatyOption;
	}

	public Checkbox getMealcardOption() {
		return mealcardOption;
	}

	public void setMealcardOption(Checkbox mealcardOption) {
		this.mealcardOption = mealcardOption;
	}

	public Checkbox getNpsOption() {
		return npsOption;
	}

	public void setNpsOption(Checkbox npsOption) {
		this.npsOption = npsOption;
	}

	public Checkbox getMediclaimOption() {
		return mediclaimOption;
	}

	public void setMediclaimOption(Checkbox mediclaimOption) {
		this.mediclaimOption = mediclaimOption;
	}

	public CheckboxGroup getGenderGroup() {
		return genderGroup;
	}

	public void setGenderGroup(CheckboxGroup genderGroup) {
		this.genderGroup = genderGroup;
	}

	public Label getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(Label employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	public Choice getofficeLocation() {
		return officelocation;
	}

	public void setLocation(Choice officelocation) {
		this.officelocation = officelocation;
	}

	public Button getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(Button saveButton) {
		this.saveButton = saveButton;
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(Button searchButton) {
		this.searchButton = searchButton;
	}

	public Button getUpdateButton() {
		return updateButton;
	}

	public void setUpdateButton(Button updateButton) {
		this.updateButton = updateButton;
	}

	public Button getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton(Button deleteButton) {
		this.deleteButton = deleteButton;
	}

	public Button getFirstButton() {
		return firstButton;
	}

	public void setFirstButton(Button firstButton) {
		this.firstButton = firstButton;
	}

	public Button getNextButton() {
		return nextButton;
	}

	public void setNextButton(Button nextButton) {
		this.nextButton = nextButton;
	}

	public Button getPrevButton() {
		return prevButton;
	}

	public void setPrevButton(Button prevButton) {
		this.prevButton = prevButton;
	}

	public Button getLastButton() {
		return lastButton;
	}

	public void setLastButton(Button lastButton) {
		this.lastButton = lastButton;
	}
	
	

}
