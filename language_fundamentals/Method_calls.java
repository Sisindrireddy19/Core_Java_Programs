package com.javaintro;

public class Method_calls {
	
static void staticmethod1 ()
{
System.out.println("static method 1 called") ;

}
static void staticmethod2 ()
{
	staticmethod1 ();
System.out.println("static method 2 called") ;
}
void instancemethod1()
{
	 staticmethod2 ();
	System.out.println("instance method 1 called") ;
}
void instancemethod2()
{
	instancemethod1();
	System.out.println("instance method 2 called") ;
}
	public static void main(String[] args) {
		
Method_calls m1 = new Method_calls();
m1.instancemethod2();
	}

}
