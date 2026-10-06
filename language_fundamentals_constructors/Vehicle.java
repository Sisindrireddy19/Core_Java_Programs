package language_fundamentals_constructors;

public class Vehicle {
	
	String type;
	
	Vehicle(String type)
	{
		this.type=type;
	}
	

  }
class Car extends Vehicle
{
	String brand;
	double price;
	Car(String type,String brand,double price)
	{
		super(type);
		this.type=type;
		this.brand=brand;
		this.price=price;
	}
}

class ElectricCar extends Car
{
	String batterycapacity;
	
	ElectricCar(String type, String brand,double price,String batterycapacity)
	
	{
		super(type,brand,price);
		this.brand=brand;
		this.price=price;
		this.type=type;
		this.batterycapacity=batterycapacity;
	}
	
	void display()
	{
		System.out.println("Type of Car : "+type);
		System.out.println("******************************");

		System.out.println("Brand of Car : "+brand);
		System.out.println("Price of Car : "+price);
		System.out.println("Battery Capacity of Car : "+batterycapacity);
		System.out.println("******************************");
	}
	public static void main(String [] args)
	{
		ElectricCar c1=new ElectricCar("Electric","Tesla",5000000,"50 KWh");
			c1.display();	
	}
}