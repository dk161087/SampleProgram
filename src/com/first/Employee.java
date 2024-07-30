package com.first;

public class Employee {
	
	private void empId() {
		
		System.out.println("Employee id is 1234");
	}
	
	private void empName() {
		
		System.out.println("Employee name is Raju");
	}

	private void empDob() {
	
		System.out.println("Employee DOB is 12 Oct 1987");
}

	private void empPhone() {
	
		System.out.println("Employee phone number is 90000 90000");
}

	private void empEmail() {
	
		System.out.println("Employee Email is abcd@gmail.com");
}

	private void empAddress() {
	
		System.out.println("Employee Address is 24, 2nd cross, Anna Nagar, Chennai");
}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
	}

}
