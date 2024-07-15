package com.graymatter;

import java.util.*;
public class DemoOnFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=sc.nextInt();
//		for(int i=1;i<=10;i++)
//		{
//			
//			System.out.println(n+"*"+i+"="+n*i);
//		}
		for(int i=1;i<=50;i++)
		{
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}

}
