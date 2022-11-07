package com.sample2;
//interface or fully abstraction
public class Company implements Employee{

	@Override
	public void empId() {
		
		System.out.println("employee id is 4343");
		
	}
	@Override
	public void empMark() {
		
		System.out.println("employee mark is 400");
		
	}
	@Override
	public void empName() {
		
		System.out.println("employee name is jagan");
		
	}
	public static void main(String[] args) {
		
		Company c = new Company();
		c.empId();
		c.empName();
		c.empMark();
		
	}
}
