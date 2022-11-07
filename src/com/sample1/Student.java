package com.sample1;
//partial abstraction or Abstract class
public abstract class Student {
	
	//Non abstract method
	public void studentId() {
		
		System.out.println("student id is 4343");

	}
	public void studentName() {
		
		System.out.println("student name is hari");

	}
	
	//abstract method
	public abstract void studentMark();
	
	public abstract void studentPercentage();
	
}
