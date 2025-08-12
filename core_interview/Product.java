package OOPs;

/*
 * /*
 * 4. Online Shopping Cart
Question:
Create a Product class with:
productId, productName, price, quantityAvailable.
Write a program to:
Create multiple products.
Allow a customer to “purchase” a product (reduce quantity).
Show product details before and after purchase.
 */
 
public class Product {

	int productId;
	String productName;
	double price;
	int quantityAvailable;
	
	public Product(int productId,String productName,double price,int quantityAvailable) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantityAvailable=quantityAvailable;
	}
	
	void purchase(int qty) {
		if(qty <= quantityAvailable) {
			quantityAvailable -=qty;
			System.out.println(qty + " units of " + productName + " purchased successfully!");
        } else {
            System.out.println(" stock is not  available.");
        }
		}
	
	
	
	
	
	void displayProduct() {
		System.out.println(" ProductId :"+productId+ " Product Name :"+productName+ " Price :"+price+ " QuantityAvailable : "+quantityAvailable);
	}
	
	
	
	public static void main(String args[]) {
		
		Product p1= new Product(001,"Laptop",70000,10);
		Product p2 = new Product(002,"Mobile",45000,5);
		Product p3= new Product(003,"Ear Pod",66000,2);
		Product p4 = new Product(004,"Stationary",200,10);
		
		System.out.println("\n Product before Purchase");
		p1.displayProduct();
		p2.displayProduct();
		p3.displayProduct();
		p4.displayProduct();
		
		
		System.out.println("\n Product After Purchase");
		p1.purchase(2);
		p2.purchase(220);
		
		
	}
}
