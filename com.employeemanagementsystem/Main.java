package com.employeemanagementsystem;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee(49321, "Saurabh Mathe", 450000, "Software Engineer");
		
		EmployeeManager em = new EmployeeManager();
		
		em.displayEmoployeeInformation(emp);
		System.out.println();
		
		em.updateEmployeeName(emp, "Saurabh Shantaram Mathe");
		em.updateEmployeeDepartment(emp, "Senior Software Engineer");
		em.displayEmoployeeInformation(emp);
	}

}
