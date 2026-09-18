package com.language_fundamentals_methods;

public class BankAccount {
	static int balance =1000;
	
	void deposit(int amount) {
		balance = balance + amount;
		System.out.println("deposit balance :"+amount);	 
		System.out.println("final balance :"+balance);
	}
	
	void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("withdraw balnce :"+amount);
		
	}

	public static void main(String[] args) {
		
		 BankAccount ac = new  BankAccount();
		 System.out.println("Inititial Balance:"+balance);
		 
		 ac.deposit(500);
		 ac.withdraw(300);
		 
	
		 
	System.out.println("final balnce :"+balance);	 
	}

}
