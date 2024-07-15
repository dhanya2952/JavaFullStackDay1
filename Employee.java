package com.graymatter;

import java.util.Scanner;

//POJO- Plain Old Java Object- a class without main method
//Driver Class- a class with main method
public class Employee {
	
	//properties,attributes,instance var=obj related var
	String name;
	int id;
	double sal;
	String mobile;
	String email;
	static String companyName; //static var - independent of obj,shared var
	
	public Employee()
	{
		System.out.println("from constructor");
	}
	public Employee(String name, int id, double sal, String mobile, String email) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.mobile = mobile;
		this.email = email;
	}
	public void setDetails()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter emp details -name,id,salary,mobie,email");
		this.name=sc.next();
		this.id=sc.nextInt();
		this.sal=sc.nextDouble();
		this.mobile=sc.next();
		this.email=sc.next();
	}
	
	public void getDetails()
	{
		System.out.println(this.name+""+this.id+""+this.sal+""+this.mobile+""+this.email);
	}
}
