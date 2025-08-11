package OOPs;
/*
 * Create a Book class with properties like title, author, price, and availability.
Write a program to:

Create three Book objects.

Print details of all books.

Mark one book as unavailable and display the updated details.
 */
public class Book_Class_Obj {

	String title ;
	String author;
	double price;
	boolean available;
	
	public Book_Class_Obj(String title,String author,double price,boolean avaliable) {
		
		this.title=title;
		this.author=author;
		this.price=price;
		this.available=avaliable;
	}
	
	
	
	
	
	public  void details() {
		
		System.out.println("The title ofbook is :"+title);
		System.out.println("The Author Name is :"+author);
		System.out.println("The price of book is :"+price);
		System.out.println("The Available Books are :"+available);
	}
	
	
	public static void main(String args[]) {
		Book_Class_Obj b1=new Book_Class_Obj("Fairy Tale","Ram kumar",500.0,true);
		Book_Class_Obj b2=new Book_Class_Obj("Love is waste","sham kumar",400.90,true);
		Book_Class_Obj b3=new Book_Class_Obj("Sham Chi AAi","hhenna tina",200.00,true);
		
		b1.details();
		b2.details();
		b3.details();
		
		
		// mark one as unavailable
		b2.available=false;
		
		System.out.println("\n The updated Book List : ");
		b1.details();
		b2.details();
		b3.details();
	}
}
