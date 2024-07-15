package com.graymatter;

import java.util.Scanner;

public class DemoOnIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean flag= false;
//		if(flag==true)
//			System.out.println("hii");
//		else
//			System.out.println("bye");
		//Scanner sc= new Scanner(System.in);
//		int num1,num2;
//		System.out.println("enter two numbers");
//		num1=sc.nextInt();
//		num2=sc.nextInt();
//		if(num1>num2)
//			System.out.println(num1);
//		else
//			System.out.println(num2);

		
//		// even or odd
//		System.out.println("enter a number");
//		int num=sc.nextInt();
//		
//		if(num%2==0)
//			System.out.println("the number is even");
//		else
//			System.out.println("the number is odd");

		//max of 3 numbers
//		int a,b,c;
//		System.out.println("enter 3 numbers");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		if(a>b)
//			if(a>c)
//				System.out.println("max= a");
//			else 
//				System.out.println("max=c");
//		else
//			System.out.println("max=b");
		
		//simple calc
//		Scanner sc= new Scanner(System.in);
//		int a,b;
//		char op;
//		System.out.println("enter 2 numbers");
//		a =sc.nextInt();
//		b =sc.nextInt();
//		System.out.println("enter the operator");
//		op=sc.next().charAt(0); //read a char
//		if(op=='+')
//			System.out.println(a+b);
//		else if(op=='-')
//			System.out.println(a-b);
//		else if(op=='*')
//			System.out.println(a*b);
//		else if(op=='/')
//			System.out.println((float)a/b);
//		else
//			System.out.println("invalid");
		
		System.out.println("STUDENT PROGRESS REPORT");
		Scanner sc= new Scanner(System.in);
		String name;
		int id;
		float m1,m2,m3,total,avg;
		System.out.println("enter ur marks");
		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
		
		total=m1+m2+m3;
		avg=(total/300)*100;
		
		if(avg>=60)
			System.out.println("first class");
		else if(avg>=50 && avg<60)
			System.out.println("second class");
		else if(avg>=40 && avg<50)
			System.out.println("third class");
		else
			System.out.println("fail");
		
	}

}
