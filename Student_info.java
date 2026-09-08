package com.javaintro;

public class Student_info {
	static String collegename ="RGUKT";
	String studentname;
	int studentage;
	
	void display() {
		System.out.println("collegename :"+ collegename);
		System.out.println("studentname:"+ studentname);
		System.out.println("studentage:"+ studentage);
		System.out.println();
	
		}
	

	public static void main(String[] args) {
		Student_info s1 = new Student_info();
		Student_info s2 = new Student_info();
		Student_info s3 = new Student_info();
		
		s1.studentname = "sisi";
		s1.studentage  = 22;
		
		
		s2.studentname = "srinu";
		s2.studentage  = 23;
		
		s3.studentname = "venky";
		s3.studentage  = 22;
		
		s1.display();
		s2.display();
		s3.display();

	}

}
