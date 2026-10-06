package language_fundamentals_constructors;

public class Employee {

// instance variables
	
	String ename;
	int eid;
	double esal;
	
// parameterized constructor
	
	Employee(String ename,int eid,double esal){
		this.ename = ename;
		this.eid = eid;
		this.esal = esal;
	}
   
//  method to display employee details
	
	void display() {
		System.out.println("employee name :"+ename);
		System.out.println("employee id :"+eid);
		System.out.println("employee sal:"+esal);
	}
	public static void main(String[] args) {
// create object and passing employee details
		
		 Employee e1 = new  Employee("sisi",19,45000);
		 
//display employee details
		 e1.display();
		 
	}

}
