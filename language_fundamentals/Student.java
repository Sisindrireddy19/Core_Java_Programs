package com.javaintro;

public class Student {
static int count;
	Student(){
		count++;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
System.out.println(" count :"+ count);
	}

}
