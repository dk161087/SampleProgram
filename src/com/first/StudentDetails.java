package com.first;

public class StudentDetails {
	
	private void studentName() {
		
		System.out.println("Student name is Bala");
	}
	
	private void studentAge() {
		
		System.out.println("Student age is 16");
	}
	
	public static void main(String[] args) {
		
		StudentDetails s = new StudentDetails();
		s.studentName();
		s.studentAge();
	}

}
