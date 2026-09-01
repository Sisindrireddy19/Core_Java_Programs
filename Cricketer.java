package com.javaintro;

public class Cricketer {
//Declaration
//static variables
		static int countryId = 100;
		static String countryName= "india";
//instance variables or Non-static variables
		int jerseyNumber = 999;
		String cricketerName = "Unknown";
		public static void main(String[] args) {
			System.out.println("main method strated ");
			System.out.println("Welcome to Indian Cricket Team ");
//Accessing the instance data
//			Note : In static area, We cannot access the instance data directly.
//			CE : Cannot make a static reference to the non-static field jerseyNumber
//			CE : Cannot make a static reference to the non-static field cricketerName
//			If we want to access instance data in static area, we must need to create an Object.
//			Whenever a class does not contain any constructor then Java Compiler will create default constructor.
			System.out.println("Object1 info **************");
			Cricketer msd = new Cricketer();// Object Creation
//Initialization
			Cricketer.countryId = 91;
			Cricketer.countryName = "India";
			msd.jerseyNumber = 7;
			msd.cricketerName = "Mahendra Singh Dhoni ";
//Accessing the static data directly.
			System.out.println("Country ID : " + countryId);
			System.out.println("Country Name: " + countryName);
			System.out.println("Jersey Number : " + msd.jerseyNumber);// 0
			System.out.println("Cricketer Name : " + msd.cricketerName);// null
			System.out.println("Object2 info **************");
			Cricketer vk = new Cricketer();// Object Creation
			vk.jerseyNumber = 18;
			vk.cricketerName = "Virat Kohli";
			System.out.println("Country ID : " + countryId);// 91
			System.out.println("Country Name: " + countryName);// India
			System.out.println("Jersey Number : " + vk.jerseyNumber);// 0
			System.out.println("Cricketer Name : " + vk.cricketerName);// null
			System.out.println("Object3 info **************");
			Cricketer hitman = new Cricketer();// Object Creation
			hitman.jerseyNumber = 45;
			hitman.cricketerName = "Rohit Sharma";
			System.out.println("Country ID : " + countryId);// 91
			System.out.println("Country Name: " + countryName);// India
			System.out.println("Jersey Number : " + hitman.jerseyNumber);// 0
			System.out.println("Cricketer Name : " + hitman.cricketerName);// null
			System.out.println("Object4 info **************");
			Cricketer kl = new Cricketer();// Object Creation
			kl.jerseyNumber = 1;
			kl.cricketerName = "K Lokesh Rahul";
			System.out.println("Country ID : " + countryId);// 91
			System.out.println("Country Name: " + countryName);// India
			System.out.println("Jersey Number : " + kl.jerseyNumber);// 0
			System.out.println("Cricketer Name : " + kl.cricketerName);// null
			System.out.println("Object5 info **************");
			Cricketer vs = new Cricketer();// Object Creation
			vs.jerseyNumber = 3;
			vs.cricketerName = "Vaibhav SooryaVanshi";
			countryId = 92;
			countryName = "Bharath";
			System.out.println("Country ID : " + countryId);
			System.out.println("Country Name: " + countryName);
			System.out.println("Jersey Number : " + vs.jerseyNumber);
			System.out.println("Cricketer Name : " + vs.cricketerName);
			System.out.println("Object6 info **************");
			Cricketer gill = new Cricketer();// Object Creation
			
			gill.countryId = 999;
			gill.countryName = "Sindhoor";
			gill.jerseyNumber = 77;
			gill.cricketerName = "Shubhman Gill";
			System.out.println("Country ID : " + countryId);
			System.out.println("Country Name: " + countryName);
			System.out.println("Jersey Number : " + gill.jerseyNumber);
			System.out.println("Cricketer Name : " + gill.cricketerName);
			System.out.println("Object7 info **************");
			Cricketer sri = new Cricketer();// Object Creation
			System.out.println("Country ID : " + countryId);
			System.out.println("Country Name: " + countryName);
			System.out.println("Jersey Number : " + sri.jerseyNumber);
			System.out.println("Cricketer Name : " + sri.cricketerName);
			System.out.println("main method ended ");
		}


}
