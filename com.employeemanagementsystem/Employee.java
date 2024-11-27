package com.employeemanagementsystem;

public class Employee {
	
	private int employeeId;
	private String name;
	private double salary;
	private String department;
	
	public Employee(int employeeId, String name, double salary, String department) {
		
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double calculateAnnualSalary() {
		return salary*12;
	}
	
	public double inHandSalary() {
		if(calculateAnnualSalary() > 2500000) {
			return calculateAnnualSalary() / 12 * 0.77;
		}else {
			return calculateAnnualSalary() / 12;
		}
	}
}
