package language_fundamentals_constructors;

// this program is default constructor

public class Book {
	
	int bookid;
	String title;
	String author;
	double price;
	
	
	void display() {
		
		System.out.println("book id :"+bookid);
		System.out.println("title :"+title);
		System.out.println("author :"+author);
		System.out.println("price:"+price);
		
	}

	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.bookid =101;
		b.title ="java programming";
		b.author ="james gosling";
		b.price = 650;
	
		b.display();
	}

}
