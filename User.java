package com.language_fundamentals;

public class User {

	public static void main(String[] args) {
		
		int total_amount = 100;
		int pencil_cost = 7;
		
	int	pencils = total_amount /pencil_cost;
	int	balance = total_amount % pencil_cost;
	
	System.out.println("total amount with user :"+total_amount);
	System.out.println("each pencil cost :" +pencil_cost);	
	System.out.println("user buy a pencils :" + pencils );
	System.out.println("user has a remaining balance :" + balance );
	
		
		

	}

}
