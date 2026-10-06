package language_fundamentals_constructors;

public class CalledBankAccount {

	long accountnumber;	
	String accountholdername;
	double balance;
	String branch;
	
  CalledBankAccount(long accountnumber,String accountholdername,double balance,String branch){
		
		this.accountnumber = accountnumber;
		this.accountholdername = accountholdername;
		this.balance = balance;
		this.branch = branch;
		
	}
  
  CalledBankAccount(CalledBankAccount b1){
	  
	  this.accountnumber =b1. accountnumber;
	  this.accountholdername = b1.accountholdername;
	  this.balance = b1.balance;
	  this.branch = b1.branch;
	  
  }
	void display() {
		System.out.println("accountnumber :"+accountnumber);
		System.out.println("accountholdername :"+accountholdername);
		System.out.println("balance :"+balance);
		System.out.println("branch :"+branch);
		System.out.println("**************************");
	}
	
	public static void main(String[] args) {
		
		CalledBankAccount a1 = new CalledBankAccount(8765432,"sisi",50000,"kanigiri");
		
		CalledBankAccount a2 = new CalledBankAccount (a1);
		
		a2.branch = "ongole";
		a2.balance = 75000;
		
      System.out.println("original account details");
      System.out.println();
      a1.display(); 
      
      System.out.println("copied account details");
      System.out.println();
      a2.display();
	}

}
