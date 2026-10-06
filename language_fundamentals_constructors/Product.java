package language_fundamentals_constructors;

public class Product {
	
	    int productid;
		String productname;
		double price;
		int quantity;
		
		Product(int productid,String productname,double price,int quantity){
			
			this.productid = productid;
			this.productname = productname;
			this.price = price;
			this.quantity = quantity;
			
		}
		
		Product(Product p){
			this.productid = p.productid;
			this.productname = p.productname;
			this.price = p.price;
			this.quantity = p.quantity;
			
		}
		
		double calculateTotal() {
			return price * quantity;
			
		}
		
		public static void main(String[] args) {
		 
			Product p1 = new Product(101,"Laptop",50000,2);
			
			Product p2 = new Product( p1);
			
			p2.quantity =3;
			
			System.out.println("p1 Total :"+p1.calculateTotal());
			System.out.println("P2 Total :"+p2.calculateTotal());
		
			System.out.println("P1 Quantity :"+p1.quantity);
			System.out.println("P2 Quantity :"+p2.quantity);
	}

}
