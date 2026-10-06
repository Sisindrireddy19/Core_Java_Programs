package language_fundamentals_constructors;

public class Student1 {
	static int count =0;
	
	Student1(){
		count++;
	}

	public static void main(String[] args) {
		
		 Student1 s1 = new  Student1();
		 Student1 s2 = new  Student1();
		 Student1 s3 = new  Student1();
		 Student1 s4 = new  Student1();
		 
		 System.out.println("No of objects created :"+count);
	}

}
