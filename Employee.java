package com.language_fundamentals;

public class Employee {
	
	static final int total_leaves_allocated = 30;
	
	int employeeid;
	byte employeeage ;
	double employeesalry ;
	char employeegrade ;
	float employeeyearsofexperience;
	boolean employeeisactive ;
	short employeenumberoflevels ;
	long employeephonenumber ;
	int total_leaves_used;
	int remaining_leaves = total_leaves_allocated;
	
	void decreament_of_leaves(int leveas_taken)
	{
		
		remaining_leaves =remaining_leaves - leveas_taken;
		total_leaves_used =total_leaves_allocated-remaining_leaves;
		
		System.out.println("employeeid :"+ employeeid);
		System.out.println("employeeage :"+ employeeage);
		System.out.println("employeesalry :"+ employeesalry);
		System.out.println("employeegrade :"+ employeegrade);
		System.out.println("employeeyearsofexperience :" +employeeyearsofexperience );
		System.out.println("employeeisactive:"+ employeeisactive );
		System.out.println("employeenumberoflevels :"+ employeenumberoflevels);
		System.out.println("employeephonenumber:"+ employeephonenumber);
		System.out.println("total_leaves_allocated :" + total_leaves_allocated);
		System.out.println("total_leaves_used :" +total_leaves_used);
		System.out.println("remaining_leaves available :" +remaining_leaves);
		System.out.println();
		
		
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.employeeid = 7422;
		e.employeeage = 27;
		e.employeesalry = 30000;
		e.employeegrade = 'A';
		e.employeeyearsofexperience = 3.5F;
		e.employeeisactive = true;
		e.employeenumberoflevels = 7;
		e.employeephonenumber = 9010889735L;
	
		e.decreament_of_leaves(1);
		e.decreament_of_leaves(3);

	}

}
