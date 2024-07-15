package com.graymatter;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1= new Student();
		System.out.println(st1);
		st1.setStudName("Dhanya");
		st1.setId(56);
		st1.setM1(90);
		st1.setM2(80);
		st1.setM3(90);
		System.out.println(st1);
		System.out.println("using getters");
		System.out.println(st1.getStudName());
		System.out.println(st1.getId());
		System.out.println(st1.getM1());
		System.out.println(st1.getM2());
		System.out.println(st1.getM3());
//		float total = st1.getM1()+st1.getM2()+st1.getM3();
//		float avg=(total/300)*100;
		float avg=st1.getAvg();
		float total=st1.getTotal();
		System.out.println("total "+ st1.getTotal()+ "Avg "+st1.getAvg());
		if(avg>=60)
			System.out.println("first class");
		else if(avg>=50 && avg<60)
			System.out.println("second class");
		else if(avg>=40 && avg<50)
			System.out.println("third class");
		else
			System.out.println("fail");

//		Student st2=new Student("amit",123,90,90,90);
//		System.out.println(st2);
//		Student st3=new Student("amrit",124);
//		System.out.println(st3);
	}

}
