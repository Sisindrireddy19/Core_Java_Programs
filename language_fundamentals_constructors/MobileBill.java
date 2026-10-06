package language_fundamentals_constructors;

public class MobileBill {
	
	String mobilemodel;
	int quantity;
	double price;
	double deliverycharge;
	double mobilecost;
	double finalbill;
	
	MobileBill()
	{
		this("Iphone");
	}
	MobileBill(String mobilemodel)
	{
		this(mobilemodel,2);
	}
	MobileBill(String mobilemodel,int quantity)
	{
		this(mobilemodel,quantity,500000);
	}
	MobileBill(String mobilemodel,int quantity,double price)
	{
		this(mobilemodel,quantity,price,250);
	}
	MobileBill(String mobilemodel,int quantity,double price,double deliverycharge)
	{
		mobilecost=price * quantity;
		finalbill= mobilecost + deliverycharge;
		
		this.deliverycharge=deliverycharge;
		this.mobilemodel=mobilemodel;
		this.quantity=quantity;
		this.price=price;
		
	}
	void display()
	{
		System.out.println("Mobile Model : "+mobilemodel);
		System.out.println("Mobile Price : "+price);
		System.out.println("Mobile Quantity : "+quantity);
		System.out.println("Mobile Delivery Charge : "+deliverycharge);
		System.out.println("Mobile Cost : "+mobilecost);
		System.out.println("Mobile Final Bill : "+finalbill);
		System.out.println("*************************");
	}

	public static void main(String[] args) {
		
		MobileBill b1=new MobileBill();
		b1.display();
		
		
	}

}
