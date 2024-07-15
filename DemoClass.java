package com.graymatter;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println("num = "+num);
		boolean flag= false;
		System.out.println(flag);
		
		int num1=8,num2=3;
		System.out.println("sum="+(num1+num2));
		System.out.println("sum="+(num1-num2));
		System.out.println("sum="+(num1*num2));
		System.out.println("sum="+((float)num1/num2));
		System.out.println("sum="+(num1%num2));
		
		//int i=8;
		//i++;//i+i+1
		// int j=i++ post increment, use and inc vv
		
		int a=78,b=56,c=66;
		System.out.println((a>b && a>c) ?a:(b>c ?b:c));

		int e= a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(e);
		
		//swapping using temp
		int temp=a;
		a=b;
		b=temp;
		
		//without temp
		a=a+b;
		b=a-b;
		a=a-b;
		
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.println(a+" "+b+" "+c);
		
		// check num is even or odd
		
			System.out.println((a%2==0)?"even ":"odd");
			
		//bitwise operator
		int n=5,m=3;
		System.out.println(n&m);
		System.out.println(n|m);
		
		int n1=-60;
		System.out.println((n1>>3));
		
		int i=6;
		float f=i; //widening,implicit
		
		float f1=5.6f;
		i=(int)f1; //narrowing,explicit
	}

}
