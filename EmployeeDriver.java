package com.graymatter;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp; - var,reference to the class, created in stack
		Employee emp=new Employee(); // object space, created in heap
		//  new Employee() ----jvm invokes the default constructor
		emp.setDetails();
		emp.getDetails();
	
		Employee emp1=new Employee("wer",22,333333,"3333333333","qqqqqqqqqqqq");
		emp1.getDetails();
	}
	

}
