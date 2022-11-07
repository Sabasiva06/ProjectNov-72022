package com.sample1;
//partial abstraction or Abstract class
public class Staff extends Student{

	@Override
	public void studentMark() {
		
		System.out.println("student mark is 200");
		
	}
	@Override
	public void studentPercentage() {
		
		System.out.println("Student percentage 50%");
		
	}
	public static void main(String[] args) {
		
		Staff st = new Staff();
		st.studentMark();
		st.studentPercentage();
		
		st.studentName();
		st.studentId();
		
	}
}
