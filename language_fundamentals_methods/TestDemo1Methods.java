package com.language_fundamentals_methods;

public class TestDemo1Methods {
	
	
	void addition(int a, int b) {
	int sum = a+b;
	System.out.println("addition :"+ sum);//30
	subtraction(sum, 20);
	
	}
	
	void subtraction(int sum, int b) {
	int difference = sum -b;
	System.out.println("difference :"+ difference);//10
	multiplication(difference,20);
		
	}

	void multiplication(int difference, int b) {
		int product = difference * b;
		System.out.println("product :"+ product);//200
		division(product,20);
	}
	
	void division(int product, int b) {
	int division = product / 20;
	System.out.println("division :"+ division);//10
	
	}
	
	public static void main(String[] args) {
		
		TestDemo1Methods t = new TestDemo1Methods();
		t.addition(10, 20);
	} 

}
