package com.javaintro;

public class Bankaccount {
	static long Account_Number_generator=23456;
	long Account_Number;
	String Account_Holdername;
	double Account_Balance;
	{
		Account_Number=Account_Number_generator;
		Account_Number_generator++;
		
	}
		
	
void show()
{
System.out.println("Account_Number : "+Account_Number);
System.out.println("Account_Holdername :"+Account_Holdername);
System.out.println("Account_Balance :"+Account_Balance);
System.out.println();
}
	public static void main(String[] args) {
		Bankaccount a = new Bankaccount();
		  a.Account_Holdername ="sisi";
		  a.Account_Balance = 30000;
		  
		  Bankaccount b = new Bankaccount();
		  b.Account_Holdername ="Reddy";
		  b.Account_Balance = 40000;
		  
		  Bankaccount c = new Bankaccount();
		  c.Account_Holdername ="nani";
		  c.Account_Balance = 50000;
		  
		  a.show();
		  b.show();
		  c.show();
	}

}
