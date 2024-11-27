package com.employeemanagementsystem;

public class EmployeeManager {

	public Employee createEmployee(int employeeId, String name, double salary, String department) {

		return new Employee(employeeId, name, salary, department);

	}

	public void updateEmployeeName(Employee employee, String newName) {
		employee.setName(newName);
	}

	public void updateEmployeeSalary(Employee employee, double newSalary) {
		employee.setSalary(newSalary);
	}

	public void updateEmployeeDepartment(Employee employee, String newDepartment) {
		employee.setDepartment(newDepartment);
	}

	public void displayEmoployeeInformation(Employee employee) {

		System.out.println("Employee Id: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee Department: " + employee.getDepartment());
		System.out.println("Employee Salary: " + employee.calculateAnnualSalary());
		System.out.println("In Hand Salary Monthly: " + employee.inHandSalary());
		
	}

}
