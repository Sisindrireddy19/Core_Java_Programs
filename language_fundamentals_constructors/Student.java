package language_fundamentals_constructors;

public class Student {
	int sid;
	String sname;
	
   Student(){
	 System.out.println("constructor called");
	 System.out.println();
	 
	 System.out.println("student id :" +sid);
	 System.out.println("student name :" +sname);
	 System.out.println();
   }
   
	public static void main(String[] args) {
		
		Student s = new Student();
		s.sid = 7742;
		s.sname = "sisi";
		
		System.out.println("student id :" +s.sid);
		 System.out.println("student name :" +s.sname);
		 }

        }
