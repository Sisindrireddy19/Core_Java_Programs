package com.language_fundamentals;

public class TestDataTypes1 {
	//declaration of primitive data types
	//byte = 8 bits
	// -128 -127 -126.......0 1 2 3 4.......126 127
    byte b = (byte) 130;//-126 // converting int to byte will consider as explicit type casting.
	byte b1 = (byte) 257;//1
	
	//short = 2 bytes = 16 bits = 2^15
	//-32768 to 32767
	short s = (short)32768;//explicit type casting.
	short s1 = 32767;
	
	short s2 = b1;//implicit type casting.//convert byte to short
	
	//int = 4 bytes = 32 bits = 2^31
	//-2147483648 to 2147483647
	int i = 2147483647 ;
	
	// the literal 21474836478 of type int is out of range
	int i1 = (int)2147483648L;//explicit type casting. long to int
	
	//long = 8 bytes = 64bits = 2^63
	long l = 2147483648L;
	long l1 = 9223372036854775807L;
	
	//float = 4 bytes = 32 bits = 2^31
	float f = 5.9F;
	float f1 = 56.5432456738F;
	float f2 = 98573444643677437843879847658F;
	
	double d = 56.5432456738D;
	
	//char = 2 bytes = -32767 + 32678 = 65535 ---> 0 to 65535
	// A=65 B=66.......L=76 M=77......Y=89 Z=90
	// a=97 b=98.......m=109 n=110.........z=122
	char c = 'A';// single quote characters
	char c1 = 65;// ASCII values
	
	char c2 = '\u0040';//uni-code values or hex char values
	char c3 = '\u0020';
	char c4= '\u0041';
	char c5= 6754;
	boolean boo = false;
	
	public static void main(String[] args) {
		System.out.println("main method started");
		TestDataTypes1 t1 = new TestDataTypes1();
		
		System.out.println("byte value :"+t1.b);//0
		System.out.println("byte value :"+t1.b1);//0
		
		System.out.println("short value :"+t1.s);//0
		System.out.println("short value :"+t1.s1);//0
		System.out.println("short value :"+t1.s2);//0
		
		System.out.println("integer value :"+t1.i);//0
		
		System.out.println("long value :"+t1.l);//0
		System.out.println("long value :"+t1.l1);//0
		
		System.out.println("float value :"+t1.f);//0.0
		System.out.println("float value :"+t1.f1);//0.0
		System.out.println("float value :"+t1.f2);//0.0
		
		System.out.println("double value :"+t1.d);//0.0
		
		System.out.println("char value :"+t1.c);//
		System.out.println("char value :"+t1.c1);
		System.out.println("char value :"+t1.c2);
		System.out.println("char value :"+t1.c3);
		System.out.println("char value :"+t1.c4);
		System.out.println("char value :"+t1.c5);
		
		if(t1.boo) {
			System.out.println("good morning !");
		}
		
		System.out.println("boolean value :"+t1.boo);//false
		
		
		
	}

}
