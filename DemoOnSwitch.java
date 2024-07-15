package com.graymatter;

import java.util.*;

public class DemoOnSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b;
		char op;
		System.out.println("enter 2 numbers");
		a =sc.nextInt();
		b =sc.nextInt();
		System.out.println("enter the operator");
		op=sc.next().charAt(0);
		
		switch(op)
		{
		case '+': System.out.println(a+b);
		break;
		case '-': System.out.println(a-b);
		break;
		case '*': System.out.println(a*b);
		break;
		
		case '/': System.out.println(a/b);
		break;
		default:  System.out.println("invalid");
		//Fall through scenario when break is not specified after a case stmt
		
		}
	}

}
