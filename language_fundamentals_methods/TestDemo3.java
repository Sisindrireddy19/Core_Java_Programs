package com.language_fundamentals_methods;

public class TestDemo3 {

	int sid;
	String sname;
	long phonenumber;
	// with return type and no parameter
	
	
	  int student_id() {
	  
	  return sid; }
	  
	  String student_Name() {
	  
	  return sname; }
	  
	  long student_phonenumber() {
	  
	  return phonenumber; }
	 
	
	// No return type and no parameter
	void student_info()
	{
		System.out.println("Student Id:"+sid);
		System.out.println("Student Name:"+sname);
		System.out.println("Student Phone Number:"+phonenumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo3 t1=new TestDemo3();
		t1.sid=7742;
		t1.sname="Sisindri";
		t1.phonenumber=1234792509l;
		
		System.out.println("**************** Method with return type and no parameter ***********************");
		System.out.println("Student Id:"+t1.student_id());
		System.out.println("Student Name:"+t1.student_Name());
		System.out.println("Student Phone Number:"+t1.student_phonenumber());
		
		System.out.println("**************** Method no return type and no parameter");
		t1.student_info();
		
	}
	

}
