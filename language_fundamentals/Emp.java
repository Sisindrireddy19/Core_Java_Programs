package com.language_fundamentals;

public class Emp {
	
	int employee_id;
	String employee_name;
	double employee_salary;
	
	void display()
	{
		System.out.println("Emp_id :" +employee_id);
		System.out.println("Emp_name :" +employee_name);
		System.out.println("Emp_salary :" +employee_salary);
		System.out.println();
		
	}

	public static void main(String[] args) {
		
	Emp e1 = new Emp();
	
	 e1.employee_id = 101;
	 e1.employee_name = "sisi";
	 e1.employee_salary =30000;
	 
	 Emp e2 = new Emp();
		
	 e2.employee_id = 102;
	 e2.employee_name = "reddy";
	 e2.employee_salary =35000;
	 
	 Emp e3 = new Emp();
		
	 e3.employee_id = 103;
	 e3.employee_name = "nani";
	 e3.employee_salary =40000;
	 
	 e1.display();
	 e2.display();
	 e3.display();
	 
	  }

}
