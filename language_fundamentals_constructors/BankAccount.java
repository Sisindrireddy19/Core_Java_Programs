package language_fundamentals_constructors;

public class BankAccount {
	
//instance variables
	
	long accountNumber;
	String customerName;
	String accountType;
	double balance;
	
//parameterized constructor
	
  BankAccount(long accountNumber,String customerName,
	String accountType,double balance){
	  
	 this.accountNumber = accountNumber;
	 this.customerName = customerName;
	 this.accountType = accountType;
	 this.balance =balance;
  }
  
// method to display account details
   void display() {
	  System.out.println("accountNumber :"+accountNumber);
	  System.out.println("customerName :"+customerName);
	  System.out.println("accountType :"+accountType);
	  System.out.println("balance :"+balance);
	  System.out.println();
  }
  
  public static void main(String[] args) {
	  
// creating two objects	  
	  BankAccount account1 = new BankAccount(234567787,"Sisi","savings",25000);
			  
		BankAccount account2 = new BankAccount(3245678,"Reddy","current",50000);
		
//display details
		
account1.display();
account2.display();

    }
  }
